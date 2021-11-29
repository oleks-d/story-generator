package com.sansanich.storygenerator.objects;

import com.sansanich.storygenerator.entities.NamedWithID;
import com.sansanich.storygenerator.entities.Trigger;
import com.sansanich.storygenerator.flow.Dialog;
import com.sansanich.storygenerator.items.Item;

import java.util.ArrayList;

public class InteractibleObject extends NamedWithID {

    ArrayList<Item> items;
    ArrayList<Dialog> dialogs;
    ArrayList<Trigger> triggers;

    String image;
}
