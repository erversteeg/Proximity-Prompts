package com.ericversteeg;

import com.google.common.base.MoreObjects;
import com.google.common.base.Strings;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import net.runelite.client.ui.overlay.components.ComponentConstants;
import net.runelite.client.ui.overlay.components.LayoutableRenderableEntity;
import net.runelite.client.ui.overlay.components.TextComponent;
import net.runelite.client.util.Text;

// from Runelite LineComponent
@Setter
@Builder
public class WeightedLineComponent implements LayoutableRenderableEntity
{
    private String left;
    private String right;

    @Builder.Default
    private Color leftColor = Color.WHITE;

    @Builder.Default
    private Color rightColor = Color.WHITE;

    private Font leftFont;

    private Font rightFont;

    private float leftWeight;

    private float rightWeight;

    private TextAlignment leftAlignment;

    private TextAlignment rightAlignment;

    @Builder.Default
    private Point preferredLocation = new Point();

    @Builder.Default
    private Dimension preferredSize = new Dimension(ComponentConstants.STANDARD_WIDTH, 0);

    @Builder.Default
    @Getter
    private final Rectangle bounds = new Rectangle();

    @Override
    public Dimension render(Graphics2D graphics)
    {
        // Prevent NPEs
        final String left = MoreObjects.firstNonNull(this.left, "");
        final String right = MoreObjects.firstNonNull(this.right, "");

        final Font leftFont = MoreObjects.firstNonNull(this.leftFont, graphics.getFont());
        final Font rightFont = MoreObjects.firstNonNull(this.rightFont, graphics.getFont());
        final FontMetrics lfm = graphics.getFontMetrics(leftFont), rfm = graphics.getFontMetrics(rightFont);
        final int fmHeight = Math.max(lfm.getHeight(), rfm.getHeight());
        final int baseX = preferredLocation.x;
        final int baseY = preferredLocation.y + fmHeight;
        int x = baseX;
        int y = baseY;
        final int leftFullWidth = getLineWidth(left, lfm);
        final int rightFullWidth = getLineWidth(right, rfm);
        final TextComponent textComponent = new TextComponent();

        if (preferredSize.width < leftFullWidth + rightFullWidth)
        {
            int leftSmallWidth = preferredSize.width;
            int rightSmallWidth = 0;

            if (!Strings.isNullOrEmpty(right))
            {
                rightSmallWidth = (preferredSize.width / 3);
                leftSmallWidth -= rightSmallWidth;
            }

            if (leftWeight > 0 && rightWeight > 0)
            {
                leftSmallWidth = (int) (preferredSize.width * leftWeight / (leftWeight + rightWeight));
                rightSmallWidth = (int) (preferredSize.width * rightWeight / (leftWeight + rightWeight));
            }
            else if (leftWeight > 0)
            {
                leftSmallWidth = preferredSize.width - rightFullWidth;
                rightSmallWidth = rightFullWidth;
            }
            else if (rightWeight > 0)
            {
                leftSmallWidth = leftFullWidth;
                rightSmallWidth = preferredSize.width - leftFullWidth;
            }

            final String[] leftSplitLines = lineBreakText(left, leftSmallWidth, lfm);
            final String[] rightSplitLines = lineBreakText(right, rightSmallWidth, rfm);

            int lineCount = Math.max(leftSplitLines.length, rightSplitLines.length);

            for (int i = 0; i < lineCount; i++)
            {
                if (i < leftSplitLines.length)
                {
                    final String leftText = leftSplitLines[i];
                    textComponent.setPosition(new Point(x, y));
                    textComponent.setText(leftText);
                    textComponent.setColor(leftColor);
                    textComponent.setFont(leftFont);
                    textComponent.render(graphics);
                }

                if (i < rightSplitLines.length)
                {
                    final String rightText = rightSplitLines[i];
                    textComponent.setPosition(new Point(x + leftFullWidth + alignmentOffset(rightAlignment, rightText, rfm), y));
                    textComponent.setText(rightText);
                    textComponent.setColor(rightColor);
                    textComponent.setFont(rightFont);
                    textComponent.render(graphics);
                }

                y += fmHeight;
            }

            final Dimension dimension = new Dimension(preferredSize.width, y - baseY);
            bounds.setLocation(preferredLocation);
            bounds.setSize(dimension);
            return dimension;
        }

        if (!left.isEmpty())
        {
            textComponent.setPosition(new Point(x, y));
            textComponent.setText(left);
            textComponent.setColor(leftColor);
            textComponent.setFont(leftFont);
            textComponent.render(graphics);
        }

        if (!right.isEmpty())
        {
            textComponent.setPosition(new Point(x + leftFullWidth + alignmentOffset(rightAlignment, right, rfm), y));
            textComponent.setText(right);
            textComponent.setColor(rightColor);
            textComponent.setFont(rightFont);
            textComponent.render(graphics);
        }

        y += fmHeight;

        final Dimension dimension = new Dimension(preferredSize.width, y - baseY);
        bounds.setLocation(preferredLocation);
        bounds.setSize(dimension);
        return dimension;
    }

    private static int getLineWidth(final String line, final FontMetrics metrics)
    {
        return metrics.stringWidth(Text.removeTags(line));
    }

    private static String[] lineBreakText(String text, int maxWidth, FontMetrics metrics)
    {
        final String[] words = text.split(" ");

        if (words.length == 0)
        {
            return new String[0];
        }

        final StringBuilder wrapped = new StringBuilder(words[0]);
        int spaceLeft = maxWidth - metrics.stringWidth(wrapped.toString());

        for (int i = 1; i < words.length; i++)
        {
            final String word = words[i];
            final int wordLen = metrics.stringWidth(word);
            final int spaceWidth = metrics.stringWidth(" ");

            if (wordLen + spaceWidth > spaceLeft)
            {
                wrapped.append('\n').append(word);
                spaceLeft = maxWidth - wordLen;
            }
            else
            {
                wrapped.append(' ').append(word);
                spaceLeft -= spaceWidth + wordLen;
            }
        }

        return wrapped.toString().split("\n");
    }

    private int alignmentOffset(TextAlignment alignment, String text, FontMetrics fm)
    {
        if (alignment != null)
        {
            switch (alignment)
            {
                case LEADING:
                    return 3;
                case CENTER:
                    return (preferredSize.width - getLineWidth(text, fm)) / 2;
                case TRAILING:
                    return preferredSize.width - getLineWidth(text, fm);
            }
        }
        return preferredSize.width - getLineWidth(text, fm);
    }
}


