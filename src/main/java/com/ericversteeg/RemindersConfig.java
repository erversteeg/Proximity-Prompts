package com.ericversteeg;

import com.ericversteeg.config.AnchorType;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

import java.awt.*;

@ConfigGroup(RemindersConfig.GROUP)
public interface RemindersConfig extends Config {
	String GROUP = "reminders_4";

	@ConfigItem(
			position = 1,
			keyName = "anchorType",
			name = "Anchor",
			description = "Configure anchor."
	)
	default AnchorType anchorType() {
		return AnchorType.TOP_LEFT;
	}

	@ConfigItem(
			position = 2,
			keyName = "anchorX",
			name = "X Position",
			description = "Configure x position relative to anchor."
	)
	default int anchorX() {
		return 10;
	}

	@ConfigItem(
			position = 3,
			keyName = "anchorY",
			name = "Y Position",
			description = "Configures y position relative to anchor."
	)
	default int anchorY() {
		return 120;
	}

	@ConfigItem(
			position = 4,
			keyName = "idFinder",
			name = "Finder",
			description = "Configures whether or not to show ids."
	)
	default boolean idFinder() {
		return false;
	}

	@ConfigItem(
			position = 5,
			keyName = "textSize",
			name = "Text Size",
			description = "Configures the text size."
	)
	default TextSize textSize() {
		return TextSize.SMALL;
	}

	@ConfigItem(
			position = 6,
			keyName = "max",
			name = "Max",
			description = "Configures the max number of reminders."
	)
	default int maxReminders() {
		return 5;
	}

	@ConfigSection(
			name = "Custom Reminders",
			description = "Custom Reminders",
			position = 20,
			closedByDefault = true
	)
	String customReminders = "customRemindersSection";

	@ConfigItem(
			position = 0,
			keyName = "customReminders",
			name = "Json",
			description = "Json array of reminders.",
			section = customReminders

	)
	default String customReminders() {
		return "[\n" +
				"  {\n" +
				"    \"enable\": false,\n" +
				"    \"text\": \"Reminder text.\",\n" +
				"    \"color\": \"#00FFFF\",\n" +
				"    \"times\": [\n" +
				"      \"10:00pm\",\n" +
				"      \"5:30pm-7:00pm\"\n" +
				"    ],\n" +
				"    \"days\": [\n" +
				"      \"Thu\",\n" +
				"      \"Sat\"\n" +
				"    ],\n" +
				"    \"dates\": [\n" +
				"      \"05/30/23\",\n" +
				"      \"10/20\"\n" +
				"    ],\n" +
				"    \"locations\": [\n" +
				"      \"(300, 400)\",\n" +
				"      \"(1000, 750)\"\n" +
				"    ],\n" +
				"    \"radius\": 3,\n" +
				"    \"geofences\": [\n" +
				"      \"(4000, 3000, 4500, 2500)\",\n" +
				"      \"(500, 1000, 1500, 500)\"\n" +
				"    ],\n" +
				"    \"regions\": [\n" +
				"      \"500\",\n" +
				"      \"750\"\n" +
				"    ],\n" +
				"    \"npcs\": [\n" +
				"      \"300\",\n" +
				"      \"400\"\n" +
				"    ],\n" +
				"    \"items\": [\n" +
				"      \"1500\",\n" +
				"      \"2000\"\n" +
				"    ]\n" +
				"  }  \n" +
				"]";
	}

	@ConfigSection(
			name = "Reminder1",
			description = "Reminder 1",
			position = 21,
			closedByDefault = true
	)
	String reminder1= "reminder1";

