package util;

public class DiscountRule {
    private double discountRate;

    /**
     *
     * @param discountRate
     */
    public DiscountRule(double discountRate){
        this.discountRate = discountRate;
    }

    /**
     *
     * @return
     */
    public double getDiscountRate() {
        return discountRate;
    }
}
