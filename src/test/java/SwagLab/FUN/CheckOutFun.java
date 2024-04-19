package SwagLab.FUN;

import SwagLab.BeforeAll;
import SwagLab.POM.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutFun extends BeforeAll {

    public static void checkout(WebDriver driver, WebDriverWait wait) {

        //add items
        driver.findElement(PLPObjects.onesie).click();
        driver.findElement(PLPObjects.jacket).click();

        //get the amount on chart
        String amount = driver.findElement(MenuPLPObject.chartAmount).getText();

        //check to see if the amount on chart has been changed
        if (amount != "0") {
            //click on Chart Button
            driver.findElement(MenuPLPObject.chart).click();

            //verify on a right page
            driver.findElement(ChartObject.yourChart).isDisplayed();
            //confirm product is added
            driver.findElement(PLPObjects.backpackName).isDisplayed();
            driver.findElement(PLPObjects.jacketName).isDisplayed();

            //Click on the Checkout Button
            driver.findElement(ChartObject.checkoutButton).click();

            //confirm on a right "Your Information" Page
            driver.findElement(yourInformationObject.informationPage).isDisplayed();

            //fill in necessary fields
            String FirstName = RandomStringUtils.randomAlphabetic(4).toLowerCase();
            driver.findElement(yourInformationObject.firstnameField).sendKeys("B" + FirstName);
            String LastName = RandomStringUtils.randomAlphabetic(4).toLowerCase();
            driver.findElement(yourInformationObject.lastNameField).sendKeys("J" + LastName);
            String ZipCode = RandomStringUtils.randomAlphabetic(5).toLowerCase();
            driver.findElement(yourInformationObject.zipCodeField).sendKeys(ZipCode);

            //click on the continue button
            driver.findElement(yourInformationObject.continueButton).click();

            //confirm on Overview page
            driver.findElement(overviewObject.overviewPage).isDisplayed();
            //click on a finish button
            driver.findElement(overviewObject.finishButton).click();

            //confirm the shopping has been done
            driver.findElement(completeObject.thankYouMessage).isDisplayed();
            driver.findElement(completeObject.dispatchMessage).isDisplayed();

            //go back to shopping
            driver.findElement(completeObject.backHomeButton).click();


        } else {
            System.out.println("Didn't enter the chart!");
        }


//        //scroll down to add items to chert
//        JavascriptExecutor jsu = (JavascriptExecutor) driver;
//        jsu.executeScript("window.scrollBy(0,-350)", "");

    }
}
