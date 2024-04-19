package SwagLab.TEST;

import SwagLab.BeforeAll;
import SwagLab.FUN.AccountFun;
import SwagLab.FUN.CheckOutFun;
import SwagLab.FUN.SortingFun;
import org.testng.annotations.Test;



public class test extends BeforeAll {

    @Test(priority = 1, description = "invalidLogIn/validLogin/logOut")
    public void logInTests() {

        AccountFun.invalidLogIn(driver, wait);
        AccountFun.logInValidAccount(driver, wait);
        AccountFun.logOut(driver, wait);
    }

    @Test(priority = 2, description = "Sorting")
    public void sortTest() {

        AccountFun.logInValidAccount(driver, wait);
        SortingFun.PLPSorting(driver, wait);
        AccountFun.logOut(driver, wait);
    }

    @Test (priority = 3, description = "Checkout")
    public void checkoutTest() {

        AccountFun.logInValidAccount(driver, wait);
        CheckOutFun.checkout(driver, wait);
        AccountFun.logOut(driver, wait);
    }

}
