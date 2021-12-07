package com.sansanich.storygenerator.enums;

//-1 - forever
//0 - instant
//1-9 - num of turns

public enum EffectType {
    DAMAGE,
    HEAL,
    BLOCK,

    HOT,
    DOT,

    FAST,
    SLOW,

    DARK,

    SLEEP,
    RAGE,

    PLUS_ATTR,
    MINUS_ATTR,

    SHIELD, // minus to damage

    INVINCIBLE,
    STUN,
    SILENCE


}
