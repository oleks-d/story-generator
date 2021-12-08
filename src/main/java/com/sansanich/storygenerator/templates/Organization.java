package com.sansanich.storygenerator.templates;

import com.sansanich.storygenerator.entities.NamedWithID;
import com.sansanich.storygenerator.geology.Location;
import com.sansanich.storygenerator.items.Item;
import com.sansanich.storygenerator.objects.InteractibleObject;

import java.util.List;

public class Organization extends NamedWithID {
    List<Role> roles;
    List<Location> locationsToAdd;
    List<InteractibleObject> objectsToAdd;
    List<Item> itemsToAdd;
}
