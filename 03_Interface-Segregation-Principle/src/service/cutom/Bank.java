package service.cutom;

import service.Payment;

/**
 * @author : ShEnUx
 * @time : 3:37 PM
 * @date : 4/28/2023
 * @since : 0.1.0
 **/
public interface Bank extends Payment {
    void initiatePayments();
}
