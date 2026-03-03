package model;

import model.constans.Colour;
import model.constans.Discount;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian){
        this.amount=amount;
        this.price=price;
        this.isVegetarian = isVegetarian;
    }

    public int getAmount(){
        return amount;
    }
    public double getPrice(){
        return price;
    }
    public boolean hasVegetarian(){
        return isVegetarian;
    }

    @Override
    public double getDiscounter(String colour) {
        if (colour.equals(Colour.RED)) {
            return Discount.DISCOUNT;
        } else {
            return Discount.NODISCOUNT;
        }
    }
}
