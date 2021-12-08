package com.sansanich.storygenerator.templates;

import com.sansanich.storygenerator.creatures.Trait;
import com.sansanich.storygenerator.flow.Dialog;
import com.sansanich.storygenerator.geology.Location;

import java.util.List;
import java.util.Map;

public class Story {
    Map<String,List<Trait>> actors;
    Map<String,List<Location>> places;
    List<Dialog> dialogs;

}
