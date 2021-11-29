package com.sansanich.storygenerator.entities;

import com.sansanich.storygenerator.skills.Skill;

import java.util.ArrayList;

public class Character extends GameObject{
    ArrayList<Skill> skills;
    ArrayList<Trait> traits;
    CharAttributes stats;
    Location currentLocation;

    ArrayList<String> organizations;
    int rating;
}
