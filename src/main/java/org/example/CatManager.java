package org.example;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CatManager {

    private static final String FILE_NAME = "cat_map.json";
    private Map<String, Cat> catMap;

    public CatManager() {
        this.catMap = new HashMap<>();
    }

    public void saveMap() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(FILE_NAME), catMap);
    }

    public void loadMap() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        catMap = mapper.readValue(new File(FILE_NAME),
                mapper.getTypeFactory().
                        constructParametricType(Map.class, String.class, Cat.class));
    }

    public void addCat(String name, Cat cat) {
        catMap.put(name, cat);
    }

    public Cat getCat(String name) {
        return catMap.get(name);
    }

}