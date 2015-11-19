package com.epam.model.accessories;

/**
 * Enum WrappingMaterial contains names of wrapping material and its purchasing price
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public enum WrappingMaterial {
    PAPER(1.2, "paper"), TRANSPARENT_FILM(1.8, "transparent film"), SISAL(2.5, "sisal"), FELT(5.2, "felt");

    /** Additional cost of a material */
    private double additionalCostOfMaterial;

    /** Material of wrapping */
    private String materialName;

    double additionalCostOfMaterial() {
        return  additionalCostOfMaterial;
    }

    String getMaterialName() {
        return materialName;
    }

    /**
     * Constructor WrappingMaterial
     * @param additionalCostOfMaterial additional cost for material
     */
    WrappingMaterial(double additionalCostOfMaterial, String materialName) {
        this.materialName = materialName;
        this.additionalCostOfMaterial = additionalCostOfMaterial;
    }
}
