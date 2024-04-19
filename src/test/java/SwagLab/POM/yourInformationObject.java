package SwagLab.POM;

import org.openqa.selenium.By;

public class yourInformationObject {

    public static By informationPage = By.xpath("//span[contains(text(),'Checkout: Your Information')]");
    public static By firstnameField = By.id("first-name");
    public static By lastNameField = By.id("last-name");
    public static By zipCodeField = By.id("postal-code");
    public static By continueButton = By.id("continue");
}
