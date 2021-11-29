package com.sansanich.storygenerator.entities;

import java.util.ArrayList;

public class Location extends GameObject {
    String visibilityCondition;
    ArrayList<Location> locations;
    ArrayList<GameObject> objects;
    ArrayList<Character> characters;
}
