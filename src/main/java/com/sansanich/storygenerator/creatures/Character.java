package com.sansanich.storygenerator.creatures;

import com.sansanich.storygenerator.entities.NamedWithID;

import java.util.ArrayList;

public class Character extends NamedWithID {

    public Creature body; // warrior, wolf etc.
    ArrayList<Trait> traits;

    ArrayList<String> organizations;
    int rating;
}
