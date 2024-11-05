package edu.miu.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Garden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double size;

    @OneToMany(mappedBy = "garden", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Plant> plants;

    @Override
    public String toString() {
        return "Garden{" +
                "ID = " + id +
                ", Name = '" + name + '\'' +
                ", Size = " + size + " m2"+
                '}';
    }
}
