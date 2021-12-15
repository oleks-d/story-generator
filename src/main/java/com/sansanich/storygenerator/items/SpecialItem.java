package com.sansanich.storygenerator.items;

public class SpecialItem{
    String featuresDescription; // description of special item

    void onWear(){};
    void onUnWear(){};
    void onUse(){};

    void onBeforeAttack(){};
    void onAfterAttack(){};

    void beforeTurn(){};
    void afterTurn(){};

    void beforeEnemyAttack(){};
    void afterEnemyAttack(){};
}
