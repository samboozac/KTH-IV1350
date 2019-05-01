package integration;

import model.Discount;
import util.CustomerId;
import util.DiscountRule;

import java.util.HashMap;

public class DiscountRegistry {
    private HashMap<CustomerId, DiscountRule> personalDiscountList = new HashMap<>();
    public DiscountRegistry(){
        addPersonalDiscounts();
    }
    private void addPersonalDiscounts() {
        personalDiscountList.put(new CustomerId("1293192932"), new DiscountRule(20.0));
        personalDiscountList.put(new CustomerId("1293192432"), new DiscountRule(15.0));
        personalDiscountList.put(new CustomerId("1223192932"), new DiscountRule(25.0));
        personalDiscountList.put(new CustomerId("1233192932"), new DiscountRule(30.0));
    }

    public HashMap<CustomerId, DiscountRule> getPersonalDiscountList() {
        return personalDiscountList;
    }
}
