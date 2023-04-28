/**
 * @author : ShEnUx
 * @time : 11:05 PM
 * @date : 4/28/2023
 * @since : 0.1.0
 **/
public class BankAppWithdrawalService {
    public void depositToSavingsAccount(double amount){
        System.out.println(amount + " Deposited to your Savings Account.!");
    }

    public void depositToCurrentAccount(double amount){
        System.out.println(amount + " Deposited to your Current Account.!");
    }

    public void withdrawFromSavingsAccount(double amount){
        System.out.println(amount + " Withdrawn from your Savings Account.!");
    }

    public void withdrawFromCurrentAccount(double amount){
        System.out.println(amount + " Withdrawn from your Current Account.!");
    }
}
