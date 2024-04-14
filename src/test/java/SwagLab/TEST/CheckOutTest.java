package SwagLab.TEST;

import SwagLab.BeforeAll;
import SwagLab.FUN.AccountFun;
import SwagLab.FUN.CheckOutFun;
import org.testng.annotations.Test;

public class CheckOutTest extends BeforeAll {

    @Test(description = "Checkout")
    public void Checkout() {

        AccountFun.logInValidAccount(driver, wait);
        CheckOutFun.checkout(driver, wait);

    }
}
