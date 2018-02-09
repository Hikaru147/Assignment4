package edu.ldsbc.assignment4;

import edu.ldsbc.assignment3.DessertItem;

public class IceCream2 extends DessertItem {

    private double cost;

    public IceCream2(String name, double cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public double calculateItemCost() {
        return (int) (cost);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "cost=" + cost +
                '}';
    }
}
