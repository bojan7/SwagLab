package SwagLab.TEST;

import SwagLab.BeforeAll;
import SwagLab.FUN.AccountFun;
import org.testng.annotations.Test;

public class LogInLogOutTest extends BeforeAll {


    @Test(priority = 1, description = "Log In/Out")
    public void logInOut() {

        AccountFun.logInValidAccount(driver, wait);
        AccountFun.logOut(driver, wait);

    }


}
