package com.epam.model.bouquet;

import com.epam.model.BouquetComponentsParent;
import com.epam.model.flowers.Flower;

/**
 * Class Bouquet describes bouquet
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public final class Bouquet {

    /** Extra cost for every bouquet assembled */
    private static final double EXTRA_COST = 1.05;

    /** Retail price of the bouquet */
    private double retailPrice;

    /** Total price of all items in the bouquet */
    private double totalPrice;

    /** Quantity of bouquets */
    private int quantity;

    /** Array of all items of bouquet */
    BouquetComponentsParent[] bouquet;

    /**
     * Constructor Bouquet
     * @param quantity needed quantity of bouquets
     * @param items array of all components needed for make bouquet
     */
    public Bouquet(int quantity, BouquetComponentsParent[] items) {
        this.quantity = quantity;
        this.bouquet = items;
        setRetailPrice();
        setTotalPrice();
    }

    /**
     * Method chooseFLowersByStemLength chooses flowers by stem length
     * @param length length of flower for looking for
     * @return string with flowers selected by given parameter
     */
    public String chooseFLowersByStemLength(int length) {
        StringBuilder stringBuilder = new StringBuilder("Flower(s) with stem length = " + length + " cm:\n");

        for(BouquetComponentsParent bouquetComponentsParent : bouquet) {
            if (bouquetComponentsParent.getClass().getSimpleName().equals("Flower")){
                Flower flower = (Flower)bouquetComponentsParent;
                if (flower.getStemLength() == length) {
                    stringBuilder.append(flower.toString() + "\n");
                }
            }
        }
        if (stringBuilder.length() > 0) {
            return stringBuilder.toString();
        } else {
            stringBuilder.append("There are no flowers of such stem length in the bouquet!");
            return stringBuilder.toString();
        }
    }

    /**
     * Method setRetailPrice() sets the retail price of the bouquet
     */
    public void setRetailPrice() {
        for(BouquetComponentsParent i : bouquet) {
            retailPrice += i.getRetailPrice();
        }
    }

    /**
     * Method setTotalPrice() sets the total price of the bouquet
     */
    public void setTotalPrice() {
        for(BouquetComponentsParent i : bouquet) {
            totalPrice += i.getTotalPrice();
        }
        totalPrice *= EXTRA_COST;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {

        if(bouquet.length != 0) {

            String string = "Your " + quantity + " bouquet(s) consist(s) of: \n";
            StringBuffer stringBuilder = new StringBuffer(string);
            for(BouquetComponentsParent i : bouquet) {
                stringBuilder.append(i.toString() + "\n");
            }
            return stringBuilder.toString() + "\nTotal price of the bouquet is " + String.format("%.2f", getTotalPrice())
                    + "\nYour profit is: " + String.format("%.2f", (getTotalPrice() - getRetailPrice()));

        } else {

            return super.toString();
        }
    }
}
