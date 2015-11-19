package com.epam.model;


/**
 * Class BouquetComponentsParent is parent of all possible components of the bouquet
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public abstract class BouquetComponentsParent implements PriceMakeable {

    /** Name of a type of the component */
    public String name;

    /** Purchasing price of a specific type of the component */
    public double purchasingPrice;

    /** Extra cost of a specific type of the component */
    public double extraCost;

    /** Retail price of a specific type of the component */
    public double retailPrice;

    /** Price of a chosen quantity of the component */
    public double totalPrice;

    /** Quantity of a specific type of the component */
    public int quantity;

    /** Chosen color of this type of the component */
    public String color;

    /**
     * Constructor
     * @param quantity
     */
    public BouquetComponentsParent(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setRetailPrice() {
        retailPrice = purchasingPrice * extraCost * VAT;
    }

    @Override
    public void setTotalPrice() {
        totalPrice = retailPrice * quantity;
    }

    @Override
    public double getRetailPrice() {
        return retailPrice;
    }

    @Override
    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public double getPurchasingPrice() {
        return purchasingPrice;
    }

    @Override
    public double getExtraCostPercent() {
        return extraCost;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
}
