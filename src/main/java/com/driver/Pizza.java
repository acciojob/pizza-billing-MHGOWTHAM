package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;
    boolean isExtraCheeseAdded;
    boolean isExtraToppingAdded;
    boolean isGeneratedBill;
    boolean isTakeAwayAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtraCheeseAdded=false;
        this.isExtraToppingAdded=false;
        this.isGeneratedBill=false;
        this.isTakeAwayAdded=false;
        this.bill="";
        // your code goes here
        if(isVeg){
            this.price=300;
            this.toppings=70;
        }
        else{
            this.price=400;
            this.toppings=120;
        }
        this.cheese=80;
        this.bill+="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            this.price=this.price+cheese;
            isExtraCheeseAdded=true;
        }
        return ;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingAdded){
            this.price=this.price+toppings;
            isExtraToppingAdded=true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            this.price+=20;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isGeneratedBill){
            if(isExtraCheeseAdded)
                this.bill+="Extra Cheese Added: "+this.cheese+"\n";
            if(isExtraToppingAdded)
                this.bill+="Extra Toppings Added: "+this.toppings+"\n";
            if(isTakeAwayAdded) {
                this.bill += "Paperbag Added: " + "20" + "\n";
            }
            this.bill+="Total Price: "+this.price+"\n";
            isGeneratedBill=true;

        }
        return this.bill;
    }
}
