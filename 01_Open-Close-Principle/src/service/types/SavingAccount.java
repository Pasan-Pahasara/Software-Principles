package service.types;

import service.Account;

/**
 * @author : ShEnUx
 * @time : 11:19 PM
 * @date : 4/28/2023
 * @since : 0.1.0
 **/
public class SavingAccount extends Account {
    @Override
    public void deposit(double amount) {
        System.out.println(amount + " Deposited to your Savings Account.!");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(amount + " Withdrawn from your Savings Account.!");
    }
}
