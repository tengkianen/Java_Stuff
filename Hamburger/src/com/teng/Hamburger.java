package com.teng;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String bread_type;

    private String add1Name;
    private double add1Price;

    private String add2Name;
    private double add2Price;

    private String add3Name;
    private double add3Price;

    private String add4Name;
    private double add4Price;

    public Hamburger(String name, String meat, double price, String bread_type) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bread_type = bread_type;
    }


    public void Additional1(String name, double price){
        this.add1Name = name;
        this.add1Price = price;
    }

    public void Additional2(String name, double price){
        this.add2Name = name;
        this.add2Price = price;
    }

    public void Additional3(String name, double price){
        this.add3Name = name;
        this.add3Price = price;
    }

    public void Additional4(String name, double price){
        this.add4Name = name;
        this.add4Price = price;
    }

    public double itemizeHamburg(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger" + " on a " + this.bread_type + " roll" + " price is $" + this.price);
        if(this.add1Name != null){
            hamburgerPrice += this.add1Price;
            System.out.println("Added " + this.add1Name + " for an extra of $" + this.add1Price);
        }
        if(this.add2Name != null){
            hamburgerPrice += this.add2Price;
            System.out.println("Added " + this.add2Name + " for an extra of $" + this.add2Price);
        }
        if(this.add3Name != null){
            hamburgerPrice += this.add3Price;
            System.out.println("Added " + this.add3Name + " for an extra of $" + this.add3Price);
        }
        if(this.add4Name != null){
            hamburgerPrice += this.add4Price;
            System.out.println("Added " + this.add4Name + " for an extra of $" + this.add4Price);
        }
        System.out.println("Total price is $" + hamburgerPrice);
        return hamburgerPrice;
    }

}
