package SwagLab.FUN;

import SwagLab.BeforeAll;
import SwagLab.POM.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutFun extends BeforeAll {

    public static void checkout(WebDriver driver, WebDriverWait wait) {

//        //scroll down to add items to chert
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,350)", "");

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
            driver.findElement(yourInformationObject.firstnameField).sendKeys("Bojan");
            driver.findElement(yourInformationObject.lastNameField).sendKeys("Jevtic");
            driver.findElement(yourInformationObject.zipCodeField).sendKeys("11000");

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
