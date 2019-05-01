package model;

public class Cost {
    private double cost;
    public Cost(double cost, int quantity){
        this.cost = cost*quantity;
    }

    public double getCost() {
        return cost;
    }
}
