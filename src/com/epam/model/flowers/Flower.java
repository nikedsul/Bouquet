package com.epam.model.flowers;

import com.epam.model.BouquetComponentsParent;
import java.util.Calendar;

/**
 * Class Flower describes all types of the available flowers
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public final class Flower extends BouquetComponentsParent {

    /** Chosen length of the flower */
    private int stemLength;

    /** The actual date */
    Calendar today;

    /** The freshness of the flower in days */
    public int freshnessDays;

    public int getStemLength() {
        return stemLength;
    }

    /**
     * Constructor Flower
     * @param flowerName
     * @param color
     * @param quantity
     * @param flowerStemLength
     */
    public Flower(FlowerName flowerName, String color, int quantity, FlowerStemLength flowerStemLength) {
        super(quantity);
        this.today = Calendar.getInstance();
        this.stemLength = flowerStemLength.getFlowerStemLength();
        this.name = flowerName.getFlowerName();
        this.purchasingPrice = flowerName.getPurchasingPrice();
        this.extraCost = flowerName.getExtraCost();
        this.quantity = quantity;
        this.color = color;
        setRetailPrice();
        setTotalPrice();
    }

    /**
     * Method setFreshnessDays calculates number of days from the set date of purchasing until actual day
     * @param purchasingDay the day of month of purchasing of a flower
     * @param purchasingMonth the month of purchasing of a flower
     * @param purchasingYear the year of purchasing of a flower
     */
    public void setPurchasingDate(int purchasingDay, int purchasingMonth, int purchasingYear) {

        Calendar freshness = Calendar.getInstance();
        freshness.set(purchasingYear, purchasingMonth - 1, purchasingDay - 1);

        if ((today.get(Calendar.YEAR) < purchasingYear)
                || ((today.get(Calendar.MONTH) == (purchasingMonth - 1)) && (today.get(Calendar.YEAR) == purchasingYear))
                    && (today.get(Calendar.DAY_OF_MONTH) < purchasingDay))  {
            freshnessDays = -1;         // If flower has not been purchased yet
        } else {
            freshnessDays = (int)((today.getTimeInMillis() - freshness.getTimeInMillis()) / (1000*60*60*24));
        }
    }

    /**
     *
     * @param freshnessDays number of passed days from the day of purchase
     * @return
     */
    public String freshnessToString(int freshnessDays) {
        if (freshnessDays > 0) {
            return "this type of flowers is being kept for " + getFreshnessDays() + " days.";
        } else if (freshnessDays == 0) {
            return "this type of flowers has been purchased today.";
        } else {
            return "the date of purchase for this type of flowers has not been set or has been set wrongly.";
        }
    }

    public int getFreshnessDays() {
        return freshnessDays;
    }

    @Override
    public String toString() {
        return "Component: " + getName()
                + ". Color: " + getColor()
                + ". Stem length: " + getStemLength() + " cm"
                + ". Quantity: " + getQuantity()
                + ". Retail price: " + String.format("%.2f", getRetailPrice())
                + ". Total price: " + String.format("%.2f", getTotalPrice())
                + ". Freshness: " + freshnessToString(freshnessDays);
    }

}
