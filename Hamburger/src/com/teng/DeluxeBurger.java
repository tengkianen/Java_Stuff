package com.teng;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Wagyu Beef", 17.50, "Flatbread");
        super.Additional1("Fries", 3.5);
        super.Additional2("Drink", 2.25);
    }

    @Override
    public void Additional1(String name, double price) {
        System.out.println("Unable to add items to deluxe burger");
    }

    @Override
    public void Additional2(String name, double price) {
        System.out.println("Unable to add items to deluxe burger");
    }

    @Override
    public void Additional3(String name, double price) {
        System.out.println("Unable to add items to deluxe burger");
    }

    @Override
    public void Additional4(String name, double price) {
        System.out.println("Unable to add items to deluxe burger");
    }
}
