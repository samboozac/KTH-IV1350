package model;

import util.DiscountRule;

public class Cost {
    private double cost;

    /**
     *
     * @param cost
     * @param quantity
     */
    public Cost(double cost, int quantity){
        this.cost = cost*quantity;
    }

    /**
     *
     * @return
     */
    public double getCost() {return cost; }

    /**
     *
     * @param discountRule
     */
    public void applyDiscount(DiscountRule discountRule) {
        cost = cost *(discountRule.getDiscountRate()/100);
    }

    /**
     *
     * @param cost
     * @return
     */
    public Cost subtract(Cost cost) {
        Cost returnCost = new Cost(this.cost - cost.getCost(), 1);
        return returnCost;
    }
}
