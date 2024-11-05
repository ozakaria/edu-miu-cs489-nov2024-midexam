package edu.miu.service;

import edu.miu.entity.Garden;
import edu.miu.repository.GardenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GardenService {

    @Autowired
    private GardenRepository gardenRepository;

    public Garden save(Garden garden) {
        return gardenRepository.save(garden);
    }

    public void delete(Long gardenId) {
        this.findById(gardenId).ifPresent(garden -> gardenRepository.delete(garden));
    }

    public Optional<Garden> findById(Long id) {
        return gardenRepository.findById(id);
    }

    public List<Garden> findAll() {
        return gardenRepository.findAll();
    }

}
