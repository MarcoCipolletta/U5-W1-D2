package it.epicode.U5_W1_D2.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name = "drinks")
@Data
public class Drink extends FoodAndDrink {
}
