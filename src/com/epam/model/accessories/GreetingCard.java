package com.epam.model.accessories;

import com.epam.model.BouquetComponentsParent;

/**
 * Class GreetingCard describes cards for our bouquet
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public class GreetingCard extends BouquetComponentsParent {

    /** Optional text in a card - incur additional charges */
    private boolean text;

    /**
     * Constructor GreetingCard
     * @param quantity number of greeting cards needed
     * @param text - boolean parameter means "with or without a text"
     */
    public GreetingCard(AccessoryName accessoryName, int quantity, boolean text) {
        super(quantity);
        this.name = accessoryName.getAccessoryName();
        this.purchasingPrice = accessoryName.getPurchasingPrice();
        this.extraCost = accessoryName.getExtraCost();
        this.quantity = quantity;
        this.text = text;
        setRetailPrice();
        setTotalPrice();
    }

    @Override
    public final void setRetailPrice() {
        this.retailPrice = (purchasingPrice * extraCost * VAT) + (text ? 3.0 : 0);
    }

    @Override
    public String toString() {
        return "Component: greeting card. With text: " + (text ? "yes" : "no") + ". Quantity: " + getQuantity()
                + ". Retail price: " + getRetailPrice() + ". Total price: " + getTotalPrice();
    }
}
