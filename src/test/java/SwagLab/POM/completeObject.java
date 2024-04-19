package SwagLab.POM;

import org.openqa.selenium.By;

public class completeObject {
    //text on the page
    public static By thankYouMessage = By.xpath("//h2[contains(text(),'Thank you for your order!')]");
    //text after the buying
    public static By dispatchMessage = By.xpath("//div[contains(@data-test, 'complete-text')]");
    //back to buying button
    public static By backHomeButton = By.id("back-to-products");
}
