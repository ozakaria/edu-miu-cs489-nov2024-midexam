package edu.miu.repository;

import edu.miu.entity.Course;
import edu.miu.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByDepartmentOrderByNameAsc(Department department);

    // Retrieve courses for a specific department, ordered by course name
    List<Course> findByDepartmentIdOrderByNameAsc(Long departmentId);
}
