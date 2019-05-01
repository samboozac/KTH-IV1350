package util;

public class CustomerId {
    private String customerIdNumber;

    /**
     *
     * @param customerIdNumber
     */
    public CustomerId(String customerIdNumber) {
        this.customerIdNumber = customerIdNumber;
    }

    /**
     *
     * @return
     */
    public String getCustomerIdNumber(){
        return customerIdNumber;
    }
}
