package com.epam.model.flowers;

/**
 * Enum FlowerName contains names of flowers, the purchasing and retail prices of each type of flowers
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public enum FlowerName {
    ROSE            (20.0,  2.0,    "rose"),
    TULIP           (8.0,   1.5,    "tulip"),
    CARNATION       (15.0,  1.2,    "carnation"),
    CHRYSANTHEMUM   (15.2,  1.5,    "chrysanthemum");

    /** Purchasing price of a type of flowers */
    private double purchasingPrice;

    /** Volume of profit for each type of flowers */
    private double extraCostPercent;

    /**
     * Constructor FlowerName
     * @param purchasingPrice Purchasing price of a type of flowers
     * @param extraCost Volume of profit for each type of flowers
     * @param flowerName Name of a type of flowers
     */
    FlowerName(double purchasingPrice, double extraCost, String flowerName) {

        this.purchasingPrice = purchasingPrice;
        this.flowerName = flowerName;
        this.extraCostPercent = extraCost;
    }

    /** Name of a flower type */
    private String flowerName;

    public double getPurchasingPrice() {
        return  purchasingPrice;
    }

    public double getExtraCost() {
        return extraCostPercent;
    }

    public String getFlowerName() {
        return flowerName;
    }
}
