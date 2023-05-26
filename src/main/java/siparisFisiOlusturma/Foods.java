package siparisFisiOlusturma;

import java.util.ArrayList;
import java.util.List;

public class Foods {

    public Foods() {
    }

    public Foods(String foodName, int foodPrice) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    private int foodscode;

    private String foodName;

    private int foodPrice;

    private int howManyPiece;

    public int getHowManyPiece() {
        return howManyPiece;
    }

    public void setHowManyPiece(int howManyPiece) {
        this.howManyPiece = howManyPiece;
    }

    public Foods(int foodscode, String foodName, int foodPrice, int howManyPiece) {
        this.foodscode = foodscode;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.howManyPiece = howManyPiece;
    }

    public Foods(int foodscode, String foodName, int foodPrice) {
        this.foodscode = foodscode;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    public int getFoodscode() {
        return foodscode;
    }

    public void setFoodscode(int foodscode) {
        this.foodscode = foodscode;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    @Override
    public String toString() {
        return "Foods{" +
                "foodscode=" + foodscode +
                ", foodName='" + foodName + '\'' +
                ", foodPrice=" + foodPrice +
                '}';
    }
}
