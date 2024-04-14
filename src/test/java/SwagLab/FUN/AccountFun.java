package SwagLab.FUN;

import SwagLab.BeforeAll;
import SwagLab.POM.LogInPageObject;
import SwagLab.POM.MenuPLPObject;
import SwagLab.POM.PLPObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountFun extends BeforeAll {

    public static void logInValidAccount(WebDriver driver, WebDriverWait wait) {

        //Fill in username field
        driver.findElement(LogInPageObject.userNameField).sendKeys("standard_user");
        //Fill in password field
        driver.findElement(LogInPageObject.passwordField).sendKeys("secret_sauce");
        //click on the login button
        driver.findElement(LogInPageObject.LogInButtonField).click();

        //wait until the 'products' is displayed
        wait.until(ExpectedConditions.visibilityOfElementLocated(PLPObjects.product));

    }

    public static void logOut(WebDriver driver, WebDriverWait wait) {

        //click on the hamburger menu
        driver.findElement(MenuPLPObject.hamburgerMenu).click();
        //click on the logout button
        driver.findElement(MenuPLPObject.logOutButton).click();
        //wait until username filed is displayed - to confirm we logged out
        wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPageObject.userNameField));
    }


}
