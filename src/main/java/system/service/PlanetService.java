package system.service;

import system.model.Planet;

import java.util.List;

public interface PlanetService {
    List<Planet> getAllPlanet();
    String getNamePlanetByOrder(String order);
}
