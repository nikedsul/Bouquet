package com.epam.model.accessories;

import com.epam.model.BouquetComponentsParent;

/**
 * Class Wrapping describes wrapping for bouquet
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public class Wrapping extends BouquetComponentsParent {

    /** The name of the material of the wrapping */
    private String wrappingMaterial;

    public String getColor() {
        return color;
    }

    public String getWrappingMaterial() {
        return wrappingMaterial;
    }

    /**
     * Constructor for accessories
     * @param accessoryName
     * @param material
     * @param quantity
     * @param color
     */
    public Wrapping(AccessoryName accessoryName, WrappingMaterial material, int quantity, String color) {
        super(quantity);
        this.wrappingMaterial = material.getMaterialName();
        this.extraCost = accessoryName.getExtraCost();
        this.quantity = quantity;
        this.purchasingPrice = material.additionalCostOfMaterial() * accessoryName.getPurchasingPrice();
        this.color = color;
        this.name = accessoryName.getAccessoryName();
        setRetailPrice();
        setTotalPrice();
    }

    @Override
    public String toString() {
        return "Component: " + name
                + ". Material: " + getWrappingMaterial()
                + ". Color: " + getColor()
                + ". Quantity: " + getQuantity()
                + ". Retail price: " + String.format("%.2f", getRetailPrice())
                + ". Total price: " + String.format("%.2f", getTotalPrice());
    }
}
