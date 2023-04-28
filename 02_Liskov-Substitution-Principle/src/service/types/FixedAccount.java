package service.types;

import service.custom.Fixed;

/**
 * @author : ShEnUx
 * @time : 12:49 PM
 * @date : 4/28/2023
 * @since : 0.1.0
 **/
public class FixedAccount extends Fixed {
    @Override
    public void deposit(double amount) {
        System.out.println(amount + " Deposited to your Fixed Account.!");
    }

//    @Override // No More available because In fixed we don't have this feature
//    public void withdraw(double amount) {
//        System.out.println(amount + " Withdrawn from your Fixed Account.!");
//    }

}
