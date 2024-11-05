package edu.miu.entity;

import lombok.Data;
import jakarta.persistence.*;
import java.util.List;

@Data
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToMany(mappedBy = "courses")
    private List<Professor> professors;

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", professors=" + professors +
                '}';
    }
}
