package SwagLab.POM;

import org.openqa.selenium.By;

public class MenuPLPObject {

    //hamburger menu header
    public static By hamburgerMenu = By.id("react-burger-menu-btn");
    //Log out button
    public static By logOutButton = By.id("logout_sidebar_link");

    public static By chart = By.xpath("//a[contains(@data-test, 'shopping-cart-link')]");

    public static By chartAmount = By.xpath("//span[contains(@data-test, 'shopping-cart-badge')]");
}

