package edu.miu.runner;

import edu.miu.entity.Garden;
import edu.miu.entity.Plant;
import edu.miu.repository.PlantRepository;
import edu.miu.service.GardenService;
import edu.miu.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private GardenService gardenService;
    @Autowired
    private PlantService plantService;
    @Autowired
    private PlantRepository plantRepository;

    @Override
    public void run(String... args) throws Exception {

        // Create and Save a new Garden1
        Garden garden1 = new Garden();
        garden1.setId(1L);
        garden1.setName("Vegetable Patch");
        garden1.setSize(50.0);

//        garden1.setPlants(new ArrayList<>());
//        garden1.getPlants().add(plant1);
//        garden1.getPlants().add(plant2);

        garden1 = gardenService.save(garden1);

        ///////

        // Create and Save a new Garden2
        Garden garden2 = new Garden();
        garden2.setId(2L);
        garden2.setName("Herb Garden");
        garden2.setSize(20.0);

        garden2.setPlants(new ArrayList<>());
//        garden2.getPlants().add(plant3);

        garden2 = gardenService.save(garden2);

        ////////////////
        // Add Plants
        ///////////////

        String dateString = "";
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);

        Plant plant1 = new Plant();
        plant1.setId(1L);
        plant1.setName("Tomato");
        plant1.setType("Vegetable");

        dateString = "2023-03-10";
        try {
            plant1.setPlantDate(formatter.parse(dateString));
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }

        plant1.setGarden(garden1);

        plantService.save(plant1);



        Plant plant2 = new Plant();
        plant2.setId(2L);
        plant2.setName("Carrot");
        plant2.setType("Vegetable");

        dateString = "2023-02-20";
        try {
            plant2.setPlantDate(formatter.parse(dateString));
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }

        plant2.setGarden(garden1);

        plantService.save(plant2);



        Plant plant3 = new Plant();
        plant3.setId(3L);
        plant3.setName("Basil");
        plant3.setType("Herb");

        dateString = "2023-04-05";
        try {
            plant3.setPlantDate(formatter.parse(dateString));
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }

        plant3.setGarden(garden2);

        plantService.save(plant3);

        //////////////////////
        // Disply all gardens
        //////////////////////

        // Print all gardens

        System.out.println("Print all Gardens:\n");

        gardenService.findAll().forEach(
                garden -> System.out.println(garden)
        );
        System.out.println();

        //////////////////////
        // Disply all plants
        //////////////////////

        // Print plants sorted by name

        System.out.println("All Plant Sorted by Name:\n");

        plantService.findAllSortedByName().forEach(
                plant -> System.out.println(plant)
        );
        System.out.println();

        // Print plants sorted by name

        System.out.println("All Plant Sorted by Date:\n");

        plantService.findAllSortedByDate().forEach(
                plant -> System.out.println(plant)
        );
        System.out.println();

    }
}
