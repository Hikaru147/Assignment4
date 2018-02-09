package edu.ldsbc.assignment4;

import edu.ldsbc.assignment3.DessertItem;

import java.util.ArrayList;

public class Checkout2 {

    ArrayList<DessertItem> theList = new ArrayList<DessertItem>();


    public void add(DessertItem element) {
        theList.add(element);
    }

    public double totalCost() {
        double totalCost = 0;
        for (DessertItem dessertItem:
             theList) {
            totalCost += dessertItem.calculateItemCost();
        }
        System.out.println(totalCost);
        return totalCost;
    }

    // calculate
    public void printReceipt() {
        for (DessertItem dessertItem:
                theList) {
            System.out.println(dessertItem);
        }

    }
}

