package SwagLab.POM;

import org.openqa.selenium.By;

public class LogInPageObject {

    public static By userNameField = By.id("user-name");
    public static By passwordField = By.id("password");
    public static By LogInButtonField = By.id("login-button");
    public static By errorMessage = By.xpath("//h3[contains(@data-test,'error')]");


}


