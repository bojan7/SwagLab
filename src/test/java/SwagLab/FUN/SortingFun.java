package SwagLab.FUN;

import SwagLab.BeforeAll;
import SwagLab.POM.PLPObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SortingFun extends BeforeAll {


    public static void PLPSorting(WebDriver driver, WebDriverWait wait) {

        //click on the filter/sorting
        driver.findElement(PLPObjects.filter).click();
        //sort Z to A
        driver.findElement(PLPObjects.zToA).click();

        //Get the first from the list of all products after the sorting
        String productName = driver.findElement(PLPObjects.productName).getText();

//        //Print out to be sure you on a right page
//        System.out.println(productName);

        //Compare the products to see if sorting was performed
        if (productName.equals("Test.allTheThings() T-Shirt (Red)")) {
            System.out.println("Z to A success!");
            //if not print out warning
        } else {
            System.out.println("Better Luck next time" + productName);
        }

        driver.findElement(PLPObjects.filter).click();
        driver.findElement(PLPObjects.lowToHigh).click();

        String productNameLow = driver.findElement(PLPObjects.productName).getText();

//      System.out.println(productNameLow);

        if (productNameLow.equals("Sauce Labs Onesie")) {
            System.out.println("Low to High Success!");
        } else {
            System.out.println("Better luck next time");
        }

        
    }


//    public static void PLPHighToLow(WebDriver driver, WebDriverWait wait) {
//
//        //click on the filter
//        driver.findElement(PLPObjects.filter).click();
//        //click on the high to low sorting
//        driver.findElement(PLPObjects.highToLowFilter).click();
//        //confirm high to low is displayed
//        driver.findElement(PLPObjects.highToLowFilter).isDisplayed();
//
//    }
//
//    public static void PLPLowToHigh(WebDriver driver, WebDriverWait wait) {
//
//        //click on the filter
//        driver.findElement(PLPObjects.filter).click();
//        //click on the high to low sorting
//        driver.findElement(PLPObjects.lowToHighFilter).click();
//        //confirm high to low is displayed
//        driver.findElement(PLPObjects.lowToHighFilter).isDisplayed();
//
//    }
//
//    public static void PLPaToZ(WebDriver driver, WebDriverWait wait) {
//
//        //click on the filter
//        driver.findElement(PLPObjects.filter).click();
//        //click on the high to low sorting
//        driver.findElement(PLPObjects.aZFilter).click();
//        //confirm high to low is displayed
//        driver.findElement(PLPObjects.aZFilter).isDisplayed();
//
//    }
//
//    public static void PLPzToA(WebDriver driver, WebDriverWait wait) {
//
//        //click on the filter
//        driver.findElement(PLPObjects.filter).click();
//        //click on the high to low sorting
//        driver.findElement(PLPObjects.zAFilter).click();
//        //confirm high to low is displayed
//        driver.findElement(PLPObjects.zAFilter).isDisplayed();
//
//    }

}
