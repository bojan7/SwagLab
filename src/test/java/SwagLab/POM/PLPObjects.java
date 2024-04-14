package SwagLab.POM;

import org.openqa.selenium.By;

public class PLPObjects {
    //Product name
    public static By product = By.xpath("//span[contains(text(),'Products')]");

    //Filter menu
    public static By filter = By.xpath("//select[contains(@data-test, 'product-sort-container')]");

    //Sort A to Z
    public static By aToZ = By.xpath("//option[contains(@value,'az')]");

    //Sort Z to A
    public static By zToA = By.xpath("//option[contains(@value,'za')]");

    //Sort low to High
    public static By lowToHigh = By.xpath("//option[contains(@value,'lohi')]");

    //Sort high to Low
    public static By highToLow = By.xpath("//option[contains(@value,'hilo')]");

    //Get the list of all products and store the first one
    public static By productName = By.xpath("//div[contains(@data-test,'inventory-item-name')]");

    //product name onies
    public static By onesieName = By.xpath("//div[contains(text(),'Sauce Labs Onesie')]");

    //add to chart button/item
    public static By onesie = By.id("add-to-cart-sauce-labs-backpack");

    //get name of the item backpack
    public static By backpackName = By.xpath("//div[contains(text(),'Sauce Labs Backpack')]");

    //add jacket to chart
    public static By jacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    //get name of the jacket
    public static By jacketName = By.xpath("//div[contains(text(), 'Sauce Labs Fleece Jacket')]");
}
