package model;

import util.Amount;

public interface TotalRevenueObserver {
    void newTotalSalePrice(Amount price);
}
