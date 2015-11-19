package com.epam.model.flowers;

/**
 * Enum FlowerStemLength contains lengths of flower
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public enum FlowerStemLength {
    EXTRA_SHORT(50), SHORT(70), NORMAL(90), LONG(100), EXTRA_LONG(110);

    private final int flowerStemLength;

    /**
     * Constructor
     * @param fLength the stem length of the flower
     */
    FlowerStemLength(int fLength) {
        this.flowerStemLength = fLength;
    }

    public int getFlowerStemLength() {
        return flowerStemLength;
    }
}
