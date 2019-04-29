package model;

public class Tax {
    private double percent;
    protected Tax(double percent){this.percent = percent;}
    public double getPercent() {return percent;}
}
