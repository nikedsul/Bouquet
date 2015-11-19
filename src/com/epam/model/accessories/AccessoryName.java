package com.epam.model.accessories;

/**
 * Enum AccessoryName describes accessories of the bouquet
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public enum AccessoryName {
    WRAPPING(3.0, 2.0, "wrapping"),
    GREETING_CARD(10.0, 1.5, "greeting card");

    /** Purchasing price of a type of accessory */
    private double purchasingPrice;

    /** Percent of the profit for every single type of accessory */
    private double extraCostPercent;

    /** Name of a type of the accessory */
    private String accessoryName;

    public double getPurchasingPrice() {
        return  purchasingPrice;
    }

    public double getExtraCost() {
        return extraCostPercent;
    }

    public String getAccessoryName() {
        return accessoryName;
    }

    /**
     * Constructor FlowerName
     * @param purchasingPrice Purchasing price of specific type of accessory
     * @param extraCost Entity of profit for each type of accessory
     * @param accessoryName Name of a type of accessory
     */
    AccessoryName(double purchasingPrice, double extraCost, String accessoryName) {

        this.purchasingPrice = purchasingPrice;
        this.accessoryName = accessoryName;
        this.extraCostPercent = extraCost;
    }


}
