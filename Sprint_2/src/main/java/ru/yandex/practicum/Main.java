package ru.yandex.practicum;

import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5,100);
        Apple appleRed = new Apple(10,50, "Red");
        Apple appleGreen = new Apple(10,50, "Green");

        Food[] basket2 = new Food[]{meat,appleRed,appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(basket2);
        System.out.println(shoppingCart.sumWithoutDiscount(basket2));
        System.out.println(shoppingCart.sumWithDiscount(basket2));
        System.out.println(shoppingCart.sumVeganWithoutDiscount(basket2));

    }
}