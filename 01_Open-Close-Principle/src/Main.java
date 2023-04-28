/**
 * @author : ShEnUx
 * @time : 10:55 PM
 * @date : 4/28/2023
 * @since : 0.1.0
 **/

public class Main {
    /*SOLID*/
    /* O - Open / Close Principle */
    /*
     *This principle states that the software entities should be open for extensions but close
     * for modifications
     * */
    public static void main(String[] args) {

        BankAppWithdrawalService bankAppWithdrawalService = new BankAppWithdrawalService();

        bankAppWithdrawalService.depositToCurrentAccount(100000);
        bankAppWithdrawalService.withdrawFromCurrentAccount(5000);
    }
}
