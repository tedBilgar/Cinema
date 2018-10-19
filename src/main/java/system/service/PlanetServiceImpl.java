package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.PlanetRepository;
import system.model.Planet;

import java.util.List;

@Service
public class PlanetServiceImpl implements PlanetService {

    @Autowired
    private PlanetRepository planetRepository;

    public List<Planet> getAllPlanet() {
        return planetRepository.getAllPlanet();
    }

    public String getNamePlanetByOrder(String order) {
        return planetRepository.getNamePlanetByOrder(order);
    }
}
