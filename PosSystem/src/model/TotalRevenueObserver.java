package model;

import util.Amount;

/**
 * A listener interface for receiving notifications about every completed Sale.
 */
public interface TotalRevenueObserver {
    void newTotalSalePrice(Amount price);
}
