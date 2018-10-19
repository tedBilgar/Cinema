package system.dao;

import org.springframework.stereotype.Repository;
import system.model.Planet;

import java.util.Arrays;
import java.util.List;

@Repository
public class PlanetRepositoryImpl implements PlanetRepository {
    private static List<Planet> planets = Arrays.asList(new Planet("Earth","3"),new Planet("Mars","4"),
    new Planet("Pluto","9"));


    public List<Planet> getAllPlanet() {
        return planets;
    }

    public String getNamePlanetByOrder(String order) {
        for (Planet planet:
             planets) {
            if (planet.getOrder().equals(order)) return planet.getName();
        }
        return null;
    }
}
