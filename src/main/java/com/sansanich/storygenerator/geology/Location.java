package com.sansanich.storygenerator.geology;

import com.sansanich.storygenerator.creatures.Character;
import com.sansanich.storygenerator.creatures.Creature;
import com.sansanich.storygenerator.enums.Binom;
import com.sansanich.storygenerator.flow.Condition;
import com.sansanich.storygenerator.flow.Dialog;
import com.sansanich.storygenerator.items.Item;
import com.sansanich.storygenerator.objects.InteractibleObject;

import java.util.ArrayList;
import java.util.List;

public class Location extends InteractibleObject {

    public List<Location> locations;
    public List<InteractibleObject> objects;
    public List<Creature> creatures;

    public List<Dialog> enterDialogs;
    public List<Dialog> exitDialogs;

    public List<String> creaturesToGenerate;
    public List<String> itemsToGenerate;
    public List<String> objectsToGenerate;

    public Binom binom;
    public int complexity;
}
