package util;

public class Amount {
    private double amount;

    /**
     * Constructors (Two)
     * @param amount
     */
    public Amount(double amount){
        this.amount = amount;
    }
    public Amount(Amount amount, double quantity){
        this.amount = amount.getValue() * quantity;
    }

    /**
     * Returns a new Amount with two Amount-type value added.
     * @param amount
     * @return
     */
    public Amount add(Amount amount){
        return new Amount(this.amount + amount.getValue());
    }

    /**
     * Returns a new Amount with two Amount-type  value subtracted.
     * @param amount
     * @return
     */
    public Amount subtract(Amount amount) {
        return new Amount(this.amount - amount.getValue());
    }

    /**
     * Returns the current value negated.
     * @return
     */
    public Amount negate(){
        return new Amount(this.amount*-1);
    }

    /**
     * Returns the value of the current amount.
     * @return
     */
    public double getValue() {
        return amount;
    }

    /**
     *
     * How the amount will be printed.
     * @return
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(amount);
        return sb.toString();
    }
}
