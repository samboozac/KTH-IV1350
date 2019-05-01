package model;

public class Tax {
    private double percent;
    protected Tax(double percent){
        this.percent = percent;}
    public double getPercent() {return percent;}
    public void addTax() {
        percent = 25;
    }
}
