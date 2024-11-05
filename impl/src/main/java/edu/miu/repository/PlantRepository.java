package edu.miu.repository;

import edu.miu.entity.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlantRepository extends JpaRepository<Plant, Long> {
    // Retrieve plant, ordered by name
    List<Plant> findAllByOrderByNameAsc();

    // Retrieve plant, ordered by plantDate
    List<Plant> findAllByOrderByPlantDateAsc();
}
