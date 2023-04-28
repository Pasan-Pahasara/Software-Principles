package service.types;
import service.custom.Withdrawable;

/**
 * @author : ShEnUx
 * @time : 12:41 PM
 * @date : 4/28/2023
 * @since : 0.1.0
 **/
public class CurrentAccount extends Withdrawable {
    @Override
    public void deposit(double amount) {
        System.out.println(amount + " Deposited to your Current Account.!");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(amount + " Withdrawn from your Current Account.!");
    }
}