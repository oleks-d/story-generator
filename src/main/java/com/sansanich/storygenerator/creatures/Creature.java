package com.sansanich.storygenerator.creatures;

import com.sansanich.storygenerator.geology.Location;
import com.sansanich.storygenerator.objects.InteractibleObject;
import com.sansanich.storygenerator.skills.Skill;

import java.util.ArrayList;

public class Creature extends InteractibleObject {
    ArrayList<Skill> skills;
    CreatureAttributes stats;
    public Location currentLocation;
}
