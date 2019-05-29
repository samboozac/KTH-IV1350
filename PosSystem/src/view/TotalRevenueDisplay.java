package view;

import model.TotalRevenueObserver;
import util.Amount;

public class TotalRevenueDisplay implements TotalRevenueObserver {
    Amount totalRevenue = new Amount(0);
    public TotalRevenueDisplay (){}

    /**
     * Saves the updated state information and calls the print function.
     * @param totalSalePrice
     */
    public void newTotalSalePrice(Amount totalSalePrice) {
        totalRevenue = totalRevenue.add(totalSalePrice);
        printCurrentState();
    }

    /**
     * Formatting the string representation to display the total revenue.
     */
    private void printCurrentState() {
        System.out.println("-----------> Total Revenue: " + totalRevenue + " <-----------" + "\n \n");
    }
}
