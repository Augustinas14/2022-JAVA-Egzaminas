package entetys;

public class Orders {
    int orderId;
    int userId;
    int food_id;

    public Orders(int orderId, int userId, int food_id, boolean confirmation) {
        this.orderId = orderId;
        this.userId = userId;
        this.food_id = food_id;
        this.confirmation = confirmation;
    }

    public Orders() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public boolean isConfirmation() {
        return confirmation;
    }

    public void setConfirmation(boolean confirmation) {
        this.confirmation = confirmation;
    }

    boolean confirmation;
}
