package br.com.project.biomuni.service;

import br.com.project.biomuni.model.Drone;
import br.com.project.biomuni.model.Sprinkler;
import br.com.project.biomuni.repository.DroneRepository;
import br.com.project.biomuni.repository.SprinklerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class WeatherService {
    @Autowired
    private DroneRepository droneRepository;

    @Autowired
    private SprinklerRepository sprinklerRepository;

    public Drone activateDrone(Drone drone){
        return droneRepository.save(drone);
    }

    public Drone findDroneById(Long id){
        return droneRepository.findById(id).get();
    }

    List <Drone> drones = droneRepository.findAll();

    public void deleteDrone(Long id){
        droneRepository.deleteById(id);
    }

    public Sprinkler activateSprinkler(Sprinkler sprinkler){
        return sprinklerRepository.save(sprinkler);
    }

    public Sprinkler findSprinklerById(Long id){
        return sprinklerRepository.findById(id).get();
    }

    List <Sprinkler> sprinklers = sprinklerRepository.findAll();

    public void deleteSprinkler(Long id){
        sprinklerRepository.deleteById(id);
    }

}
