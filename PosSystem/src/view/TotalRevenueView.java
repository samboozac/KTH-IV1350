package view;

import model.TotalRevenueObserver;
import util.Amount;

public class TotalRevenueView implements TotalRevenueObserver {
    public void newTotalSalePrice(Amount totalSalePrice) {
        printCurrent(totalSalePrice);
    }

    protected void printCurrent(Amount totalSalePrice) {

    }
}
