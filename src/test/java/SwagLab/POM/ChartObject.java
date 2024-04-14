package SwagLab.POM;

import org.openqa.selenium.By;

public class ChartObject {

    public static By yourChart = By.xpath("//span[contains(text(), 'Your Cart')]");

    public static By productName = By.xpath("//div[contains(text(), 'Sauce Labs Onesie')]");

    public static By checkoutButton = By.id("checkout");
}
