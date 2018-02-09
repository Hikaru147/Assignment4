package edu.ldsbc.assignment4;

import edu.ldsbc.assignment3.DessertItem;

public class Candy2 extends DessertItem {

    private double weight;
    private double costPerLb;

    public Candy2(String name, double weight, double costPerLb) {
        super(name);
        this.weight = weight;
        this.costPerLb = costPerLb;
    }

    @Override
    public double calculateItemCost() {
        return (int) (weight * costPerLb);
    }

    @Override
    public String toString() {
        return "Candy{" +
                "weight=" + weight +
                ", costPerLb=" + costPerLb +
                '}';
    }
}