	@ConfigItem(
			keyName = "enableReminder1",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder1
	)
	default boolean reminder1Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder1Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder1
	)
	default String reminder1Text() { return ""; }

	@ConfigItem(
			keyName = "reminder1Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder1
	)
	default Color reminder1Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder1Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder1
	)
	default String reminder1Times() { return ""; }

	@ConfigItem(
			keyName = "reminder1DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder1
	)
	default String reminder1DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder1Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder1
	)
	default String reminder1Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder1Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder1
	)
	default String reminder1Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder1Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder1
	)
	default String reminder1Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder1Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder1
	)
	default int reminder1Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder1RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder1
	)
	default String reminder1RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder1NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder1
	)
	default String reminder1NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder1ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder1
	)
	default String reminder1ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder2",
			description = "Reminder 2",
			position = 22,
			closedByDefault = true
	)
	String reminder2= "reminder2";

	@ConfigItem(
			keyName = "enableReminder2",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder2
	)
	default boolean reminder2Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder2Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder2
	)
	default String reminder2Text() { return ""; }

	@ConfigItem(
			keyName = "reminder2Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder2
	)
	default Color reminder2Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder2Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder2
	)
	default String reminder2Times() { return ""; }

	@ConfigItem(
			keyName = "reminder2DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder2
	)
	default String reminder2DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder2Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder2
	)
	default String reminder2Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder2Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder2
	)
	default String reminder2Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder2Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder2
	)
	default String reminder2Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder2Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder2
	)
	default int reminder2Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder2RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder2
	)
	default String reminder2RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder2NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder2
	)
	default String reminder2NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder2ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder2
	)
	default String reminder2ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder3",
			description = "Reminder 3",
			position = 23,
			closedByDefault = true
	)
	String reminder3= "reminder3";

	@ConfigItem(
			keyName = "enableReminder3",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder3
	)
	default boolean reminder3Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder3Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder3
	)
	default String reminder3Text() { return ""; }

	@ConfigItem(
			keyName = "reminder3Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder3
	)
	default Color reminder3Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder3Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder3
	)
	default String reminder3Times() { return ""; }

	@ConfigItem(
			keyName = "reminder3DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder3
	)
	default String reminder3DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder3Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder3
	)
	default String reminder3Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder3Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder3
	)
	default String reminder3Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder3Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder3
	)
	default String reminder3Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder3Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder3
	)
	default int reminder3Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder3RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder3
	)
	default String reminder3RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder3NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder3
	)
	default String reminder3NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder3ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder3
	)
	default String reminder3ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder4",
			description = "Reminder 4",
			position = 24,
			closedByDefault = true
	)
	String reminder4= "reminder4";

	@ConfigItem(
			keyName = "enableReminder4",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder4
	)
	default boolean reminder4Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder4Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder4
	)
	default String reminder4Text() { return ""; }

	@ConfigItem(
			keyName = "reminder4Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder4
	)
	default Color reminder4Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder4Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder4
	)
	default String reminder4Times() { return ""; }

	@ConfigItem(
			keyName = "reminder4DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder4
	)
	default String reminder4DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder4Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder4
	)
	default String reminder4Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder4Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder4
	)
	default String reminder4Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder4Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder4
	)
	default String reminder4Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder4Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder4
	)
	default int reminder4Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder4RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder4
	)
	default String reminder4RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder4NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder4
	)
	default String reminder4NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder4ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder4
	)
	default String reminder4ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder5",
			description = "Reminder 5",
			position = 25,
			closedByDefault = true
	)
	String reminder5= "reminder5";

	@ConfigItem(
			keyName = "enableReminder5",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder5
	)
	default boolean reminder5Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder5Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder5
	)
	default String reminder5Text() { return ""; }

	@ConfigItem(
			keyName = "reminder5Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder5
	)
	default Color reminder5Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder5Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder5
	)
	default String reminder5Times() { return ""; }

	@ConfigItem(
			keyName = "reminder5DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder5
	)
	default String reminder5DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder5Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder5
	)
	default String reminder5Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder5Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder5
	)
	default String reminder5Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder5Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder5
	)
	default String reminder5Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder5Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder5
	)
	default int reminder5Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder5RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder5
	)
	default String reminder5RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder5NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder5
	)
	default String reminder5NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder5ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder5
	)
	default String reminder5ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder6",
			description = "Reminder 6",
			position = 26,
			closedByDefault = true
	)
	String reminder6= "reminder6";

	@ConfigItem(
			keyName = "enableReminder6",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder6
	)
	default boolean reminder6Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder6Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder6
	)
	default String reminder6Text() { return ""; }

	@ConfigItem(
			keyName = "reminder6Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder6
	)
	default Color reminder6Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder6Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder6
	)
	default String reminder6Times() { return ""; }

	@ConfigItem(
			keyName = "reminder6DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder6
	)
	default String reminder6DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder6Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder6
	)
	default String reminder6Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder6Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder6
	)
	default String reminder6Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder6Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder6
	)
	default String reminder6Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder6Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder6
	)
	default int reminder6Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder6RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder6
	)
	default String reminder6RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder6NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder6
	)
	default String reminder6NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder6ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder6
	)
	default String reminder6ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder7",
			description = "Reminder 7",
			position = 27,
			closedByDefault = true
	)
	String reminder7= "reminder7";

	@ConfigItem(
			keyName = "enableReminder7",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder7
	)
	default boolean reminder7Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder7Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder7
	)
	default String reminder7Text() { return ""; }

	@ConfigItem(
			keyName = "reminder7Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder7
	)
	default Color reminder7Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder7Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder7
	)
	default String reminder7Times() { return ""; }

	@ConfigItem(
			keyName = "reminder7DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder7
	)
	default String reminder7DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder7Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder7
	)
	default String reminder7Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder7Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder7
	)
	default String reminder7Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder7Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder7
	)
	default String reminder7Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder7Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder7
	)
	default int reminder7Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder7RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder7
	)
	default String reminder7RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder7NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder7
	)
	default String reminder7NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder7ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder7
	)
	default String reminder7ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder8",
			description = "Reminder 8",
			position = 28,
			closedByDefault = true
	)
	String reminder8= "reminder8";

	@ConfigItem(
			keyName = "enableReminder8",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder8
	)
	default boolean reminder8Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder8Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder8
	)
	default String reminder8Text() { return ""; }

	@ConfigItem(
			keyName = "reminder8Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder8
	)
	default Color reminder8Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder8Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder8
	)
	default String reminder8Times() { return ""; }

	@ConfigItem(
			keyName = "reminder8DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder8
	)
	default String reminder8DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder8Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder8
	)
	default String reminder8Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder8Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder8
	)
	default String reminder8Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder8Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder8
	)
	default String reminder8Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder8Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder8
	)
	default int reminder8Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder8RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder8
	)
	default String reminder8RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder8NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder8
	)
	default String reminder8NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder8ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder8
	)
	default String reminder8ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder9",
			description = "Reminder 9",
			position = 29,
			closedByDefault = true
	)
	String reminder9= "reminder9";

	@ConfigItem(
			keyName = "enableReminder9",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder9
	)
	default boolean reminder9Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder9Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder9
	)
	default String reminder9Text() { return ""; }

	@ConfigItem(
			keyName = "reminder9Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder9
	)
	default Color reminder9Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder9Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder9
	)
	default String reminder9Times() { return ""; }

	@ConfigItem(
			keyName = "reminder9DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder9
	)
	default String reminder9DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder9Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder9
	)
	default String reminder9Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder9Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder9
	)
	default String reminder9Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder9Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder9
	)
	default String reminder9Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder9Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder9
	)
	default int reminder9Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder9RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder9
	)
	default String reminder9RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder9NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder9
	)
	default String reminder9NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder9ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder9
	)
	default String reminder9ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder10",
			description = "Reminder 10",
			position = 30,
			closedByDefault = true
	)
	String reminder10= "reminder10";

	@ConfigItem(
			keyName = "enableReminder10",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder10
	)
	default boolean reminder10Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder10Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder10
	)
	default String reminder10Text() { return ""; }

	@ConfigItem(
			keyName = "reminder10Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder10
	)
	default Color reminder10Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder10Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder10
	)
	default String reminder10Times() { return ""; }

	@ConfigItem(
			keyName = "reminder10DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder10
	)
	default String reminder10DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder10Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder10
	)
	default String reminder10Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder10Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder10
	)
	default String reminder10Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder10Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder10
	)
	default String reminder10Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder10Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder10
	)
	default int reminder10Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder10RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder10
	)
	default String reminder10RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder10NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder10
	)
	default String reminder10NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder10ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder10
	)
	default String reminder10ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder11",
			description = "Reminder 11",
			position = 31,
			closedByDefault = true
	)
	String reminder11= "reminder11";

	@ConfigItem(
			keyName = "enableReminder11",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder11
	)
	default boolean reminder11Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder11Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder11
	)
	default String reminder11Text() { return ""; }

	@ConfigItem(
			keyName = "reminder11Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder11
	)
	default Color reminder11Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder11Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder11
	)
	default String reminder11Times() { return ""; }

	@ConfigItem(
			keyName = "reminder11DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder11
	)
	default String reminder11DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder11Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder11
	)
	default String reminder11Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder11Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder11
	)
	default String reminder11Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder11Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder11
	)
	default String reminder11Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder11Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder11
	)
	default int reminder11Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder11RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder11
	)
	default String reminder11RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder11NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder11
	)
	default String reminder11NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder11ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder11
	)
	default String reminder11ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder12",
			description = "Reminder 12",
			position = 32,
			closedByDefault = true
	)
	String reminder12= "reminder12";

	@ConfigItem(
			keyName = "enableReminder12",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder12
	)
	default boolean reminder12Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder12Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder12
	)
	default String reminder12Text() { return ""; }

	@ConfigItem(
			keyName = "reminder12Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder12
	)
	default Color reminder12Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder12Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder12
	)
	default String reminder12Times() { return ""; }

	@ConfigItem(
			keyName = "reminder12DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder12
	)
	default String reminder12DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder12Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder12
	)
	default String reminder12Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder12Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder12
	)
	default String reminder12Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder12Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder12
	)
	default String reminder12Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder12Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder12
	)
	default int reminder12Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder12RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder12
	)
	default String reminder12RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder12NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder12
	)
	default String reminder12NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder12ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder12
	)
	default String reminder12ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder13",
			description = "Reminder 13",
			position = 33,
			closedByDefault = true
	)
	String reminder13= "reminder13";

	@ConfigItem(
			keyName = "enableReminder13",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder13
	)
	default boolean reminder13Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder13Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder13
	)
	default String reminder13Text() { return ""; }

	@ConfigItem(
			keyName = "reminder13Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder13
	)
	default Color reminder13Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder13Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder13
	)
	default String reminder13Times() { return ""; }

	@ConfigItem(
			keyName = "reminder13DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder13
	)
	default String reminder13DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder13Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder13
	)
	default String reminder13Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder13Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder13
	)
	default String reminder13Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder13Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder13
	)
	default String reminder13Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder13Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder13
	)
	default int reminder13Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder13RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder13
	)
	default String reminder13RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder13NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder13
	)
	default String reminder13NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder13ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder13
	)
	default String reminder13ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder14",
			description = "Reminder 14",
			position = 34,
			closedByDefault = true
	)
	String reminder14= "reminder14";

	@ConfigItem(
			keyName = "enableReminder14",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder14
	)
	default boolean reminder14Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder14Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder14
	)
	default String reminder14Text() { return ""; }

	@ConfigItem(
			keyName = "reminder14Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder14
	)
	default Color reminder14Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder14Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder14
	)
	default String reminder14Times() { return ""; }

	@ConfigItem(
			keyName = "reminder14DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder14
	)
	default String reminder14DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder14Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder14
	)
	default String reminder14Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder14Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder14
	)
	default String reminder14Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder14Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder14
	)
	default String reminder14Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder14Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder14
	)
	default int reminder14Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder14RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder14
	)
	default String reminder14RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder14NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder14
	)
	default String reminder14NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder14ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder14
	)
	default String reminder14ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder15",
			description = "Reminder 15",
			position = 35,
			closedByDefault = true
	)
	String reminder15= "reminder15";

	@ConfigItem(
			keyName = "enableReminder15",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder15
	)
	default boolean reminder15Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder15Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder15
	)
	default String reminder15Text() { return ""; }

	@ConfigItem(
			keyName = "reminder15Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder15
	)
	default Color reminder15Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder15Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder15
	)
	default String reminder15Times() { return ""; }

	@ConfigItem(
			keyName = "reminder15DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder15
	)
	default String reminder15DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder15Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder15
	)
	default String reminder15Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder15Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder15
	)
	default String reminder15Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder15Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder15
	)
	default String reminder15Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder15Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder15
	)
	default int reminder15Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder15RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder15
	)
	default String reminder15RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder15NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder15
	)
	default String reminder15NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder15ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder15
	)
	default String reminder15ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder16",
			description = "Reminder 16",
			position = 36,
			closedByDefault = true
	)
	String reminder16= "reminder16";

	@ConfigItem(
			keyName = "enableReminder16",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder16
	)
	default boolean reminder16Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder16Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder16
	)
	default String reminder16Text() { return ""; }

	@ConfigItem(
			keyName = "reminder16Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder16
	)
	default Color reminder16Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder16Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder16
	)
	default String reminder16Times() { return ""; }

	@ConfigItem(
			keyName = "reminder16DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder16
	)
	default String reminder16DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder16Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder16
	)
	default String reminder16Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder16Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder16
	)
	default String reminder16Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder16Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder16
	)
	default String reminder16Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder16Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder16
	)
	default int reminder16Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder16RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder16
	)
	default String reminder16RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder16NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder16
	)
	default String reminder16NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder16ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder16
	)
	default String reminder16ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder17",
			description = "Reminder 17",
			position = 37,
			closedByDefault = true
	)
	String reminder17= "reminder17";

	@ConfigItem(
			keyName = "enableReminder17",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder17
	)
	default boolean reminder17Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder17Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder17
	)
	default String reminder17Text() { return ""; }

	@ConfigItem(
			keyName = "reminder17Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder17
	)
	default Color reminder17Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder17Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder17
	)
	default String reminder17Times() { return ""; }

	@ConfigItem(
			keyName = "reminder17DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder17
	)
	default String reminder17DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder17Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder17
	)
	default String reminder17Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder17Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder17
	)
	default String reminder17Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder17Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder17
	)
	default String reminder17Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder17Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder17
	)
	default int reminder17Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder17RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder17
	)
	default String reminder17RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder17NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder17
	)
	default String reminder17NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder17ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder17
	)
	default String reminder17ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder18",
			description = "Reminder 18",
			position = 38,
			closedByDefault = true
	)
	String reminder18= "reminder18";

	@ConfigItem(
			keyName = "enableReminder18",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder18
	)
	default boolean reminder18Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder18Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder18
	)
	default String reminder18Text() { return ""; }

	@ConfigItem(
			keyName = "reminder18Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder18
	)
	default Color reminder18Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder18Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder18
	)
	default String reminder18Times() { return ""; }

	@ConfigItem(
			keyName = "reminder18DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder18
	)
	default String reminder18DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder18Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder18
	)
	default String reminder18Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder18Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder18
	)
	default String reminder18Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder18Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder18
	)
	default String reminder18Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder18Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder18
	)
	default int reminder18Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder18RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder18
	)
	default String reminder18RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder18NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder18
	)
	default String reminder18NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder18ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder18
	)
	default String reminder18ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder19",
			description = "Reminder 19",
			position = 39,
			closedByDefault = true
	)
	String reminder19= "reminder19";

	@ConfigItem(
			keyName = "enableReminder19",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder19
	)
	default boolean reminder19Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder19Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder19
	)
	default String reminder19Text() { return ""; }

	@ConfigItem(
			keyName = "reminder19Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder19
	)
	default Color reminder19Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder19Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder19
	)
	default String reminder19Times() { return ""; }

	@ConfigItem(
			keyName = "reminder19DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder19
	)
	default String reminder19DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder19Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder19
	)
	default String reminder19Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder19Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder19
	)
	default String reminder19Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder19Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder19
	)
	default String reminder19Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder19Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder19
	)
	default int reminder19Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder19RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder19
	)
	default String reminder19RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder19NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder19
	)
	default String reminder19NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder19ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder19
	)
	default String reminder19ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder20",
			description = "Reminder 20",
			position = 40,
			closedByDefault = true
	)
	String reminder20= "reminder20";

	@ConfigItem(
			keyName = "enableReminder20",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder20
	)
	default boolean reminder20Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder20Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder20
	)
	default String reminder20Text() { return ""; }

	@ConfigItem(
			keyName = "reminder20Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder20
	)
	default Color reminder20Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder20Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder20
	)
	default String reminder20Times() { return ""; }

	@ConfigItem(
			keyName = "reminder20DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder20
	)
	default String reminder20DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder20Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder20
	)
	default String reminder20Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder20Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder20
	)
	default String reminder20Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder20Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder20
	)
	default String reminder20Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder20Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder20
	)
	default int reminder20Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder20RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder20
	)
	default String reminder20RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder20NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder20
	)
	default String reminder20NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder20ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder20
	)
	default String reminder20ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder21",
			description = "Reminder 21",
			position = 41,
			closedByDefault = true
	)
	String reminder21= "reminder21";

	@ConfigItem(
			keyName = "enableReminder21",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder21
	)
	default boolean reminder21Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder21Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder21
	)
	default String reminder21Text() { return ""; }

	@ConfigItem(
			keyName = "reminder21Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder21
	)
	default Color reminder21Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder21Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder21
	)
	default String reminder21Times() { return ""; }

	@ConfigItem(
			keyName = "reminder21DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder21
	)
	default String reminder21DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder21Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder21
	)
	default String reminder21Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder21Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder21
	)
	default String reminder21Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder21Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder21
	)
	default String reminder21Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder21Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder21
	)
	default int reminder21Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder21RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder21
	)
	default String reminder21RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder21NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder21
	)
	default String reminder21NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder21ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder21
	)
	default String reminder21ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder22",
			description = "Reminder 22",
			position = 42,
			closedByDefault = true
	)
	String reminder22= "reminder22";

	@ConfigItem(
			keyName = "enableReminder22",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder22
	)
	default boolean reminder22Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder22Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder22
	)
	default String reminder22Text() { return ""; }

	@ConfigItem(
			keyName = "reminder22Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder22
	)
	default Color reminder22Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder22Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder22
	)
	default String reminder22Times() { return ""; }

	@ConfigItem(
			keyName = "reminder22DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder22
	)
	default String reminder22DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder22Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder22
	)
	default String reminder22Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder22Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder22
	)
	default String reminder22Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder22Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder22
	)
	default String reminder22Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder22Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder22
	)
	default int reminder22Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder22RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder22
	)
	default String reminder22RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder22NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder22
	)
	default String reminder22NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder22ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder22
	)
	default String reminder22ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder23",
			description = "Reminder 23",
			position = 43,
			closedByDefault = true
	)
	String reminder23= "reminder23";

	@ConfigItem(
			keyName = "enableReminder23",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder23
	)
	default boolean reminder23Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder23Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder23
	)
	default String reminder23Text() { return ""; }

	@ConfigItem(
			keyName = "reminder23Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder23
	)
	default Color reminder23Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder23Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder23
	)
	default String reminder23Times() { return ""; }

	@ConfigItem(
			keyName = "reminder23DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder23
	)
	default String reminder23DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder23Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder23
	)
	default String reminder23Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder23Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder23
	)
	default String reminder23Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder23Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder23
	)
	default String reminder23Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder23Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder23
	)
	default int reminder23Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder23RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder23
	)
	default String reminder23RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder23NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder23
	)
	default String reminder23NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder23ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder23
	)
	default String reminder23ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder24",
			description = "Reminder 24",
			position = 44,
			closedByDefault = true
	)
	String reminder24= "reminder24";

	@ConfigItem(
			keyName = "enableReminder24",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder24
	)
	default boolean reminder24Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder24Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder24
	)
	default String reminder24Text() { return ""; }

	@ConfigItem(
			keyName = "reminder24Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder24
	)
	default Color reminder24Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder24Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder24
	)
	default String reminder24Times() { return ""; }

	@ConfigItem(
			keyName = "reminder24DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder24
	)
	default String reminder24DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder24Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder24
	)
	default String reminder24Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder24Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder24
	)
	default String reminder24Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder24Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder24
	)
	default String reminder24Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder24Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder24
	)
	default int reminder24Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder24RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder24
	)
	default String reminder24RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder24NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder24
	)
	default String reminder24NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder24ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder24
	)
	default String reminder24ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder25",
			description = "Reminder 25",
			position = 45,
			closedByDefault = true
	)
	String reminder25= "reminder25";

	@ConfigItem(
			keyName = "enableReminder25",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder25
	)
	default boolean reminder25Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder25Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder25
	)
	default String reminder25Text() { return ""; }

	@ConfigItem(
			keyName = "reminder25Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder25
	)
	default Color reminder25Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder25Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder25
	)
	default String reminder25Times() { return ""; }

	@ConfigItem(
			keyName = "reminder25DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder25
	)
	default String reminder25DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder25Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder25
	)
	default String reminder25Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder25Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder25
	)
	default String reminder25Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder25Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder25
	)
	default String reminder25Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder25Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder25
	)
	default int reminder25Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder25RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder25
	)
	default String reminder25RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder25NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder25
	)
	default String reminder25NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder25ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder25
	)
	default String reminder25ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder26",
			description = "Reminder 26",
			position = 46,
			closedByDefault = true
	)
	String reminder26= "reminder26";

	@ConfigItem(
			keyName = "enableReminder26",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder26
	)
	default boolean reminder26Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder26Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder26
	)
	default String reminder26Text() { return ""; }

	@ConfigItem(
			keyName = "reminder26Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder26
	)
	default Color reminder26Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder26Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder26
	)
	default String reminder26Times() { return ""; }

	@ConfigItem(
			keyName = "reminder26DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder26
	)
	default String reminder26DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder26Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder26
	)
	default String reminder26Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder26Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder26
	)
	default String reminder26Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder26Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder26
	)
	default String reminder26Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder26Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder26
	)
	default int reminder26Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder26RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder26
	)
	default String reminder26RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder26NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder26
	)
	default String reminder26NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder26ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder26
	)
	default String reminder26ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder27",
			description = "Reminder 27",
			position = 47,
			closedByDefault = true
	)
	String reminder27= "reminder27";

	@ConfigItem(
			keyName = "enableReminder27",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder27
	)
	default boolean reminder27Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder27Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder27
	)
	default String reminder27Text() { return ""; }

	@ConfigItem(
			keyName = "reminder27Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder27
	)
	default Color reminder27Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder27Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder27
	)
	default String reminder27Times() { return ""; }

	@ConfigItem(
			keyName = "reminder27DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder27
	)
	default String reminder27DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder27Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder27
	)
	default String reminder27Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder27Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder27
	)
	default String reminder27Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder27Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder27
	)
	default String reminder27Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder27Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder27
	)
	default int reminder27Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder27RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder27
	)
	default String reminder27RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder27NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder27
	)
	default String reminder27NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder27ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder27
	)
	default String reminder27ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder28",
			description = "Reminder 28",
			position = 48,
			closedByDefault = true
	)
	String reminder28= "reminder28";

	@ConfigItem(
			keyName = "enableReminder28",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder28
	)
	default boolean reminder28Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder28Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder28
	)
	default String reminder28Text() { return ""; }

	@ConfigItem(
			keyName = "reminder28Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder28
	)
	default Color reminder28Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder28Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder28
	)
	default String reminder28Times() { return ""; }

	@ConfigItem(
			keyName = "reminder28DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder28
	)
	default String reminder28DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder28Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder28
	)
	default String reminder28Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder28Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder28
	)
	default String reminder28Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder28Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder28
	)
	default String reminder28Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder28Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder28
	)
	default int reminder28Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder28RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder28
	)
	default String reminder28RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder28NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder28
	)
	default String reminder28NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder28ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder28
	)
	default String reminder28ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder29",
			description = "Reminder 29",
			position = 49,
			closedByDefault = true
	)
	String reminder29= "reminder29";

	@ConfigItem(
			keyName = "enableReminder29",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder29
	)
	default boolean reminder29Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder29Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder29
	)
	default String reminder29Text() { return ""; }

	@ConfigItem(
			keyName = "reminder29Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder29
	)
	default Color reminder29Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder29Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder29
	)
	default String reminder29Times() { return ""; }

	@ConfigItem(
			keyName = "reminder29DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder29
	)
	default String reminder29DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder29Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder29
	)
	default String reminder29Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder29Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder29
	)
	default String reminder29Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder29Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder29
	)
	default String reminder29Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder29Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder29
	)
	default int reminder29Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder29RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder29
	)
	default String reminder29RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder29NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder29
	)
	default String reminder29NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder29ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder29
	)
	default String reminder29ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder30",
			description = "Reminder 30",
			position = 50,
			closedByDefault = true
	)
	String reminder30= "reminder30";

	@ConfigItem(
			keyName = "enableReminder30",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder30
	)
	default boolean reminder30Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder30Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder30
	)
	default String reminder30Text() { return ""; }

	@ConfigItem(
			keyName = "reminder30Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder30
	)
	default Color reminder30Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder30Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder30
	)
	default String reminder30Times() { return ""; }

	@ConfigItem(
			keyName = "reminder30DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder30
	)
	default String reminder30DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder30Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder30
	)
	default String reminder30Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder30Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder30
	)
	default String reminder30Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder30Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder30
	)
	default String reminder30Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder30Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder30
	)
	default int reminder30Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder30RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder30
	)
	default String reminder30RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder30NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder30
	)
	default String reminder30NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder30ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder30
	)
	default String reminder30ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder31",
			description = "Reminder 31",
			position = 51,
			closedByDefault = true
	)
	String reminder31= "reminder31";

	@ConfigItem(
			keyName = "enableReminder31",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder31
	)
	default boolean reminder31Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder31Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder31
	)
	default String reminder31Text() { return ""; }

	@ConfigItem(
			keyName = "reminder31Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder31
	)
	default Color reminder31Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder31Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder31
	)
	default String reminder31Times() { return ""; }

	@ConfigItem(
			keyName = "reminder31DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder31
	)
	default String reminder31DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder31Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder31
	)
	default String reminder31Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder31Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder31
	)
	default String reminder31Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder31Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder31
	)
	default String reminder31Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder31Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder31
	)
	default int reminder31Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder31RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder31
	)
	default String reminder31RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder31NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder31
	)
	default String reminder31NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder31ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder31
	)
	default String reminder31ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder32",
			description = "Reminder 32",
			position = 52,
			closedByDefault = true
	)
	String reminder32= "reminder32";

	@ConfigItem(
			keyName = "enableReminder32",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder32
	)
	default boolean reminder32Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder32Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder32
	)
	default String reminder32Text() { return ""; }

	@ConfigItem(
			keyName = "reminder32Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder32
	)
	default Color reminder32Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder32Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder32
	)
	default String reminder32Times() { return ""; }

	@ConfigItem(
			keyName = "reminder32DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder32
	)
	default String reminder32DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder32Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder32
	)
	default String reminder32Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder32Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder32
	)
	default String reminder32Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder32Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder32
	)
	default String reminder32Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder32Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder32
	)
	default int reminder32Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder32RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder32
	)
	default String reminder32RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder32NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder32
	)
	default String reminder32NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder32ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder32
	)
	default String reminder32ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder33",
			description = "Reminder 33",
			position = 53,
			closedByDefault = true
	)
	String reminder33= "reminder33";

	@ConfigItem(
			keyName = "enableReminder33",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder33
	)
	default boolean reminder33Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder33Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder33
	)
	default String reminder33Text() { return ""; }

	@ConfigItem(
			keyName = "reminder33Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder33
	)
	default Color reminder33Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder33Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder33
	)
	default String reminder33Times() { return ""; }

	@ConfigItem(
			keyName = "reminder33DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder33
	)
	default String reminder33DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder33Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder33
	)
	default String reminder33Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder33Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder33
	)
	default String reminder33Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder33Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder33
	)
	default String reminder33Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder33Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder33
	)
	default int reminder33Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder33RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder33
	)
	default String reminder33RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder33NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder33
	)
	default String reminder33NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder33ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder33
	)
	default String reminder33ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder34",
			description = "Reminder 34",
			position = 54,
			closedByDefault = true
	)
	String reminder34= "reminder34";

	@ConfigItem(
			keyName = "enableReminder34",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder34
	)
	default boolean reminder34Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder34Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder34
	)
	default String reminder34Text() { return ""; }

	@ConfigItem(
			keyName = "reminder34Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder34
	)
	default Color reminder34Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder34Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder34
	)
	default String reminder34Times() { return ""; }

	@ConfigItem(
			keyName = "reminder34DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder34
	)
	default String reminder34DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder34Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder34
	)
	default String reminder34Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder34Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder34
	)
	default String reminder34Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder34Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder34
	)
	default String reminder34Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder34Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder34
	)
	default int reminder34Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder34RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder34
	)
	default String reminder34RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder34NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder34
	)
	default String reminder34NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder34ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder34
	)
	default String reminder34ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder35",
			description = "Reminder 35",
			position = 55,
			closedByDefault = true
	)
	String reminder35= "reminder35";

	@ConfigItem(
			keyName = "enableReminder35",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder35
	)
	default boolean reminder35Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder35Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder35
	)
	default String reminder35Text() { return ""; }

	@ConfigItem(
			keyName = "reminder35Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder35
	)
	default Color reminder35Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder35Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder35
	)
	default String reminder35Times() { return ""; }

	@ConfigItem(
			keyName = "reminder35DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder35
	)
	default String reminder35DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder35Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder35
	)
	default String reminder35Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder35Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder35
	)
	default String reminder35Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder35Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder35
	)
	default String reminder35Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder35Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder35
	)
	default int reminder35Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder35RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder35
	)
	default String reminder35RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder35NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder35
	)
	default String reminder35NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder35ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder35
	)
	default String reminder35ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder36",
			description = "Reminder 36",
			position = 56,
			closedByDefault = true
	)
	String reminder36= "reminder36";

	@ConfigItem(
			keyName = "enableReminder36",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder36
	)
	default boolean reminder36Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder36Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder36
	)
	default String reminder36Text() { return ""; }

	@ConfigItem(
			keyName = "reminder36Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder36
	)
	default Color reminder36Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder36Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder36
	)
	default String reminder36Times() { return ""; }

	@ConfigItem(
			keyName = "reminder36DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder36
	)
	default String reminder36DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder36Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder36
	)
	default String reminder36Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder36Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder36
	)
	default String reminder36Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder36Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder36
	)
	default String reminder36Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder36Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder36
	)
	default int reminder36Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder36RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder36
	)
	default String reminder36RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder36NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder36
	)
	default String reminder36NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder36ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder36
	)
	default String reminder36ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder37",
			description = "Reminder 37",
			position = 57,
			closedByDefault = true
	)
	String reminder37= "reminder37";

	@ConfigItem(
			keyName = "enableReminder37",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder37
	)
	default boolean reminder37Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder37Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder37
	)
	default String reminder37Text() { return ""; }

	@ConfigItem(
			keyName = "reminder37Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder37
	)
	default Color reminder37Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder37Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder37
	)
	default String reminder37Times() { return ""; }

	@ConfigItem(
			keyName = "reminder37DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder37
	)
	default String reminder37DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder37Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder37
	)
	default String reminder37Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder37Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder37
	)
	default String reminder37Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder37Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder37
	)
	default String reminder37Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder37Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder37
	)
	default int reminder37Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder37RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder37
	)
	default String reminder37RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder37NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder37
	)
	default String reminder37NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder37ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder37
	)
	default String reminder37ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder38",
			description = "Reminder 38",
			position = 58,
			closedByDefault = true
	)
	String reminder38= "reminder38";

	@ConfigItem(
			keyName = "enableReminder38",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder38
	)
	default boolean reminder38Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder38Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder38
	)
	default String reminder38Text() { return ""; }

	@ConfigItem(
			keyName = "reminder38Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder38
	)
	default Color reminder38Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder38Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder38
	)
	default String reminder38Times() { return ""; }

	@ConfigItem(
			keyName = "reminder38DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder38
	)
	default String reminder38DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder38Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder38
	)
	default String reminder38Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder38Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder38
	)
	default String reminder38Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder38Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder38
	)
	default String reminder38Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder38Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder38
	)
	default int reminder38Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder38RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder38
	)
	default String reminder38RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder38NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder38
	)
	default String reminder38NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder38ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder38
	)
	default String reminder38ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder39",
			description = "Reminder 39",
			position = 59,
			closedByDefault = true
	)
	String reminder39= "reminder39";

	@ConfigItem(
			keyName = "enableReminder39",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder39
	)
	default boolean reminder39Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder39Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder39
	)
	default String reminder39Text() { return ""; }

	@ConfigItem(
			keyName = "reminder39Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder39
	)
	default Color reminder39Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder39Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder39
	)
	default String reminder39Times() { return ""; }

	@ConfigItem(
			keyName = "reminder39DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder39
	)
	default String reminder39DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder39Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder39
	)
	default String reminder39Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder39Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder39
	)
	default String reminder39Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder39Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder39
	)
	default String reminder39Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder39Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder39
	)
	default int reminder39Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder39RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder39
	)
	default String reminder39RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder39NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder39
	)
	default String reminder39NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder39ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder39
	)
	default String reminder39ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder40",
			description = "Reminder 40",
			position = 60,
			closedByDefault = true
	)
	String reminder40= "reminder40";

	@ConfigItem(
			keyName = "enableReminder40",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder40
	)
	default boolean reminder40Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder40Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder40
	)
	default String reminder40Text() { return ""; }

	@ConfigItem(
			keyName = "reminder40Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder40
	)
	default Color reminder40Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder40Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder40
	)
	default String reminder40Times() { return ""; }

	@ConfigItem(
			keyName = "reminder40DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder40
	)
	default String reminder40DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder40Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder40
	)
	default String reminder40Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder40Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder40
	)
	default String reminder40Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder40Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder40
	)
	default String reminder40Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder40Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder40
	)
	default int reminder40Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder40RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder40
	)
	default String reminder40RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder40NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder40
	)
	default String reminder40NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder40ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder40
	)
	default String reminder40ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder41",
			description = "Reminder 41",
			position = 61,
			closedByDefault = true
	)
	String reminder41= "reminder41";

	@ConfigItem(
			keyName = "enableReminder41",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder41
	)
	default boolean reminder41Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder41Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder41
	)
	default String reminder41Text() { return ""; }

	@ConfigItem(
			keyName = "reminder41Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder41
	)
	default Color reminder41Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder41Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder41
	)
	default String reminder41Times() { return ""; }

	@ConfigItem(
			keyName = "reminder41DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder41
	)
	default String reminder41DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder41Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder41
	)
	default String reminder41Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder41Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder41
	)
	default String reminder41Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder41Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder41
	)
	default String reminder41Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder41Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder41
	)
	default int reminder41Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder41RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder41
	)
	default String reminder41RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder41NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder41
	)
	default String reminder41NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder41ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder41
	)
	default String reminder41ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder42",
			description = "Reminder 42",
			position = 62,
			closedByDefault = true
	)
	String reminder42= "reminder42";

	@ConfigItem(
			keyName = "enableReminder42",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder42
	)
	default boolean reminder42Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder42Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder42
	)
	default String reminder42Text() { return ""; }

	@ConfigItem(
			keyName = "reminder42Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder42
	)
	default Color reminder42Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder42Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder42
	)
	default String reminder42Times() { return ""; }

	@ConfigItem(
			keyName = "reminder42DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder42
	)
	default String reminder42DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder42Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder42
	)
	default String reminder42Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder42Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder42
	)
	default String reminder42Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder42Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder42
	)
	default String reminder42Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder42Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder42
	)
	default int reminder42Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder42RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder42
	)
	default String reminder42RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder42NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder42
	)
	default String reminder42NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder42ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder42
	)
	default String reminder42ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder43",
			description = "Reminder 43",
			position = 63,
			closedByDefault = true
	)
	String reminder43= "reminder43";

	@ConfigItem(
			keyName = "enableReminder43",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder43
	)
	default boolean reminder43Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder43Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder43
	)
	default String reminder43Text() { return ""; }

	@ConfigItem(
			keyName = "reminder43Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder43
	)
	default Color reminder43Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder43Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder43
	)
	default String reminder43Times() { return ""; }

	@ConfigItem(
			keyName = "reminder43DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder43
	)
	default String reminder43DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder43Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder43
	)
	default String reminder43Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder43Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder43
	)
	default String reminder43Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder43Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder43
	)
	default String reminder43Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder43Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder43
	)
	default int reminder43Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder43RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder43
	)
	default String reminder43RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder43NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder43
	)
	default String reminder43NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder43ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder43
	)
	default String reminder43ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder44",
			description = "Reminder 44",
			position = 64,
			closedByDefault = true
	)
	String reminder44= "reminder44";

	@ConfigItem(
			keyName = "enableReminder44",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder44
	)
	default boolean reminder44Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder44Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder44
	)
	default String reminder44Text() { return ""; }

	@ConfigItem(
			keyName = "reminder44Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder44
	)
	default Color reminder44Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder44Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder44
	)
	default String reminder44Times() { return ""; }

	@ConfigItem(
			keyName = "reminder44DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder44
	)
	default String reminder44DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder44Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder44
	)
	default String reminder44Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder44Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder44
	)
	default String reminder44Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder44Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder44
	)
	default String reminder44Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder44Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder44
	)
	default int reminder44Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder44RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder44
	)
	default String reminder44RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder44NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder44
	)
	default String reminder44NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder44ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder44
	)
	default String reminder44ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder45",
			description = "Reminder 45",
			position = 65,
			closedByDefault = true
	)
	String reminder45= "reminder45";

	@ConfigItem(
			keyName = "enableReminder45",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder45
	)
	default boolean reminder45Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder45Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder45
	)
	default String reminder45Text() { return ""; }

	@ConfigItem(
			keyName = "reminder45Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder45
	)
	default Color reminder45Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder45Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder45
	)
	default String reminder45Times() { return ""; }

	@ConfigItem(
			keyName = "reminder45DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder45
	)
	default String reminder45DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder45Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder45
	)
	default String reminder45Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder45Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder45
	)
	default String reminder45Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder45Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder45
	)
	default String reminder45Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder45Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder45
	)
	default int reminder45Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder45RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder45
	)
	default String reminder45RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder45NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder45
	)
	default String reminder45NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder45ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder45
	)
	default String reminder45ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder46",
			description = "Reminder 46",
			position = 66,
			closedByDefault = true
	)
	String reminder46= "reminder46";

	@ConfigItem(
			keyName = "enableReminder46",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder46
	)
	default boolean reminder46Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder46Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder46
	)
	default String reminder46Text() { return ""; }

	@ConfigItem(
			keyName = "reminder46Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder46
	)
	default Color reminder46Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder46Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder46
	)
	default String reminder46Times() { return ""; }

	@ConfigItem(
			keyName = "reminder46DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder46
	)
	default String reminder46DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder46Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder46
	)
	default String reminder46Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder46Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder46
	)
	default String reminder46Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder46Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder46
	)
	default String reminder46Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder46Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder46
	)
	default int reminder46Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder46RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder46
	)
	default String reminder46RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder46NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder46
	)
	default String reminder46NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder46ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder46
	)
	default String reminder46ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder47",
			description = "Reminder 47",
			position = 67,
			closedByDefault = true
	)
	String reminder47= "reminder47";

	@ConfigItem(
			keyName = "enableReminder47",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder47
	)
	default boolean reminder47Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder47Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder47
	)
	default String reminder47Text() { return ""; }

	@ConfigItem(
			keyName = "reminder47Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder47
	)
	default Color reminder47Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder47Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder47
	)
	default String reminder47Times() { return ""; }

	@ConfigItem(
			keyName = "reminder47DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder47
	)
	default String reminder47DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder47Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder47
	)
	default String reminder47Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder47Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder47
	)
	default String reminder47Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder47Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder47
	)
	default String reminder47Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder47Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder47
	)
	default int reminder47Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder47RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder47
	)
	default String reminder47RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder47NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder47
	)
	default String reminder47NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder47ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder47
	)
	default String reminder47ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder48",
			description = "Reminder 48",
			position = 68,
			closedByDefault = true
	)
	String reminder48= "reminder48";

	@ConfigItem(
			keyName = "enableReminder48",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder48
	)
	default boolean reminder48Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder48Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder48
	)
	default String reminder48Text() { return ""; }

	@ConfigItem(
			keyName = "reminder48Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder48
	)
	default Color reminder48Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder48Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder48
	)
	default String reminder48Times() { return ""; }

	@ConfigItem(
			keyName = "reminder48DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder48
	)
	default String reminder48DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder48Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder48
	)
	default String reminder48Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder48Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder48
	)
	default String reminder48Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder48Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder48
	)
	default String reminder48Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder48Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder48
	)
	default int reminder48Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder48RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder48
	)
	default String reminder48RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder48NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder48
	)
	default String reminder48NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder48ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder48
	)
	default String reminder48ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder49",
			description = "Reminder 49",
			position = 69,
			closedByDefault = true
	)
	String reminder49= "reminder49";

	@ConfigItem(
			keyName = "enableReminder49",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder49
	)
	default boolean reminder49Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder49Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder49
	)
	default String reminder49Text() { return ""; }

	@ConfigItem(
			keyName = "reminder49Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder49
	)
	default Color reminder49Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder49Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder49
	)
	default String reminder49Times() { return ""; }

	@ConfigItem(
			keyName = "reminder49DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder49
	)
	default String reminder49DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder49Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder49
	)
	default String reminder49Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder49Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder49
	)
	default String reminder49Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder49Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder49
	)
	default String reminder49Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder49Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder49
	)
	default int reminder49Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder49RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder49
	)
	default String reminder49RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder49NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder49
	)
	default String reminder49NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder49ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder49
	)
	default String reminder49ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder50",
			description = "Reminder 50",
			position = 70,
			closedByDefault = true
	)
	String reminder50= "reminder50";

	@ConfigItem(
			keyName = "enableReminder50",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder50
	)
	default boolean reminder50Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder50Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder50
	)
	default String reminder50Text() { return ""; }

	@ConfigItem(
			keyName = "reminder50Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder50
	)
	default Color reminder50Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder50Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder50
	)
	default String reminder50Times() { return ""; }

	@ConfigItem(
			keyName = "reminder50DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder50
	)
	default String reminder50DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder50Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder50
	)
	default String reminder50Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder50Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder50
	)
	default String reminder50Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder50Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder50
	)
	default String reminder50Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder50Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder50
	)
	default int reminder50Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder50RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder50
	)
	default String reminder50RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder50NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder50
	)
	default String reminder50NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder50ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder50
	)
	default String reminder50ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder51",
			description = "Reminder 51",
			position = 71,
			closedByDefault = true
	)
	String reminder51= "reminder51";

	@ConfigItem(
			keyName = "enableReminder51",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder51
	)
	default boolean reminder51Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder51Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder51
	)
	default String reminder51Text() { return ""; }

	@ConfigItem(
			keyName = "reminder51Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder51
	)
	default Color reminder51Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder51Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder51
	)
	default String reminder51Times() { return ""; }

	@ConfigItem(
			keyName = "reminder51DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder51
	)
	default String reminder51DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder51Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder51
	)
	default String reminder51Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder51Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder51
	)
	default String reminder51Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder51Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder51
	)
	default String reminder51Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder51Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder51
	)
	default int reminder51Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder51RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder51
	)
	default String reminder51RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder51NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder51
	)
	default String reminder51NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder51ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder51
	)
	default String reminder51ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder52",
			description = "Reminder 52",
			position = 72,
			closedByDefault = true
	)
	String reminder52= "reminder52";

	@ConfigItem(
			keyName = "enableReminder52",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder52
	)
	default boolean reminder52Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder52Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder52
	)
	default String reminder52Text() { return ""; }

	@ConfigItem(
			keyName = "reminder52Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder52
	)
	default Color reminder52Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder52Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder52
	)
	default String reminder52Times() { return ""; }

	@ConfigItem(
			keyName = "reminder52DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder52
	)
	default String reminder52DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder52Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder52
	)
	default String reminder52Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder52Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder52
	)
	default String reminder52Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder52Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder52
	)
	default String reminder52Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder52Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder52
	)
	default int reminder52Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder52RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder52
	)
	default String reminder52RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder52NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder52
	)
	default String reminder52NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder52ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder52
	)
	default String reminder52ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder53",
			description = "Reminder 53",
			position = 73,
			closedByDefault = true
	)
	String reminder53= "reminder53";

	@ConfigItem(
			keyName = "enableReminder53",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder53
	)
	default boolean reminder53Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder53Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder53
	)
	default String reminder53Text() { return ""; }

	@ConfigItem(
			keyName = "reminder53Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder53
	)
	default Color reminder53Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder53Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder53
	)
	default String reminder53Times() { return ""; }

	@ConfigItem(
			keyName = "reminder53DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder53
	)
	default String reminder53DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder53Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder53
	)
	default String reminder53Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder53Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder53
	)
	default String reminder53Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder53Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder53
	)
	default String reminder53Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder53Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder53
	)
	default int reminder53Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder53RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder53
	)
	default String reminder53RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder53NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder53
	)
	default String reminder53NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder53ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder53
	)
	default String reminder53ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder54",
			description = "Reminder 54",
			position = 74,
			closedByDefault = true
	)
	String reminder54= "reminder54";

	@ConfigItem(
			keyName = "enableReminder54",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder54
	)
	default boolean reminder54Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder54Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder54
	)
	default String reminder54Text() { return ""; }

	@ConfigItem(
			keyName = "reminder54Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder54
	)
	default Color reminder54Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder54Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder54
	)
	default String reminder54Times() { return ""; }

	@ConfigItem(
			keyName = "reminder54DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder54
	)
	default String reminder54DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder54Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder54
	)
	default String reminder54Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder54Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder54
	)
	default String reminder54Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder54Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder54
	)
	default String reminder54Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder54Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder54
	)
	default int reminder54Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder54RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder54
	)
	default String reminder54RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder54NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder54
	)
	default String reminder54NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder54ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder54
	)
	default String reminder54ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder55",
			description = "Reminder 55",
			position = 75,
			closedByDefault = true
	)
	String reminder55= "reminder55";

	@ConfigItem(
			keyName = "enableReminder55",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder55
	)
	default boolean reminder55Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder55Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder55
	)
	default String reminder55Text() { return ""; }

	@ConfigItem(
			keyName = "reminder55Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder55
	)
	default Color reminder55Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder55Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder55
	)
	default String reminder55Times() { return ""; }

	@ConfigItem(
			keyName = "reminder55DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder55
	)
	default String reminder55DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder55Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder55
	)
	default String reminder55Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder55Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder55
	)
	default String reminder55Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder55Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder55
	)
	default String reminder55Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder55Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder55
	)
	default int reminder55Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder55RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder55
	)
	default String reminder55RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder55NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder55
	)
	default String reminder55NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder55ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder55
	)
	default String reminder55ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder56",
			description = "Reminder 56",
			position = 76,
			closedByDefault = true
	)
	String reminder56= "reminder56";

	@ConfigItem(
			keyName = "enableReminder56",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder56
	)
	default boolean reminder56Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder56Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder56
	)
	default String reminder56Text() { return ""; }

	@ConfigItem(
			keyName = "reminder56Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder56
	)
	default Color reminder56Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder56Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder56
	)
	default String reminder56Times() { return ""; }

	@ConfigItem(
			keyName = "reminder56DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder56
	)
	default String reminder56DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder56Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder56
	)
	default String reminder56Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder56Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder56
	)
	default String reminder56Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder56Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder56
	)
	default String reminder56Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder56Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder56
	)
	default int reminder56Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder56RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder56
	)
	default String reminder56RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder56NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder56
	)
	default String reminder56NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder56ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder56
	)
	default String reminder56ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder57",
			description = "Reminder 57",
			position = 77,
			closedByDefault = true
	)
	String reminder57= "reminder57";

	@ConfigItem(
			keyName = "enableReminder57",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder57
	)
	default boolean reminder57Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder57Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder57
	)
	default String reminder57Text() { return ""; }

	@ConfigItem(
			keyName = "reminder57Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder57
	)
	default Color reminder57Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder57Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder57
	)
	default String reminder57Times() { return ""; }

	@ConfigItem(
			keyName = "reminder57DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder57
	)
	default String reminder57DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder57Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder57
	)
	default String reminder57Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder57Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder57
	)
	default String reminder57Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder57Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder57
	)
	default String reminder57Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder57Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder57
	)
	default int reminder57Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder57RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder57
	)
	default String reminder57RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder57NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder57
	)
	default String reminder57NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder57ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder57
	)
	default String reminder57ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder58",
			description = "Reminder 58",
			position = 78,
			closedByDefault = true
	)
	String reminder58= "reminder58";

	@ConfigItem(
			keyName = "enableReminder58",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder58
	)
	default boolean reminder58Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder58Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder58
	)
	default String reminder58Text() { return ""; }

	@ConfigItem(
			keyName = "reminder58Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder58
	)
	default Color reminder58Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder58Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder58
	)
	default String reminder58Times() { return ""; }

	@ConfigItem(
			keyName = "reminder58DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder58
	)
	default String reminder58DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder58Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder58
	)
	default String reminder58Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder58Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder58
	)
	default String reminder58Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder58Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder58
	)
	default String reminder58Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder58Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder58
	)
	default int reminder58Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder58RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder58
	)
	default String reminder58RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder58NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder58
	)
	default String reminder58NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder58ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder58
	)
	default String reminder58ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder59",
			description = "Reminder 59",
			position = 79,
			closedByDefault = true
	)
	String reminder59= "reminder59";

	@ConfigItem(
			keyName = "enableReminder59",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder59
	)
	default boolean reminder59Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder59Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder59
	)
	default String reminder59Text() { return ""; }

	@ConfigItem(
			keyName = "reminder59Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder59
	)
	default Color reminder59Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder59Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder59
	)
	default String reminder59Times() { return ""; }

	@ConfigItem(
			keyName = "reminder59DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder59
	)
	default String reminder59DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder59Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder59
	)
	default String reminder59Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder59Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder59
	)
	default String reminder59Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder59Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder59
	)
	default String reminder59Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder59Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder59
	)
	default int reminder59Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder59RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder59
	)
	default String reminder59RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder59NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder59
	)
	default String reminder59NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder59ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder59
	)
	default String reminder59ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder60",
			description = "Reminder 60",
			position = 80,
			closedByDefault = true
	)
	String reminder60= "reminder60";

	@ConfigItem(
			keyName = "enableReminder60",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder60
	)
	default boolean reminder60Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder60Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder60
	)
	default String reminder60Text() { return ""; }

	@ConfigItem(
			keyName = "reminder60Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder60
	)
	default Color reminder60Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder60Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder60
	)
	default String reminder60Times() { return ""; }

	@ConfigItem(
			keyName = "reminder60DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder60
	)
	default String reminder60DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder60Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder60
	)
	default String reminder60Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder60Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder60
	)
	default String reminder60Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder60Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder60
	)
	default String reminder60Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder60Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder60
	)
	default int reminder60Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder60RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder60
	)
	default String reminder60RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder60NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder60
	)
	default String reminder60NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder60ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder60
	)
	default String reminder60ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder61",
			description = "Reminder 61",
			position = 81,
			closedByDefault = true
	)
	String reminder61= "reminder61";

	@ConfigItem(
			keyName = "enableReminder61",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder61
	)
	default boolean reminder61Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder61Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder61
	)
	default String reminder61Text() { return ""; }

	@ConfigItem(
			keyName = "reminder61Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder61
	)
	default Color reminder61Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder61Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder61
	)
	default String reminder61Times() { return ""; }

	@ConfigItem(
			keyName = "reminder61DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder61
	)
	default String reminder61DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder61Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder61
	)
	default String reminder61Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder61Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder61
	)
	default String reminder61Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder61Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder61
	)
	default String reminder61Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder61Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder61
	)
	default int reminder61Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder61RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder61
	)
	default String reminder61RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder61NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder61
	)
	default String reminder61NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder61ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder61
	)
	default String reminder61ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder62",
			description = "Reminder 62",
			position = 82,
			closedByDefault = true
	)
	String reminder62= "reminder62";

	@ConfigItem(
			keyName = "enableReminder62",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder62
	)
	default boolean reminder62Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder62Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder62
	)
	default String reminder62Text() { return ""; }

	@ConfigItem(
			keyName = "reminder62Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder62
	)
	default Color reminder62Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder62Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder62
	)
	default String reminder62Times() { return ""; }

	@ConfigItem(
			keyName = "reminder62DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder62
	)
	default String reminder62DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder62Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder62
	)
	default String reminder62Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder62Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder62
	)
	default String reminder62Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder62Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder62
	)
	default String reminder62Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder62Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder62
	)
	default int reminder62Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder62RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder62
	)
	default String reminder62RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder62NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder62
	)
	default String reminder62NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder62ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder62
	)
	default String reminder62ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder63",
			description = "Reminder 63",
			position = 83,
			closedByDefault = true
	)
	String reminder63= "reminder63";

	@ConfigItem(
			keyName = "enableReminder63",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder63
	)
	default boolean reminder63Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder63Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder63
	)
	default String reminder63Text() { return ""; }

	@ConfigItem(
			keyName = "reminder63Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder63
	)
	default Color reminder63Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder63Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder63
	)
	default String reminder63Times() { return ""; }

	@ConfigItem(
			keyName = "reminder63DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder63
	)
	default String reminder63DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder63Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder63
	)
	default String reminder63Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder63Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder63
	)
	default String reminder63Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder63Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder63
	)
	default String reminder63Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder63Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder63
	)
	default int reminder63Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder63RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder63
	)
	default String reminder63RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder63NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder63
	)
	default String reminder63NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder63ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder63
	)
	default String reminder63ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder64",
			description = "Reminder 64",
			position = 84,
			closedByDefault = true
	)
	String reminder64= "reminder64";

	@ConfigItem(
			keyName = "enableReminder64",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder64
	)
	default boolean reminder64Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder64Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder64
	)
	default String reminder64Text() { return ""; }

	@ConfigItem(
			keyName = "reminder64Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder64
	)
	default Color reminder64Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder64Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder64
	)
	default String reminder64Times() { return ""; }

	@ConfigItem(
			keyName = "reminder64DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder64
	)
	default String reminder64DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder64Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder64
	)
	default String reminder64Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder64Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder64
	)
	default String reminder64Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder64Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder64
	)
	default String reminder64Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder64Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder64
	)
	default int reminder64Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder64RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder64
	)
	default String reminder64RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder64NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder64
	)
	default String reminder64NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder64ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder64
	)
	default String reminder64ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder65",
			description = "Reminder 65",
			position = 85,
			closedByDefault = true
	)
	String reminder65= "reminder65";

	@ConfigItem(
			keyName = "enableReminder65",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder65
	)
	default boolean reminder65Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder65Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder65
	)
	default String reminder65Text() { return ""; }

	@ConfigItem(
			keyName = "reminder65Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder65
	)
	default Color reminder65Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder65Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder65
	)
	default String reminder65Times() { return ""; }

	@ConfigItem(
			keyName = "reminder65DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder65
	)
	default String reminder65DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder65Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder65
	)
	default String reminder65Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder65Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder65
	)
	default String reminder65Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder65Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder65
	)
	default String reminder65Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder65Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder65
	)
	default int reminder65Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder65RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder65
	)
	default String reminder65RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder65NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder65
	)
	default String reminder65NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder65ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder65
	)
	default String reminder65ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder66",
			description = "Reminder 66",
			position = 86,
			closedByDefault = true
	)
	String reminder66= "reminder66";

	@ConfigItem(
			keyName = "enableReminder66",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder66
	)
	default boolean reminder66Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder66Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder66
	)
	default String reminder66Text() { return ""; }

	@ConfigItem(
			keyName = "reminder66Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder66
	)
	default Color reminder66Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder66Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder66
	)
	default String reminder66Times() { return ""; }

	@ConfigItem(
			keyName = "reminder66DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder66
	)
	default String reminder66DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder66Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder66
	)
	default String reminder66Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder66Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder66
	)
	default String reminder66Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder66Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder66
	)
	default String reminder66Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder66Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder66
	)
	default int reminder66Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder66RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder66
	)
	default String reminder66RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder66NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder66
	)
	default String reminder66NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder66ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder66
	)
	default String reminder66ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder67",
			description = "Reminder 67",
			position = 87,
			closedByDefault = true
	)
	String reminder67= "reminder67";

	@ConfigItem(
			keyName = "enableReminder67",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder67
	)
	default boolean reminder67Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder67Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder67
	)
	default String reminder67Text() { return ""; }

	@ConfigItem(
			keyName = "reminder67Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder67
	)
	default Color reminder67Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder67Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder67
	)
	default String reminder67Times() { return ""; }

	@ConfigItem(
			keyName = "reminder67DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder67
	)
	default String reminder67DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder67Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder67
	)
	default String reminder67Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder67Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder67
	)
	default String reminder67Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder67Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder67
	)
	default String reminder67Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder67Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder67
	)
	default int reminder67Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder67RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder67
	)
	default String reminder67RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder67NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder67
	)
	default String reminder67NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder67ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder67
	)
	default String reminder67ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder68",
			description = "Reminder 68",
			position = 88,
			closedByDefault = true
	)
	String reminder68= "reminder68";

	@ConfigItem(
			keyName = "enableReminder68",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder68
	)
	default boolean reminder68Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder68Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder68
	)
	default String reminder68Text() { return ""; }

	@ConfigItem(
			keyName = "reminder68Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder68
	)
	default Color reminder68Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder68Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder68
	)
	default String reminder68Times() { return ""; }

	@ConfigItem(
			keyName = "reminder68DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder68
	)
	default String reminder68DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder68Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder68
	)
	default String reminder68Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder68Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder68
	)
	default String reminder68Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder68Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder68
	)
	default String reminder68Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder68Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder68
	)
	default int reminder68Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder68RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder68
	)
	default String reminder68RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder68NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder68
	)
	default String reminder68NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder68ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder68
	)
	default String reminder68ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder69",
			description = "Reminder 69",
			position = 89,
			closedByDefault = true
	)
	String reminder69= "reminder69";

	@ConfigItem(
			keyName = "enableReminder69",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder69
	)
	default boolean reminder69Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder69Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder69
	)
	default String reminder69Text() { return ""; }

	@ConfigItem(
			keyName = "reminder69Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder69
	)
	default Color reminder69Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder69Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder69
	)
	default String reminder69Times() { return ""; }

	@ConfigItem(
			keyName = "reminder69DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder69
	)
	default String reminder69DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder69Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder69
	)
	default String reminder69Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder69Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder69
	)
	default String reminder69Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder69Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder69
	)
	default String reminder69Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder69Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder69
	)
	default int reminder69Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder69RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder69
	)
	default String reminder69RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder69NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder69
	)
	default String reminder69NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder69ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder69
	)
	default String reminder69ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder70",
			description = "Reminder 70",
			position = 90,
			closedByDefault = true
	)
	String reminder70= "reminder70";

	@ConfigItem(
			keyName = "enableReminder70",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder70
	)
	default boolean reminder70Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder70Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder70
	)
	default String reminder70Text() { return ""; }

	@ConfigItem(
			keyName = "reminder70Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder70
	)
	default Color reminder70Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder70Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder70
	)
	default String reminder70Times() { return ""; }

	@ConfigItem(
			keyName = "reminder70DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder70
	)
	default String reminder70DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder70Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder70
	)
	default String reminder70Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder70Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder70
	)
	default String reminder70Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder70Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder70
	)
	default String reminder70Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder70Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder70
	)
	default int reminder70Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder70RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder70
	)
	default String reminder70RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder70NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder70
	)
	default String reminder70NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder70ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder70
	)
	default String reminder70ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder71",
			description = "Reminder 71",
			position = 91,
			closedByDefault = true
	)
	String reminder71= "reminder71";

	@ConfigItem(
			keyName = "enableReminder71",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder71
	)
	default boolean reminder71Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder71Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder71
	)
	default String reminder71Text() { return ""; }

	@ConfigItem(
			keyName = "reminder71Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder71
	)
	default Color reminder71Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder71Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder71
	)
	default String reminder71Times() { return ""; }

	@ConfigItem(
			keyName = "reminder71DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder71
	)
	default String reminder71DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder71Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder71
	)
	default String reminder71Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder71Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder71
	)
	default String reminder71Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder71Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder71
	)
	default String reminder71Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder71Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder71
	)
	default int reminder71Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder71RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder71
	)
	default String reminder71RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder71NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder71
	)
	default String reminder71NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder71ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder71
	)
	default String reminder71ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder72",
			description = "Reminder 72",
			position = 92,
			closedByDefault = true
	)
	String reminder72= "reminder72";

	@ConfigItem(
			keyName = "enableReminder72",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder72
	)
	default boolean reminder72Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder72Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder72
	)
	default String reminder72Text() { return ""; }

	@ConfigItem(
			keyName = "reminder72Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder72
	)
	default Color reminder72Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder72Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder72
	)
	default String reminder72Times() { return ""; }

	@ConfigItem(
			keyName = "reminder72DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder72
	)
	default String reminder72DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder72Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder72
	)
	default String reminder72Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder72Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder72
	)
	default String reminder72Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder72Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder72
	)
	default String reminder72Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder72Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder72
	)
	default int reminder72Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder72RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder72
	)
	default String reminder72RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder72NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder72
	)
	default String reminder72NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder72ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder72
	)
	default String reminder72ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder73",
			description = "Reminder 73",
			position = 93,
			closedByDefault = true
	)
	String reminder73= "reminder73";

	@ConfigItem(
			keyName = "enableReminder73",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder73
	)
	default boolean reminder73Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder73Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder73
	)
	default String reminder73Text() { return ""; }

	@ConfigItem(
			keyName = "reminder73Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder73
	)
	default Color reminder73Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder73Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder73
	)
	default String reminder73Times() { return ""; }

	@ConfigItem(
			keyName = "reminder73DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder73
	)
	default String reminder73DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder73Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder73
	)
	default String reminder73Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder73Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder73
	)
	default String reminder73Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder73Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder73
	)
	default String reminder73Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder73Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder73
	)
	default int reminder73Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder73RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder73
	)
	default String reminder73RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder73NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder73
	)
	default String reminder73NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder73ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder73
	)
	default String reminder73ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder74",
			description = "Reminder 74",
			position = 94,
			closedByDefault = true
	)
	String reminder74= "reminder74";

	@ConfigItem(
			keyName = "enableReminder74",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder74
	)
	default boolean reminder74Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder74Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder74
	)
	default String reminder74Text() { return ""; }

	@ConfigItem(
			keyName = "reminder74Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder74
	)
	default Color reminder74Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder74Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder74
	)
	default String reminder74Times() { return ""; }

	@ConfigItem(
			keyName = "reminder74DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder74
	)
	default String reminder74DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder74Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder74
	)
	default String reminder74Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder74Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder74
	)
	default String reminder74Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder74Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder74
	)
	default String reminder74Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder74Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder74
	)
	default int reminder74Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder74RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder74
	)
	default String reminder74RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder74NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder74
	)
	default String reminder74NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder74ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder74
	)
	default String reminder74ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder75",
			description = "Reminder 75",
			position = 95,
			closedByDefault = true
	)
	String reminder75= "reminder75";

	@ConfigItem(
			keyName = "enableReminder75",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder75
	)
	default boolean reminder75Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder75Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder75
	)
	default String reminder75Text() { return ""; }

	@ConfigItem(
			keyName = "reminder75Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder75
	)
	default Color reminder75Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder75Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder75
	)
	default String reminder75Times() { return ""; }

	@ConfigItem(
			keyName = "reminder75DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder75
	)
	default String reminder75DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder75Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder75
	)
	default String reminder75Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder75Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder75
	)
	default String reminder75Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder75Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder75
	)
	default String reminder75Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder75Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder75
	)
	default int reminder75Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder75RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder75
	)
	default String reminder75RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder75NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder75
	)
	default String reminder75NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder75ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder75
	)
	default String reminder75ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder76",
			description = "Reminder 76",
			position = 96,
			closedByDefault = true
	)
	String reminder76= "reminder76";

	@ConfigItem(
			keyName = "enableReminder76",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder76
	)
	default boolean reminder76Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder76Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder76
	)
	default String reminder76Text() { return ""; }

	@ConfigItem(
			keyName = "reminder76Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder76
	)
	default Color reminder76Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder76Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder76
	)
	default String reminder76Times() { return ""; }

	@ConfigItem(
			keyName = "reminder76DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder76
	)
	default String reminder76DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder76Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder76
	)
	default String reminder76Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder76Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder76
	)
	default String reminder76Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder76Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder76
	)
	default String reminder76Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder76Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder76
	)
	default int reminder76Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder76RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder76
	)
	default String reminder76RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder76NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder76
	)
	default String reminder76NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder76ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder76
	)
	default String reminder76ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder77",
			description = "Reminder 77",
			position = 97,
			closedByDefault = true
	)
	String reminder77= "reminder77";

	@ConfigItem(
			keyName = "enableReminder77",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder77
	)
	default boolean reminder77Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder77Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder77
	)
	default String reminder77Text() { return ""; }

	@ConfigItem(
			keyName = "reminder77Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder77
	)
	default Color reminder77Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder77Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder77
	)
	default String reminder77Times() { return ""; }

	@ConfigItem(
			keyName = "reminder77DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder77
	)
	default String reminder77DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder77Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder77
	)
	default String reminder77Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder77Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder77
	)
	default String reminder77Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder77Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder77
	)
	default String reminder77Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder77Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder77
	)
	default int reminder77Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder77RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder77
	)
	default String reminder77RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder77NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder77
	)
	default String reminder77NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder77ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder77
	)
	default String reminder77ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder78",
			description = "Reminder 78",
			position = 98,
			closedByDefault = true
	)
	String reminder78= "reminder78";

	@ConfigItem(
			keyName = "enableReminder78",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder78
	)
	default boolean reminder78Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder78Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder78
	)
	default String reminder78Text() { return ""; }

	@ConfigItem(
			keyName = "reminder78Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder78
	)
	default Color reminder78Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder78Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder78
	)
	default String reminder78Times() { return ""; }

	@ConfigItem(
			keyName = "reminder78DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder78
	)
	default String reminder78DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder78Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder78
	)
	default String reminder78Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder78Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder78
	)
	default String reminder78Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder78Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder78
	)
	default String reminder78Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder78Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder78
	)
	default int reminder78Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder78RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder78
	)
	default String reminder78RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder78NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder78
	)
	default String reminder78NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder78ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder78
	)
	default String reminder78ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder79",
			description = "Reminder 79",
			position = 99,
			closedByDefault = true
	)
	String reminder79= "reminder79";

	@ConfigItem(
			keyName = "enableReminder79",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder79
	)
	default boolean reminder79Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder79Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder79
	)
	default String reminder79Text() { return ""; }

	@ConfigItem(
			keyName = "reminder79Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder79
	)
	default Color reminder79Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder79Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder79
	)
	default String reminder79Times() { return ""; }

	@ConfigItem(
			keyName = "reminder79DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder79
	)
	default String reminder79DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder79Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder79
	)
	default String reminder79Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder79Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder79
	)
	default String reminder79Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder79Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder79
	)
	default String reminder79Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder79Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder79
	)
	default int reminder79Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder79RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder79
	)
	default String reminder79RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder79NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder79
	)
	default String reminder79NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder79ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder79
	)
	default String reminder79ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder80",
			description = "Reminder 80",
			position = 100,
			closedByDefault = true
	)
	String reminder80= "reminder80";

	@ConfigItem(
			keyName = "enableReminder80",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder80
	)
	default boolean reminder80Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder80Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder80
	)
	default String reminder80Text() { return ""; }

	@ConfigItem(
			keyName = "reminder80Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder80
	)
	default Color reminder80Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder80Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder80
	)
	default String reminder80Times() { return ""; }

	@ConfigItem(
			keyName = "reminder80DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder80
	)
	default String reminder80DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder80Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder80
	)
	default String reminder80Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder80Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder80
	)
	default String reminder80Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder80Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder80
	)
	default String reminder80Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder80Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder80
	)
	default int reminder80Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder80RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder80
	)
	default String reminder80RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder80NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder80
	)
	default String reminder80NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder80ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder80
	)
	default String reminder80ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder81",
			description = "Reminder 81",
			position = 101,
			closedByDefault = true
	)
	String reminder81= "reminder81";

	@ConfigItem(
			keyName = "enableReminder81",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder81
	)
	default boolean reminder81Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder81Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder81
	)
	default String reminder81Text() { return ""; }

	@ConfigItem(
			keyName = "reminder81Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder81
	)
	default Color reminder81Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder81Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder81
	)
	default String reminder81Times() { return ""; }

	@ConfigItem(
			keyName = "reminder81DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder81
	)
	default String reminder81DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder81Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder81
	)
	default String reminder81Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder81Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder81
	)
	default String reminder81Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder81Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder81
	)
	default String reminder81Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder81Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder81
	)
	default int reminder81Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder81RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder81
	)
	default String reminder81RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder81NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder81
	)
	default String reminder81NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder81ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder81
	)
	default String reminder81ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder82",
			description = "Reminder 82",
			position = 102,
			closedByDefault = true
	)
	String reminder82= "reminder82";

	@ConfigItem(
			keyName = "enableReminder82",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder82
	)
	default boolean reminder82Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder82Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder82
	)
	default String reminder82Text() { return ""; }

	@ConfigItem(
			keyName = "reminder82Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder82
	)
	default Color reminder82Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder82Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder82
	)
	default String reminder82Times() { return ""; }

	@ConfigItem(
			keyName = "reminder82DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder82
	)
	default String reminder82DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder82Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder82
	)
	default String reminder82Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder82Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder82
	)
	default String reminder82Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder82Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder82
	)
	default String reminder82Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder82Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder82
	)
	default int reminder82Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder82RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder82
	)
	default String reminder82RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder82NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder82
	)
	default String reminder82NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder82ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder82
	)
	default String reminder82ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder83",
			description = "Reminder 83",
			position = 103,
			closedByDefault = true
	)
	String reminder83= "reminder83";

	@ConfigItem(
			keyName = "enableReminder83",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder83
	)
	default boolean reminder83Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder83Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder83
	)
	default String reminder83Text() { return ""; }

	@ConfigItem(
			keyName = "reminder83Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder83
	)
	default Color reminder83Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder83Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder83
	)
	default String reminder83Times() { return ""; }

	@ConfigItem(
			keyName = "reminder83DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder83
	)
	default String reminder83DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder83Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder83
	)
	default String reminder83Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder83Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder83
	)
	default String reminder83Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder83Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder83
	)
	default String reminder83Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder83Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder83
	)
	default int reminder83Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder83RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder83
	)
	default String reminder83RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder83NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder83
	)
	default String reminder83NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder83ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder83
	)
	default String reminder83ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder84",
			description = "Reminder 84",
			position = 104,
			closedByDefault = true
	)
	String reminder84= "reminder84";

	@ConfigItem(
			keyName = "enableReminder84",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder84
	)
	default boolean reminder84Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder84Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder84
	)
	default String reminder84Text() { return ""; }

	@ConfigItem(
			keyName = "reminder84Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder84
	)
	default Color reminder84Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder84Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder84
	)
	default String reminder84Times() { return ""; }

	@ConfigItem(
			keyName = "reminder84DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder84
	)
	default String reminder84DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder84Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder84
	)
	default String reminder84Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder84Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder84
	)
	default String reminder84Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder84Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder84
	)
	default String reminder84Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder84Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder84
	)
	default int reminder84Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder84RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder84
	)
	default String reminder84RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder84NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder84
	)
	default String reminder84NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder84ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder84
	)
	default String reminder84ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder85",
			description = "Reminder 85",
			position = 105,
			closedByDefault = true
	)
	String reminder85= "reminder85";

	@ConfigItem(
			keyName = "enableReminder85",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder85
	)
	default boolean reminder85Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder85Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder85
	)
	default String reminder85Text() { return ""; }

	@ConfigItem(
			keyName = "reminder85Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder85
	)
	default Color reminder85Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder85Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder85
	)
	default String reminder85Times() { return ""; }

	@ConfigItem(
			keyName = "reminder85DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder85
	)
	default String reminder85DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder85Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder85
	)
	default String reminder85Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder85Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder85
	)
	default String reminder85Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder85Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder85
	)
	default String reminder85Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder85Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder85
	)
	default int reminder85Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder85RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder85
	)
	default String reminder85RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder85NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder85
	)
	default String reminder85NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder85ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder85
	)
	default String reminder85ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder86",
			description = "Reminder 86",
			position = 106,
			closedByDefault = true
	)
	String reminder86= "reminder86";

	@ConfigItem(
			keyName = "enableReminder86",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder86
	)
	default boolean reminder86Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder86Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder86
	)
	default String reminder86Text() { return ""; }

	@ConfigItem(
			keyName = "reminder86Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder86
	)
	default Color reminder86Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder86Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder86
	)
	default String reminder86Times() { return ""; }

	@ConfigItem(
			keyName = "reminder86DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder86
	)
	default String reminder86DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder86Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder86
	)
	default String reminder86Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder86Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder86
	)
	default String reminder86Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder86Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder86
	)
	default String reminder86Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder86Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder86
	)
	default int reminder86Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder86RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder86
	)
	default String reminder86RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder86NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder86
	)
	default String reminder86NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder86ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder86
	)
	default String reminder86ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder87",
			description = "Reminder 87",
			position = 107,
			closedByDefault = true
	)
	String reminder87= "reminder87";

	@ConfigItem(
			keyName = "enableReminder87",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder87
	)
	default boolean reminder87Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder87Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder87
	)
	default String reminder87Text() { return ""; }

	@ConfigItem(
			keyName = "reminder87Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder87
	)
	default Color reminder87Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder87Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder87
	)
	default String reminder87Times() { return ""; }

	@ConfigItem(
			keyName = "reminder87DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder87
	)
	default String reminder87DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder87Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder87
	)
	default String reminder87Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder87Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder87
	)
	default String reminder87Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder87Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder87
	)
	default String reminder87Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder87Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder87
	)
	default int reminder87Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder87RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder87
	)
	default String reminder87RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder87NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder87
	)
	default String reminder87NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder87ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder87
	)
	default String reminder87ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder88",
			description = "Reminder 88",
			position = 108,
			closedByDefault = true
	)
	String reminder88= "reminder88";

	@ConfigItem(
			keyName = "enableReminder88",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder88
	)
	default boolean reminder88Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder88Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder88
	)
	default String reminder88Text() { return ""; }

	@ConfigItem(
			keyName = "reminder88Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder88
	)
	default Color reminder88Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder88Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder88
	)
	default String reminder88Times() { return ""; }

	@ConfigItem(
			keyName = "reminder88DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder88
	)
	default String reminder88DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder88Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder88
	)
	default String reminder88Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder88Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder88
	)
	default String reminder88Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder88Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder88
	)
	default String reminder88Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder88Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder88
	)
	default int reminder88Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder88RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder88
	)
	default String reminder88RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder88NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder88
	)
	default String reminder88NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder88ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder88
	)
	default String reminder88ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder89",
			description = "Reminder 89",
			position = 109,
			closedByDefault = true
	)
	String reminder89= "reminder89";

	@ConfigItem(
			keyName = "enableReminder89",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder89
	)
	default boolean reminder89Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder89Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder89
	)
	default String reminder89Text() { return ""; }

	@ConfigItem(
			keyName = "reminder89Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder89
	)
	default Color reminder89Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder89Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder89
	)
	default String reminder89Times() { return ""; }

	@ConfigItem(
			keyName = "reminder89DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder89
	)
	default String reminder89DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder89Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder89
	)
	default String reminder89Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder89Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder89
	)
	default String reminder89Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder89Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder89
	)
	default String reminder89Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder89Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder89
	)
	default int reminder89Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder89RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder89
	)
	default String reminder89RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder89NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder89
	)
	default String reminder89NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder89ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder89
	)
	default String reminder89ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder90",
			description = "Reminder 90",
			position = 110,
			closedByDefault = true
	)
	String reminder90= "reminder90";

	@ConfigItem(
			keyName = "enableReminder90",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder90
	)
	default boolean reminder90Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder90Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder90
	)
	default String reminder90Text() { return ""; }

	@ConfigItem(
			keyName = "reminder90Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder90
	)
	default Color reminder90Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder90Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder90
	)
	default String reminder90Times() { return ""; }

	@ConfigItem(
			keyName = "reminder90DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder90
	)
	default String reminder90DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder90Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder90
	)
	default String reminder90Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder90Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder90
	)
	default String reminder90Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder90Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder90
	)
	default String reminder90Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder90Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder90
	)
	default int reminder90Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder90RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder90
	)
	default String reminder90RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder90NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder90
	)
	default String reminder90NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder90ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder90
	)
	default String reminder90ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder91",
			description = "Reminder 91",
			position = 111,
			closedByDefault = true
	)
	String reminder91= "reminder91";

	@ConfigItem(
			keyName = "enableReminder91",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder91
	)
	default boolean reminder91Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder91Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder91
	)
	default String reminder91Text() { return ""; }

	@ConfigItem(
			keyName = "reminder91Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder91
	)
	default Color reminder91Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder91Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder91
	)
	default String reminder91Times() { return ""; }

	@ConfigItem(
			keyName = "reminder91DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder91
	)
	default String reminder91DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder91Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder91
	)
	default String reminder91Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder91Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder91
	)
	default String reminder91Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder91Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder91
	)
	default String reminder91Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder91Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder91
	)
	default int reminder91Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder91RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder91
	)
	default String reminder91RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder91NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder91
	)
	default String reminder91NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder91ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder91
	)
	default String reminder91ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder92",
			description = "Reminder 92",
			position = 112,
			closedByDefault = true
	)
	String reminder92= "reminder92";

	@ConfigItem(
			keyName = "enableReminder92",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder92
	)
	default boolean reminder92Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder92Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder92
	)
	default String reminder92Text() { return ""; }

	@ConfigItem(
			keyName = "reminder92Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder92
	)
	default Color reminder92Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder92Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder92
	)
	default String reminder92Times() { return ""; }

	@ConfigItem(
			keyName = "reminder92DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder92
	)
	default String reminder92DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder92Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder92
	)
	default String reminder92Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder92Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder92
	)
	default String reminder92Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder92Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder92
	)
	default String reminder92Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder92Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder92
	)
	default int reminder92Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder92RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder92
	)
	default String reminder92RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder92NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder92
	)
	default String reminder92NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder92ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder92
	)
	default String reminder92ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder93",
			description = "Reminder 93",
			position = 113,
			closedByDefault = true
	)
	String reminder93= "reminder93";

	@ConfigItem(
			keyName = "enableReminder93",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder93
	)
	default boolean reminder93Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder93Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder93
	)
	default String reminder93Text() { return ""; }

	@ConfigItem(
			keyName = "reminder93Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder93
	)
	default Color reminder93Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder93Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder93
	)
	default String reminder93Times() { return ""; }

	@ConfigItem(
			keyName = "reminder93DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder93
	)
	default String reminder93DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder93Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder93
	)
	default String reminder93Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder93Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder93
	)
	default String reminder93Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder93Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder93
	)
	default String reminder93Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder93Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder93
	)
	default int reminder93Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder93RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder93
	)
	default String reminder93RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder93NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder93
	)
	default String reminder93NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder93ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder93
	)
	default String reminder93ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder94",
			description = "Reminder 94",
			position = 114,
			closedByDefault = true
	)
	String reminder94= "reminder94";

	@ConfigItem(
			keyName = "enableReminder94",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder94
	)
	default boolean reminder94Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder94Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder94
	)
	default String reminder94Text() { return ""; }

	@ConfigItem(
			keyName = "reminder94Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder94
	)
	default Color reminder94Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder94Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder94
	)
	default String reminder94Times() { return ""; }

	@ConfigItem(
			keyName = "reminder94DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder94
	)
	default String reminder94DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder94Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder94
	)
	default String reminder94Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder94Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder94
	)
	default String reminder94Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder94Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder94
	)
	default String reminder94Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder94Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder94
	)
	default int reminder94Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder94RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder94
	)
	default String reminder94RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder94NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder94
	)
	default String reminder94NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder94ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder94
	)
	default String reminder94ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder95",
			description = "Reminder 95",
			position = 115,
			closedByDefault = true
	)
	String reminder95= "reminder95";

	@ConfigItem(
			keyName = "enableReminder95",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder95
	)
	default boolean reminder95Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder95Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder95
	)
	default String reminder95Text() { return ""; }

	@ConfigItem(
			keyName = "reminder95Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder95
	)
	default Color reminder95Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder95Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder95
	)
	default String reminder95Times() { return ""; }

	@ConfigItem(
			keyName = "reminder95DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder95
	)
	default String reminder95DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder95Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder95
	)
	default String reminder95Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder95Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder95
	)
	default String reminder95Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder95Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder95
	)
	default String reminder95Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder95Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder95
	)
	default int reminder95Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder95RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder95
	)
	default String reminder95RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder95NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder95
	)
	default String reminder95NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder95ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder95
	)
	default String reminder95ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder96",
			description = "Reminder 96",
			position = 116,
			closedByDefault = true
	)
	String reminder96= "reminder96";

	@ConfigItem(
			keyName = "enableReminder96",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder96
	)
	default boolean reminder96Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder96Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder96
	)
	default String reminder96Text() { return ""; }

	@ConfigItem(
			keyName = "reminder96Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder96
	)
	default Color reminder96Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder96Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder96
	)
	default String reminder96Times() { return ""; }

	@ConfigItem(
			keyName = "reminder96DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder96
	)
	default String reminder96DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder96Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder96
	)
	default String reminder96Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder96Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder96
	)
	default String reminder96Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder96Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder96
	)
	default String reminder96Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder96Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder96
	)
	default int reminder96Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder96RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder96
	)
	default String reminder96RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder96NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder96
	)
	default String reminder96NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder96ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder96
	)
	default String reminder96ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder97",
			description = "Reminder 97",
			position = 117,
			closedByDefault = true
	)
	String reminder97= "reminder97";

	@ConfigItem(
			keyName = "enableReminder97",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder97
	)
	default boolean reminder97Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder97Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder97
	)
	default String reminder97Text() { return ""; }

	@ConfigItem(
			keyName = "reminder97Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder97
	)
	default Color reminder97Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder97Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder97
	)
	default String reminder97Times() { return ""; }

	@ConfigItem(
			keyName = "reminder97DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder97
	)
	default String reminder97DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder97Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder97
	)
	default String reminder97Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder97Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder97
	)
	default String reminder97Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder97Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder97
	)
	default String reminder97Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder97Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder97
	)
	default int reminder97Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder97RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder97
	)
	default String reminder97RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder97NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder97
	)
	default String reminder97NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder97ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder97
	)
	default String reminder97ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder98",
			description = "Reminder 98",
			position = 118,
			closedByDefault = true
	)
	String reminder98= "reminder98";

	@ConfigItem(
			keyName = "enableReminder98",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder98
	)
	default boolean reminder98Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder98Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder98
	)
	default String reminder98Text() { return ""; }

	@ConfigItem(
			keyName = "reminder98Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder98
	)
	default Color reminder98Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder98Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder98
	)
	default String reminder98Times() { return ""; }

	@ConfigItem(
			keyName = "reminder98DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder98
	)
	default String reminder98DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder98Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder98
	)
	default String reminder98Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder98Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder98
	)
	default String reminder98Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder98Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder98
	)
	default String reminder98Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder98Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder98
	)
	default int reminder98Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder98RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder98
	)
	default String reminder98RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder98NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder98
	)
	default String reminder98NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder98ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder98
	)
	default String reminder98ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder99",
			description = "Reminder 99",
			position = 119,
			closedByDefault = true
	)
	String reminder99= "reminder99";

	@ConfigItem(
			keyName = "enableReminder99",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder99
	)
	default boolean reminder99Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder99Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder99
	)
	default String reminder99Text() { return ""; }

	@ConfigItem(
			keyName = "reminder99Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder99
	)
	default Color reminder99Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder99Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder99
	)
	default String reminder99Times() { return ""; }

	@ConfigItem(
			keyName = "reminder99DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder99
	)
	default String reminder99DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder99Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder99
	)
	default String reminder99Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder99Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder99
	)
	default String reminder99Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder99Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder99
	)
	default String reminder99Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder99Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder99
	)
	default int reminder99Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder99RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder99
	)
	default String reminder99RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder99NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder99
	)
	default String reminder99NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder99ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder99
	)
	default String reminder99ItemIds() { return ""; }


	@ConfigSection(
			name = "Reminder100",
			description = "Reminder 100",
			position = 120,
			closedByDefault = true
	)
	String reminder100= "reminder100";

	@ConfigItem(
			keyName = "enableReminder100",
			position = 0,
			name = "Enable",
			description = "Configures whether or not reminder is enabled.",
			section = reminder100
	)
	default boolean reminder100Enable()  { return false; }

	@ConfigItem(
			keyName = "reminder100Text",
			position = 1,
			name = "Text",
			description = "Configures the text.",
			section = reminder100
	)
	default String reminder100Text() { return ""; }

	@ConfigItem(
			keyName = "reminder100Color",
			position = 2,
			name = "Color",
			description = "Configures the color.",
			section = reminder100
	)
	default Color reminder100Color() { return Color.WHITE; }

	@ConfigItem(
			keyName = "reminder100Times",
			position = 9,
			name = "Time",
			description = "Configures what time reminder is shown. Set times 10:00pm, 7:30pm (both 30 min) or spans 8:30am-12:00pm, 10:00pm-1:00am. (comma separated).",
			section = reminder100
	)
	default String reminder100Times() { return ""; }

	@ConfigItem(
			keyName = "reminder100DaysOfWeek",
			position = 10,
			name = "Day",
			description = "Configures what days of week reminder is shown, e.g. Mon, Thu (comma separated).",
			section = reminder100
	)
	default String reminder100DaysOfWeek() { return ""; }

	@ConfigItem(
			keyName = "reminder100Dates",
			position = 11,
			name = "Date",
			description = "Configures what dates reminder is shown. Set dates 04/30, 05/28/23 or ranges 9/20/22-10/30/22, 7/20-8/9. (comma separated).",
			section = reminder100
	)
	default String reminder100Dates() { return ""; }

	@ConfigItem(
			keyName = "reminder100Coordinates",
			position = 12,
			name = "Coordinate",
			description = "Configures coordinates where reminder is shown (x, y), e.g. (40, 50), (1000, 750) (comma separated).",
			section = reminder100
	)
	default String reminder100Coordinates() { return ""; }

	@ConfigItem(
			keyName = "reminder100Geofences",
			position = 14,
			name = "Geofence",
			description = "Configures geofences where reminder is shown (west, north, east, south), e.g. (40, 50, 1000, 750) (comma separated).",
			section = reminder100
	)
	default String reminder100Geofences() { return ""; }

	@ConfigItem(
			keyName = "reminder100Radius",
			position = 13,
			name = "Radius",
			description = "Configures how far from coordinates reminder is shown.",
			section = reminder100
	)
	default int reminder100Radius() { return 0; }

	@ConfigItem(
			keyName = "Reminder100RegionId",
			position = 15,
			name = "Region",
			description = "Configures region ids for when reminder is shown (comma separated).",
			section = reminder100
	)
	default String reminder100RegionIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder100NpcIds",
			position = 16,
			name = "Npc",
			description = "Configures the npc ids for when reminder is shown (comma separated).",
			section = reminder100
	)
	default String reminder100NpcIds() { return ""; }

	@ConfigItem(
			keyName = "Reminder100ItemIds",
			position = 17,
			name = "Item",
			description = "Configures the item ids for when reminder is shown (comma separated).",
			section = reminder100
	)
	default String reminder100ItemIds() { return ""; }
}