package com.ericversteeg.model.config;

public enum Sound {
    NONE(0),
    UI_BOOP(2266),
    GE_INCREMENT_PLOP(3929),
    GE_DECREMENT_PLOP(3930),
    GE_ADD_OFFER_DINGALING(3925),
    GE_COLLECT_BLOOP(3928),
    GE_COIN_TINKLE(3924),
    CLOSE_DOOR(60),
    OPEN_DOOR(62),
    ITEM_DROP(2739),
    ITEM_PICKUP(2582),
    PICK_PLANT_BLOOP(2581),
    BURY_BONES(2738),
    TINDER_STRIKE(2597),
    FIRE_WOOSH(2596),
    TREE_FALLING(2734),
    TREE_CHOP(2735),
    MINING_TINK(3220),
    COOK_WOOSH(2577),
    MAGIC_SPLASH_BOING(227),
    SMITH_ANVIL_TINK(3790),
    SMITH_ANVIL_TONK(3791),
    NPC_TELEPORT_WOOSH(1930),
    TELEPORT_VWOOP(200),
    ZERO_DAMAGE_SPLAT(511),
    TAKE_DAMAGE_SPLAT(510),
    ATTACK_HIT(2498),
    THICK_SKIN(2690),
    BURST_OF_STRENGTH(2688),
    CLARITY_OF_THOUGHT(2664),
    SHARP_EYE_RIGOUR(2685),
    MYSTIC_WILL_AUGURY(2670),
    ROCK_SKIN(2684),
    SUPERHUMAN_STRENGTH(2689),
    IMPROVED_REFLEXES(2662),
    RAPID_RESTORE_PRESERVE(2679),
    RAPID_HEAL(2678),
    PROTECT_ITEM(1982),
    HAWK_EYE(2666),
    MYSTIC_LORE(2668),
    STEEL_SKIN(2687),
    ULTIMATE_STRENGTH(2691),
    INCREDIBLE_REFLEXES(2667),
    PROTECT_FROM_MAGIC(2675),
    PROTECT_FROM_MISSILES(2677),
    PROTECT_FROM_MELEE(2676),
    EAGLE_EYE(2665),
    MYSTIC_MIGHT(2669),
    RETRIBUTION(2682),
    REDEMPTION(2680),
    SMITE(2686),
    CHIVALRY(3826),
    PIETY(3825),
    VWOOP(2663),
    TWINKLE(2672),
    BELL_DING(3813),
    BELL_DONG(3817),
    SHOUT_SQUEAK(3816);


    private int id;

    Sound(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }
}
