package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        // System.out.println("i got exe");
        addExtraCheese();
        addExtraToppings();
    }
}
