package view;

import util.Amount;

public class DisplayTotalRevenueView extends TotalRevenueView {
    Amount totalRevenue = new Amount(0);

    protected void printCurrent(Amount salePrice) {
        totalRevenue = totalRevenue.add(salePrice);
        System.out.println("-----------> Total Revenue: " + totalRevenue + " <-----------" + "\n \n");
    }
}
