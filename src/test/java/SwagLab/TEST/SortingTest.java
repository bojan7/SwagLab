package SwagLab.TEST;

import SwagLab.BeforeAll;
import SwagLab.FUN.AccountFun;
import SwagLab.FUN.SortingFun;
import org.testng.annotations.Test;

public class SortingTest extends BeforeAll {

    @Test(priority = 1, description = "sorting")
    public void Sorting() {

        AccountFun.logInValidAccount(driver, wait);
        SortingFun.PLPSorting(driver, wait);
        //log out from the PLP
        AccountFun.logOut(driver, wait);
    }
}
