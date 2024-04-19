package SwagLab.POM;

import org.openqa.selenium.By;

public class completeObject {

    public static By thankYouMessage = By.xpath("//h2[contains(text(),'Thank you for your order!')]");
    public static By dispatchMessage = By.xpath("//div[contains(@data-test, 'complete-text')]");
    public static By backHomeButton = By.id("back-to-products");
}
