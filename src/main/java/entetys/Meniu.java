package entetys;

public class Meniu {
    int foodId;
    String foodName;
    String discription;

    public Meniu(int foodId, String foodName, String discription) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.discription = discription;
    }

    public Meniu() {
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
