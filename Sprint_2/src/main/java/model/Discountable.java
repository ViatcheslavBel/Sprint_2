package model;

public interface Discountable {
    default double getDiscounter(String colour){
        return 0;
    };

    //double getDiscounter(String colour);
}
