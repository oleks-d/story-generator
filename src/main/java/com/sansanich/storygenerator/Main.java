package com.sansanich.storygenerator;

import com.sansanich.storygenerator.geology.Location;
import com.sansanich.storygenerator.worldgenerator.WorldGenerator;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        World world = getWorld("");
        Hero hero = getHero("", world);

        game(world, hero);



    }

    private static void game(World world, Hero hero) {
        //showLocation(hero.body.currentLocation);
        String stage = "";
        while((stage = turn(world, hero)) != null) {
            System.out.println(stage);
            if (stage.equals("q")) {
                    break;
            }
            if (stage.equals("_")) {
                System.out.println(world.timeline.isDay()? "День":"Ночь");
            }
        }
    }

    private static void showLocation(Location currentLocation) {

    }

    private static String turn(World world, Hero hero) {
        Scanner s = new Scanner(System.in);
        return s.next();
    }

    private static World getWorld(String savedName) throws IOException {
        if(savedName.equals(""))
            return WorldGenerator.generateWorld(savedName.hashCode());
        else
            return loadWorld(savedName);
    }

    private static World loadWorld(String savedName) {
        return null;
    }

    private static World generateWorld() {
        return null;
    }

    private static Hero getHero(String savedName, World world) {
        if(savedName.equals(""))
            return generateHero(world);
        else
            return loadHero(savedName);
    }

    private static Hero loadHero(String savedName) {
        return null;
    }

    private static Hero generateHero(World world) {
        Hero newHero = new Hero();
       // newHero.body.currentLocation = world.areas.get(0);

        return null;
    }
}
