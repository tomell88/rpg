package com.elliott.rpg.core;

import com.elliott.rpg.domain.Entity;

import java.util.HashMap;
import java.util.Map;

public class EntityLocationMap {

    private final Map<Integer, Entity> entityMap;

    public EntityLocationMap() {
        entityMap = new HashMap<>();
    }

    public void addToEntityLocationMap(Integer locationKey, Entity entity) {
        entityMap.put(locationKey, entity);
    }

    public Map<Integer, Entity> getEntityMap() {
        return entityMap;
    }
}
