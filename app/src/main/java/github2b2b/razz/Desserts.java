package github2b2b.razz;

/**
 * Created by Rhombus Rhinosaurus on 12/2/2015.
 */
import java.util.ArrayList;
import java.util.Currency;

public class Desserts extends Ingredient{
    public double dessertPrice;

    Desserts(String ingredientName, double breadPrice, boolean preIncluded, Currency extraCost){
        this.ingredientName = ingredientName;
        this.preIncluded = preIncluded;
        this.extraCost = extraCost;
        this.dessertPrice = breadPrice;
    }

    /**
     *
     * @param ingredientName - A string which describes the ingredient
     */
    Desserts(String ingredientName, double breadPrice){
        this.ingredientName = ingredientName;
        this.dessertPrice = breadPrice;
    }
}
