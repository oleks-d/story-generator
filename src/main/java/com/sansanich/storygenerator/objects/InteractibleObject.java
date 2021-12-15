package com.sansanich.storygenerator.objects;

import com.sansanich.storygenerator.entities.NamedWithID;
import com.sansanich.storygenerator.entities.Trigger;
import com.sansanich.storygenerator.flow.Condition;
import com.sansanich.storygenerator.flow.Dialog;
import com.sansanich.storygenerator.items.Item;

import java.util.ArrayList;
import java.util.List;

public class InteractibleObject extends NamedWithID {

    public Condition visibility;
    public List<Item> items;
    public List<Dialog> dialogs;

    public String image;
}
