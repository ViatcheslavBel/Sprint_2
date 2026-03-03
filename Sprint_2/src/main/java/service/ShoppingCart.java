package service;

import model.Apple;
import model.Food;
import model.Meat;

public class ShoppingCart {
    Food[] basket;

    public ShoppingCart(Food[] basket){
        for (int i = 0; i < basket.length; i++) {
            if(basket[i] instanceof Meat){
                basket[i] = (Meat) basket[i];
            }
            if(basket[i] instanceof Apple){
                basket[i] = (Apple) basket[i];
            }
        }
    }

    public double sumWithoutDiscount(Food[] basket){
        double sum=0;
        for (int i = 0; i<basket.length; i++){
            if(basket[i] instanceof Meat){
                Meat meat = (Meat) basket[i];
                sum += meat.getAmount() * meat.getPrice();
            }
            if(basket[i] instanceof Apple){
                Apple apple = (Apple) basket[i];
                sum += apple.getAmount()*apple.getPrice();
            }

        }
        return sum;
    }

    public double sumWithDiscount(Food[] basket){
        double sum=0;
        for (int i=0;i<basket.length;i++){
            if(basket[i] instanceof Meat){
                Meat meat = (Meat) basket[i];
                sum += meat.getAmount() * meat.getPrice();
            }
            if(basket[i] instanceof Apple){
                Apple apple = (Apple) basket[i];
                sum += apple.getAmount() * apple.getPrice()-0.01*apple.getAmount() * apple.getPrice()*(100-apple.getDiscounter(apple.colour));
            }
        }
        return sum;
    }

    public double sumVeganWithoutDiscount(Food[] basket) {
        double sum = 0;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] instanceof Apple) {
                Apple apple = (Apple) basket[i];
                if (apple.hasVegetarian() == true){
                    sum += apple.getAmount() * apple.getPrice();
                }
            }
        }
        return sum;
    }

}
