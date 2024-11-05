package edu.miu.service;

import edu.miu.entity.Plant;
import edu.miu.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlantService {

    @Autowired
    private PlantRepository plantRepository;

    public Plant save(Plant plant) {
        return plantRepository.save(plant);
    }

    public void delete(Long plantId) {
        this.findById(plantId).ifPresent(plant -> plantRepository.delete(plant));
    }

    public Optional<Plant> findById(Long id) {
        return plantRepository.findById(id);
    }

    public List<Plant> findAll() {
        return plantRepository.findAll();
    }

    public List<Plant> findAllSortedByName() {
        return plantRepository.findAllByOrderByNameAsc();
    }

    public List<Plant> findAllSortedByDate() {
        return plantRepository.findAllByOrderByPlantDateAsc();
    }

}
