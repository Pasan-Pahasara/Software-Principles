import service.Account;

/**
 * @author : ShEnUx
 * @time : 12:39 PM
 * @date : 4/28/2023
 * @since : 0.1.0
 **/
public class BankAppWithdrawalService {

    Account account;

    public BankAppWithdrawalService(Account account) {
        this.account = account;
    }

    public void depositToAccount(double amount){
        account.deposit(amount);
    }
    public void withdrawFromAccount(double amount){
        account.withdraw(amount);
    }


}
