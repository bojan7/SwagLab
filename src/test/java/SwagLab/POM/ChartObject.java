package SwagLab.POM;

import org.openqa.selenium.By;

public class ChartObject {

    //text "Your Chart"
    public static By yourChart = By.xpath("//span[contains(text(), 'Your Cart')]");
    //name of the product backpack
    public static By backpackName = By.xpath("//div[contains(text(),'Sauce Labs Backpack')]");
    //name of the product  jacket
    public static By jacketName = By.xpath("//div[contains(text(),'Sauce Labs Fleece Jacket')]");
    //checkout button
    public static By checkoutButton = By.id("checkout");
}
