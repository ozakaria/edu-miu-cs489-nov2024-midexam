package edu.miu.repository;

import edu.miu.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    // List all professors, sorted by last name in ascending order
    List<Professor> findAllByOrderByLastNameAsc();
}
