package it.epicode.U5_W1_D2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "toppings")
@Data
public class Topping extends FoodAndDrink {
}
