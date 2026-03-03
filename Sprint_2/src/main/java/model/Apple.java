package model;

import model.constans.Colour;
import model.constans.Discount;

public class Apple extends Food {
    public String colour;

    public Apple(int amount, double price, String colour){
        super(amount,price,true);
        this.colour=colour;
    }


}
