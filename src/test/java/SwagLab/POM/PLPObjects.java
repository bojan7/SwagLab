package SwagLab.POM;

import org.openqa.selenium.By;

public class PLPObjects {
    //Product name
    public static By swag = By.xpath("//div[contains(text(),'Swag Labs')]");

    //Filter menu
    public static By filter = By.xpath("//select[contains(@data-test, 'product-sort-container')]");

    //List of prices
    public static By listOfPrices = By.className("inventory_item_price");

    //Sort high to Low
    public static By highToLow = By.xpath("//option[contains(@value,'hilo')]");

    //Get the list of all products and store the first one
    public static By productName = By.xpath("//div[contains(@data-test,'inventory-item-name')]");

    //add to chart button/item
    public static By onesie = By.id("add-to-cart-sauce-labs-backpack");

    //get name of the item backpack
    public static By backpackName = By.xpath("//div[contains(text(),'Sauce Labs Backpack')]");

    //add jacket to chart
    public static By jacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    //get name of the jacket

    public static By jacketName = By.xpath("//div[contains(text(), 'Sauce Labs Fleece Jacket')]");
}
