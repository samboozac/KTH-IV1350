package view;

import model.TotalRevenueObserver;
import util.Amount;

public class TotalRevenueDisplay implements TotalRevenueObserver {
    Amount totalRevenue = new Amount(0);
    public TotalRevenueDisplay (){}

    /**
     * Passes the updated information to the
     * @param totalSalePrice
     */
    public void newTotalSalePrice(Amount totalSalePrice) {
        printCurrentState(totalSalePrice);
    }

    private void printCurrentState(Amount salePrice) {
        totalRevenue = totalRevenue.add(salePrice);
        System.out.println("-----------> Total Revenue: " + totalRevenue + " <-----------" + "\n \n");
    }
}
