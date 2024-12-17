package it.epicode.U5_W1_D2.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "foodsanddrinks")
@Data
public abstract class FoodAndDrink {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;

    private String name;
    private double price;
    private int calories;
}
