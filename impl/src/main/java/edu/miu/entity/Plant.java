package edu.miu.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    private Date plantDate;

    @ManyToOne
    @JoinColumn(name = "garden_id")
    private Garden garden;

    @Override
    public String toString() {
        return "Plant{" +
                "ID = " + id +
                ", Name = '" + name + '\'' +
                ", Type = '" + type + '\'' +
                ", plantDate = " + plantDate +
                ", garden = " + garden.getName() +
                '}';
    }
}
