package edu.ldsbc.assignment4;

import edu.ldsbc.assignment3.DessertItem;

public class Cookie2 extends DessertItem {

    private double pricePerDozen;
    private int number;

    public Cookie2(String name, double pricePerDozen, int number) {
        super(name);
        this.pricePerDozen = pricePerDozen;
        this.number = number;
    }

    @Override
    public double calculateItemCost() {
        return (int) ((number / 12) * pricePerDozen);
    }

    @Override
    public String toString() {
        return "Cookie{" +
                "pricePerDozen=" + pricePerDozen +
                ", number=" + number +
                '}';
    }
}
