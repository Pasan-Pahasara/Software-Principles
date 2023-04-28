package service.cutom;

import service.Payment;

/**
 * @author : ShEnUx
 * @time : 3:37 PM
 * @date : 4/28/2023
 * @since : 0.1.0
 **/
public interface Loan extends Payment {
    void initiateLoanSettlement();
    void initiateRePayment();
}
