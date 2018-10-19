package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import system.model.Planet;
import system.service.PlanetService;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private PlanetService planetService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String showMainPage(){
        return "main";
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    @ResponseBody
    public String simple(){
        return "true";
    }

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    @ResponseBody
    public List<Planet> getPlanets(){
        return planetService.getAllPlanet();
    }

    @RequestMapping(value = "/name",method = RequestMethod.GET)
    @ResponseBody
    public String getName(){
        return planetService.getNamePlanetByOrder("4");
    }
}
