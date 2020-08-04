package com.teng;

public class HealthyBurger extends Hamburger {

    private String extra1Name;
    private double extra1Price;

    private String extra2Name;
    private double extra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Hearty Italian");
    }

    public void healthyAddtional1(String name, double price){
        this.extra1Name = name;
        this.extra1Price = price;
    }

    public void healthyAddtional2(String name, double price){
        this.extra2Name = name;
        this.extra2Price = price;
    }

    @Override
    public double itemizeHamburg() {
        double hamburgerPrice = super.itemizeHamburg();
        if (this.extra1Name != null){
            hamburgerPrice += extra1Price;
            System.out.println("Added " + this.extra1Name + " for an extra of $" + this.extra1Price);
        }
        if (this.extra2Name != null){
            hamburgerPrice += extra2Price;
            System.out.println("Added " + this.extra2Name + " for an extra of $" + this.extra2Price);
        }
        System.out.println("Total price is $" + hamburgerPrice);
        return hamburgerPrice;
    }
}
