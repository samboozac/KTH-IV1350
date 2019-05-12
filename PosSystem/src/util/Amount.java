package util;

public class Amount {
    private double amount;

    /**
     *
     * @param amount
     */
    public Amount(double amount){
        this.amount = amount;
    }

    /**
     *
     * @param amount
     */
    public void add(Amount amount){
        this.amount = this.amount + amount.getValue();
    }

    public void subtract(Amount amount) {
        this.amount = this.amount - amount.getValue();
    }
    /**
     *
     * @return
     */
    public double getValue() {
        return amount;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(amount);
        sb.append("kr");
        return sb.toString();
    }
}
