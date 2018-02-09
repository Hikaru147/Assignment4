package edu.ldsbc.assignment4;

import edu.ldsbc.assignment3.IceCream;

public class Sundae2 extends IceCream {

    private String toppingName;
    private double toppingCost;

    public Sundae2(String name, double cost, String toppingName, double toppingCost) {
        super(name, cost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }



    @Override
    public double calculateItemCost() {
        return (int) (toppingCost + super.calculateItemCost());
    }

    @Override
    public String toString() {
        return "Sundae{" +
                "toppingName='" + toppingName + '\'' +
                ", toppingCost=" + toppingCost +
                '}';
    }
}
