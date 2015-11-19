package com.epam.view;

import com.epam.model.BouquetComponentsParent;
import com.epam.model.flowers.*;
import com.epam.model.accessories.*;
import com.epam.model.bouquet.Bouquet;

/**
 * Class prepare bouquet for output
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
class Initializer {
    public static void startProgram() {
        Flower flower = new Flower(FlowerName.ROSE, "red", 3, FlowerStemLength.EXTRA_LONG);
        Flower flower1 = new Flower(FlowerName.TULIP, "red", 3, FlowerStemLength.EXTRA_SHORT);
        Flower flower2 = new Flower(FlowerName.CARNATION, "white", 3, FlowerStemLength.NORMAL);
        Flower flower3 = new Flower(FlowerName.CHRYSANTHEMUM, "red", 3, FlowerStemLength.LONG);
        Wrapping wrapping = new Wrapping(AccessoryName.WRAPPING, WrappingMaterial.FELT, 2, "red");
        GreetingCard greetingCard = new GreetingCard(AccessoryName.GREETING_CARD, 1, false);
        flower1.setPurchasingDate(13, 10, 2015);
        flower2.setPurchasingDate(3, 11, 2015);
        flower3.setPurchasingDate(13, 5, 2015);

        Bouquet bouquet = new Bouquet( 1,
                new BouquetComponentsParent[] {
                        flower,
                        flower1,
                        flower2,
                        flower3,
                        wrapping,
                        greetingCard
                }
        );

        System.out.println(bouquet.toString());
        System.out.println("=================================");
        System.out.println(bouquet.chooseFLowersByStemLength(110));
    }
}
