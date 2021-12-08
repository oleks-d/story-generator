package com.sansanich.storygenerator;

import com.sansanich.storygenerator.creatures.Character;
import com.sansanich.storygenerator.geology.Location;
import com.sansanich.storygenerator.templates.MapTemplate;

import java.util.ArrayList;
import java.util.HashMap;

public class World {
    public MapTemplate map = new MapTemplate();
    public ArrayList<Character> characters = new ArrayList<>();
    public Timeline timeline = new Timeline();
    public HashMap<String, String> triggers = new HashMap();
}
