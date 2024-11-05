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
//    @Autowired
//    private PlantService plantService;

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

//    public List<Professor> getAllProfessorsSortedByLastName() {
//        return professorRepository.findAllByOrderByLastNameAsc();
//    }
//
//    public Professor setAddressForProfessor(Long professorId, Address address) {
//        Optional<Professor> professorOpt = professorRepository.findById(professorId);
//        if (professorOpt.isPresent()) {
//            Professor professor = professorOpt.get();
//            professor.setAddress(address);
//            return professorRepository.save(professor);
//        }
//        return null;
//    }
//
}
