package it.epicode.U5_W1_D2.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;

@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    @OneToMany
    ArrayList<Topping> toppings = new ArrayList<>();
    @OneToMany
    ArrayList<Pizza> pizzas = new ArrayList<>();
    @OneToMany
    ArrayList<Drink> drinks = new ArrayList<>();
}
