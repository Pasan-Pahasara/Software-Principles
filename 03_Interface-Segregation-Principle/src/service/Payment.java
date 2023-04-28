package service;

import java.util.List;

/**
 * @author : ShEnUx
 * @time : 3:27 PM
 * @date : 4/28/2023
 * @since : 0.1.0
 **/
public interface Payment {
    //void initiatePayments();
    Object status();
    List<Object> getPayments();

    /* Introduce new features for the payments */
    //void initiateLoanSettlement();
    //void initiateRePayment();
}
