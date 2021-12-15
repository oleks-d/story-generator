package com.sansanich.storygenerator.worldgenerator;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sansanich.storygenerator.World;
import com.sansanich.storygenerator.creatures.Creature;
import com.sansanich.storygenerator.geology.Location;
import com.sansanich.storygenerator.items.Item;
import com.sansanich.storygenerator.objects.InteractibleObject;
import com.sansanich.storygenerator.templates.MapTemplate;
import com.sansanich.storygenerator.templates.Organization;
import com.sansanich.storygenerator.templates.Story;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class WorldGenerator {

    static Gson gson = new Gson();
    static Path objectsPath = Paths.get("src/main/resources/game/rus/objects");
    static Path itemsPath = Paths.get("src/main/resources/game/rus/items");
    static Path creaturesPath = Paths.get("src/main/resources/game/rus/creatures");
    static Path locationsPath = Paths.get("src/main/resources/game/rus/locations");
    static Path orgsPath = Paths.get("src/main/resources/game/rus/organizations");
    static Path storiesPath = Paths.get("src/main/resources/game/rus/stories");

    public static World generateWorld(int randomIndex) throws IOException {

        World result = new World();

        result.map =  readMap(randomIndex);
        List<Location> locations = readAllLocations();
        fillAreasWithLocations(result, locations);

//        List<Organization> orgs = readAllOranizations();
//        fillAreasWithOrganizations(result, orgs);

//        List<Story> stories = readAllStories();
//        applyStories(result, stories);

        List<InteractibleObject> objects = readAllObjects();
        fillLocationsWithObjects(result, objects);

        List<Item> items = readAllItems();
        fillLocationsWithItems(result, items);

        List<Creature> creatures = readAllCreatures();
        fillLocationsWithCreatures(result, creatures);

//        applyStories(result, stories);


        return result;
    }

    private static void applyStories(World result, List<Story> stories) {

    }

    private static void fillLocationsWithCharacters(World result) {

    }

    private static void fillLocationsWithObjects(World result, List<InteractibleObject> objects) {
        for (Location a : result.map.areas)
            if (a.locations != null)
                a.locations.forEach(location ->  fillLocationWithObject(a, objects));
    }

    private static void fillLocationWithObject(Location a, List<InteractibleObject> objects) {
        if(a.objects == null)
            a.objects = new ArrayList<>();

        //TODO add TYPES of Objects to generate (container, buff/debuff place, etc.)
        if(a.objectsToGenerate != null) {
            Set<InteractibleObject> objectsToAdd = objects.stream().filter(o -> a.objectsToGenerate.contains(o.id)).collect(Collectors.toSet());
            a.objects.addAll(objectsToAdd);
        }

    }

    private static void fillLocationsWithItems(World result, List<Item> objects) {
        for (Location a : result.map.areas)
            if (a.locations != null)
                a.locations.forEach(location -> fillLocationWithItems(a, objects));
    }

    private static void fillLocationWithItems(Location a, List<Item> objects) {
        if(a.items == null)
            a.items = new ArrayList<>();

        //TODO add TYPES of Items to generate (food, weapon, etc.)
        if(a.itemsToGenerate != null) {
            Set<Item> objectsToAdd = objects.stream().filter(o -> a.itemsToGenerate.contains(o.id)).collect(Collectors.toSet());
            a.items.addAll(objectsToAdd);
        }
    }

    private static void fillLocationsWithCreatures(World result, List<Creature> objects) {
        for (Location a : result.map.areas)
                if (a.locations != null)
                    a.locations.forEach(location -> fillLocationWithCreatures(location, objects));
    }

    private static void fillLocationWithCreatures(Location a, List<Creature> objects) {
        if(a.creatures == null)
            a.creatures = new ArrayList<>();

        //TODO add TYPES of Creatures to generate (animal, miner, etc.)
        if(a.creaturesToGenerate != null) {
            Set<Creature> objectsToAdd = objects.stream().filter(o -> a.creaturesToGenerate.contains(o.id)).collect(Collectors.toSet());
            a.creatures.addAll(objectsToAdd);
        }
    }

    private static void fillAreasWithOrganizations(World result, List<Organization> orgs) {

    }

    private static void fillAreasWithLocations(World world, List<Location> locations) {

        Comparator<? super Location> locationsNumberCamparator = new Comparator<Location>() {
            @Override
            public int compare(Location o1, Location o2) {
                if (o1.locations.size() < o2.locations.size()){
                    return -1;
                } else {
                    return 1;
                }
            }
        };

        for(int i = 0 ; i < locations.size() ;i++){
            Location curLoc = locations.get(i);
            world.map.areas.stream().filter(a -> a.binom.equals(curLoc.binom)).sorted(locationsNumberCamparator).findFirst().map(a -> a.locations.add(curLoc));
        }
    }


    private static List<Story> readAllStories() {

        return null;
    }

    private static List<Location> readAllLocations() throws IOException {
        Type userListType = new TypeToken<ArrayList<Location>>(){}.getType();

        List<Location> result = new ArrayList<>();
        Files.list(locationsPath).forEach( file ->
    {
            try {
                String content = Files.readString(file);
                result.addAll(gson.fromJson(content, userListType));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


        return result;
    }

    private static List<InteractibleObject> readAllObjects() throws IOException {
        Type userListType = new TypeToken<ArrayList<InteractibleObject>>(){}.getType();

        List<InteractibleObject> result = new ArrayList<>();
        Files.list(objectsPath).forEach( file ->
        {
            try {
                String content = Files.readString(file);
                result.addAll(gson.fromJson(content, userListType));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


        return result;
    }

    private static List<Item> readAllItems() throws IOException {
        Type userListType = new TypeToken<ArrayList<Item>>(){}.getType();

        List<Item> result = new ArrayList<>();
        Files.list(itemsPath).forEach( file ->
        {
            try {
                String content = Files.readString(file);
                result.addAll(gson.fromJson(content, userListType));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


        return result;
    }

    private static List<Creature> readAllCreatures() throws IOException {
        Type userListType = new TypeToken<ArrayList<Creature>>(){}.getType();

        List<Creature> result = new ArrayList<>();
        Files.list(creaturesPath).forEach( file ->
        {
            try {
                String content = Files.readString(file);
                result.addAll(gson.fromJson(content, userListType));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


        return result;
    }

    private static MapTemplate readMap(int rndomKey) throws IOException {

        Path mapFile = Paths.get("src/main/resources/game/rus/map/Arelon.json");

        //Path mapFile = Files.list(path).findFirst().orElseThrow(() -> new IOException("Map not found"));
        String content = "";
        try {
            content = Files.readString(mapFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        MapTemplate map = gson.fromJson(content, MapTemplate.class);
        map.areas.stream().filter(f -> f.locations == null).forEach( f -> f.locations = new ArrayList<Location>());
        return map;
    }

    private static List<Organization> readAllOranizations() {
        return null;
    }
}
