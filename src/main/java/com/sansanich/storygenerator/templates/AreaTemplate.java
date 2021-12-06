package com.sansanich.storygenerator.templates;

import com.sansanich.storygenerator.entities.NamedWithID;
import com.sansanich.storygenerator.enums.Binom;
import com.sansanich.storygenerator.objects.InteractibleObject;

import java.util.List;

public class AreaTemplate extends NamedWithID {
    int complexity;
    Binom binom;
    List<InteractibleObject> ways;

}
