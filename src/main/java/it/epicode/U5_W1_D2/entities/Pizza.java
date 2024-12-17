package it.epicode.U5_W1_D2.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.ArrayList;

@Entity
@Table(name = "pizzas")
@Data
public class Pizza extends FoodAndDrink{

    @OneToMany
    private ArrayList<Topping> toppingList = new ArrayList<>();

    public void setCalories(){
        int calories = 1000;
        if (!toppingList.isEmpty()){
            for (int i = 0; i < toppingList.size(); i++) {
                Topping topping = toppingList.get(i);
                calories += topping.getCalories();
            }
            setCalories(calories);
        }
    }

    public void setPrice(){
        double price = 4.40;
        if (!toppingList.isEmpty()){
            for (int i = 0; i < toppingList.size(); i++) {
                Topping topping = toppingList.get(i);
                price += topping.getPrice();
            }
            setPrice(price);
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + getName() + '\'' +
                ", calories=" + getCalories() +
                ", price=" + getPrice() +
                ", toppingList=" + toppingList +
                '}';
    }


}
