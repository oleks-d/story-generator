package com.sansanich.storygenerator.objects;

import com.sansanich.storygenerator.entities.NamedWithID;
import com.sansanich.storygenerator.entities.Trigger;
import com.sansanich.storygenerator.flow.Dialog;
import com.sansanich.storygenerator.items.Item;

import java.util.ArrayList;
import java.util.List;

public class InteractibleObject extends NamedWithID {

    List<Item> items;
    List<Dialog> dialogs;
    List<Trigger> triggers;

    String image;
}
