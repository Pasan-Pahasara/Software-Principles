import service.custom.Fixed;

/**
 * @author : ShEnUx
 * @time : 12:55 PM
 * @date : 4/28/2023
 * @since : 0.1.0
 **/
public class BankAppFixedDepositService {

    Fixed account;

    public BankAppFixedDepositService(Fixed account) {
        this.account = account;
    }

    public void depositToAccount(double amount){
        account.deposit(amount);
    }
}
