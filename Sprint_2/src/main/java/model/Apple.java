package model;

import model.constans.Colour;
import model.constans.Discount;

public class Apple extends Food implements Discountable{
    public String colour;

    public Apple(int amount, double price, String colour){
        super(amount,price,true);
        this.colour=colour;
    }
    @Override
    public double getDiscounter(String colour){
        if(colour.equals(Colour.RED)){
            return Discount.DISCOUNT;
        }
        else{
            return Discount.NODISCOUNT;
        }
    }
}
