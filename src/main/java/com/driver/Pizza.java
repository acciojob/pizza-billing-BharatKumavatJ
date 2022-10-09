package com.driver;

public class Pizza {

    private int price; // 300 
    private Boolean isVeg;
    private String bill;
    private int extraCeese;
    private int extraToppings;
    private int paperBag;
    private int totalPrice; // 300

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            totalPrice += 300;
            this.price = 300;
        }
        else{ 
            totalPrice += 400;
            this.price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
      
     
            if(this.extraCeese == 0){
                this.extraCeese += 80;
                this.totalPrice += 80;
            }
     
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isVeg){
            if(this.extraToppings == 0){
                this.totalPrice += 70;
                this.extraToppings += 70;
            }
        }else{
            if(this.extraToppings == 0){
                this.totalPrice += 120;
                this.extraToppings += 120;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(this.paperBag > 0) return;

        this.paperBag += 20;
        this.totalPrice += 20;
    }

    public String getBill(){
        // your code goes here

        this.bill = "";
        this.bill += "Base Price Of The Pizza: " + this.price;
        if(extraCeese > 0) {
            this.bill += "\nExtra Cheese Added: " + this.extraCeese;    
        }
        if(extraToppings > 0){
            this.bill += "\nExtra Toppings Added: " + this.extraToppings; 
        } 
        if(this.paperBag > 0){
            this.bill += "\nPaperbag Added: " + this.paperBag ;
        }         

        this.bill += "\nTotal Price: "  + this.totalPrice + "\n";
        
        return this.bill;
    }
}
