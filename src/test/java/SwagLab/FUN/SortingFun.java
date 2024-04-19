package SwagLab.FUN;

import SwagLab.BeforeAll;
import SwagLab.POM.PLPObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingFun extends BeforeAll {


    public static void PLPSorting(WebDriver driver, WebDriverWait wait) {

        //Capture the list of all prices before sorting
        List<WebElement> elementList = driver.findElements(PLPObjects.listOfPrices);
        //Put them in a list and remove dollar sign
        ArrayList<Double> FirstList = new ArrayList<>();
        for (WebElement first : elementList) {
            FirstList.add(Double.valueOf(first.getText().replace("$", "")));
        }

        //click on the filter/sorting
        driver.findElement(PLPObjects.filter).click();
        //sort High to Low
        driver.findElement(PLPObjects.highToLow).click();
        //Capture the list of prices after sorting
        List<WebElement> SecondList = driver.findElements(PLPObjects.listOfPrices);

        //Put them in a list and remove dollar sign
        ArrayList<Double> SortedList = new ArrayList<>();
        for (WebElement second : SecondList) {
            SortedList.add(Double.valueOf(second.getText().replace("$", "")));
        }

        //Sort by ascending order
        Collections.sort(FirstList);
        //sort revers - by descending now that we sorted it by ascending
        Collections.reverse(FirstList);
        System.out.println("Sort Sorted List " + SortedList);

        //compare two values
        Assert.assertTrue(FirstList.equals(SortedList));



        //Or we can try also

        String productName = driver.findElement(PLPObjects.productName).getText();

        //Compare the products to see if sorting was performed
        if (productName.equals("Sauce Labs Fleece Jacket")) {
            System.out.println("High to Low success!");
            //if not print out warning
        } else {
            System.out.println("Better Luck next time " + productName);
        }
    }
}

