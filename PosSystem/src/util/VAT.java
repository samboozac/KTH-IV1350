package util;

public class VAT {
    private double rate;
    public VAT(double rate) {
        this.rate = rate;
    }
    public double getRate() {
        return rate;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(rate);
        sb.append("%");
        return sb.toString();
    }
}
