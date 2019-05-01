package model;

public class Tax {
    private double percent;

    /**
     *
     * @param percent
     */
    protected Tax(double percent){
        this.percent = percent;}

    /**
     *
     * @return
     */
    public double getPercent() {return percent;}

    /**
     * 
     */
    public void addTax() {
        percent = 25;
    }
}
