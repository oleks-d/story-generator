package com.sansanich.storygenerator;

import com.sansanich.storygenerator.entities.Location;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        World world = getWorld("");
        Hero hero = getHero("");

        game(world, hero);



    }

    private static void game(World world, Hero hero) {
        //showLocation(hero.currentLocation);
        String stage = "";
        while((stage = turn()) != null) {
            System.out.println(stage);
            if (stage.equals("q")) {
                    break;
            }
        }
    }

    private static void showLocation(Location currentLocation) {

    }

    private static String turn() {
        Scanner s = new Scanner(System.in);
        return s.next();
    }

    private static World getWorld(String savedName) {
        if(savedName.equals(""))
            return generateWorld();
        else
            return loadWorld(savedName);
    }

    private static World loadWorld(String savedName) {
        return null;
    }

    private static World generateWorld() {
        return null;
    }

    private static Hero getHero(String savedName) {
        if(savedName.equals(""))
            return generateHero();
        else
            return loadHero(savedName);
    }

    private static Hero loadHero(String savedName) {
        return null;
    }

    private static Hero generateHero() {
        return null;
    }
}
