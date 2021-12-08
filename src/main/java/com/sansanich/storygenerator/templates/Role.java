package com.sansanich.storygenerator.templates;

import com.sansanich.storygenerator.creatures.Trait;
import com.sansanich.storygenerator.entities.NamedWithID;
import com.sansanich.storygenerator.flow.Dialog;
import com.sansanich.storygenerator.geology.Location;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Role extends NamedWithID {
    List<Trait> requirements;
    List<Dialog> dialogs;
    Location home;
    Location work;
    Location hobby;
    Map<Integer, Location> schedule;

}
