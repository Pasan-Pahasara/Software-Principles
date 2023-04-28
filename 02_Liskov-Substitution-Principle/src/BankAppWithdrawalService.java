import service.Account;

/**
 * @author : ShEnUx
 * @time : 12:55 PM
 * @date : 4/28/2023
 * @since : 0.1.0
 **/
public class BankAppWithdrawalService {

    Withdrawable account;

    public BankAppWithdrawalService(Withdrawable account) {
        this.account = account;
    }

    public void depositToAccount(double amount){
        account.deposit(amount);
    }
    public void withdrawFromAccount(double amount){
        account.withdraw(amount);
    }


}
