package com.sansanich.storygenerator.geology;

import com.sansanich.storygenerator.creatures.Character;
import com.sansanich.storygenerator.creatures.Creature;
import com.sansanich.storygenerator.objects.InteractibleObject;

import java.util.ArrayList;

public class Location extends InteractibleObject {
    String visibilityCondition;
    ArrayList<Location> locations;
    ArrayList<InteractibleObject> objects;
    ArrayList<Creature> creatures;
    ArrayList<Character> characters;

}
