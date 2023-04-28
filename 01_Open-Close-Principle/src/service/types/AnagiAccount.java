package service.types;

import service.Account;

/**
 * @author : ShEnUx
 * @time : 11:19 PM
 * @date : 4/28/2023
 * @since : 0.1.0
 **/
public class AnagiAccount extends Account {
    @Override
    public void deposit(double amount) {
        System.out.println("Deposit for Anagi Account " + amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdraw from Anagi Account " + amount);
    }
}
