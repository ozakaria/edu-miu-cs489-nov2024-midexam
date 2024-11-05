package edu.miu.service;

import edu.miu.repository.GardenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlantService {

    @Autowired
    private GardenRepository gardenRepository;

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
//    public Professor save(Professor professor) {
//        return professorRepository.save(professor);
//    }
//
//    public Optional<Professor> findById(Long id) {
//        return professorRepository.findById(id);
//    }
//
//    public List<Professor> findAll() {
//        return professorRepository.findAll();
//    }

}
