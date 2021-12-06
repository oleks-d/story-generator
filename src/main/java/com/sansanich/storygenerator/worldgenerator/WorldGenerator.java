package com.sansanich.storygenerator.worldgenerator;

import com.google.gson.ExclusionStrategy;
import com.google.gson.Gson;
import com.sansanich.storygenerator.World;
import com.sansanich.storygenerator.templates.MapTemplate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class WorldGenerator {
    public static World generateWorld(int randomIndex) throws IOException {

        World result = new World();

        MapTemplate map =  readMap(randomIndex);
        readAllLocations();
        readAllOranizations();
        readAllStories();

        fillAreasWithLocations();
        fillAreasWithOrganizations();
        fillLocationsWithObjects();
        fillLocationsWithCharacters();

        applyStories();


        return result;
        //ExclusionStrategy strategy = new ExclusionStrategy()
    }

    private static void applyStories() {

    }

    private static void fillLocationsWithCharacters() {

    }

    private static void fillLocationsWithObjects() {

    }

    private static void fillAreasWithOrganizations() {

    }

    private static void fillAreasWithLocations() {

    }

    private static void readAllStories() {

    }

    private static void readAllLocations() {

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

        Gson gson = new Gson();

        return gson.fromJson(content, MapTemplate.class);
    }

    private static void readAllOranizations() {
    }
}
