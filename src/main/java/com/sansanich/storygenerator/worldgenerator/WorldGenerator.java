package com.sansanich.storygenerator.worldgenerator;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sansanich.storygenerator.World;
import com.sansanich.storygenerator.geology.Location;
import com.sansanich.storygenerator.templates.MapTemplate;
import com.sansanich.storygenerator.templates.Organization;
import com.sansanich.storygenerator.templates.Story;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WorldGenerator {

    static Gson gson = new Gson();

    public static World generateWorld(int randomIndex) throws IOException {

        World result = new World();

        result.map =  readMap(randomIndex);
        List<Location> locations = readAllLocations();
        fillAreasWithLocations(result, locations);

        List<Organization> orgs = readAllOranizations();
        fillAreasWithOrganizations(result, orgs);

        List<Story> stories = readAllStories();
        applyStories(result, stories);


        fillLocationsWithObjects(result);
        fillLocationsWithCharacters(result);

        applyStories(result, stories);


        return result;
        //ExclusionStrategy strategy = new ExclusionStrategy()
    }

    private static void applyStories(World result, List<Story> stories) {

    }

    private static void fillLocationsWithCharacters(World result) {

    }

    private static void fillLocationsWithObjects(World result) {

    }

    private static void fillAreasWithOrganizations(World result, List<Organization> orgs) {

    }

    private static void fillAreasWithLocations(World world, List<Location> locations) {

    }

    private static List<Story> readAllStories() {

        return null;
    }

    private static List<Location> readAllLocations() throws IOException {
        Path path = Paths.get("src/main/resources/game/rus/locations");
        Type userListType = new TypeToken<ArrayList<Location>>(){}.getType();

        List<Location> result = new ArrayList<>();
        Files.list(path).forEach( file ->
    {
            try {
                String content = content = Files.readString(file);
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

        return gson.fromJson(content, MapTemplate.class);
    }

    private static List<Organization> readAllOranizations() {
        return null;
    }
}
