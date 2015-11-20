package com.epam.model;

/**
 * Interface PriceMakeable install all type of prices for a component of the bouquet
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public interface PriceMakeable {

    /**
     * Value-added-tax (1.2 - means 20%)
     */
    double VAT = 1.2;

    void setRetailPrice();
    void setTotalPrice();
    double getRetailPrice();
    double getTotalPrice();
    double getPurchasingPrice();
    double getExtraCostPercent();
    int getQuantity();
}
