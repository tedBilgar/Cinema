package system.dao;

import system.model.Planet;

import java.util.List;

public interface PlanetRepository {
    List<Planet> getAllPlanet();
    String getNamePlanetByOrder(String order);
}
