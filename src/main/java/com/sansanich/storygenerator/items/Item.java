package com.sansanich.storygenerator.items;

import com.sansanich.storygenerator.entities.NamedWithID;

public class Item extends NamedWithID {
    String image;
    int count;

    String featuresDescription; // description of special item

    SpecialItem features;

}
