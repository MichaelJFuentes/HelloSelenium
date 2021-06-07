package org.example.untitled.FunctionalTesting;

import com.google.gson.internal.$Gson$Preconditions;
import org.example.untitled.WebElements.ChromeDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class AddingItemsToShoppingCart {
    // todo breaking at adding 6th item to cart, element not clickable
    public static void main(String[] args) throws InterruptedException{
        WebDriver chromeDriver = ChromeDriverSetup.getDriver();
        chromeDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        Thread.sleep(1000);
        List<WebElement> products = chromeDriver.findElements(By.xpath("//h4[@class='product-name']"));
//        addProductsToCart(chromeDriver, products, "cucumber", 2);

        // adding multiple Items to List
        HashMap<String, Integer> desiredProducts = new HashMap<>();
        desiredProducts.put("cucumber", 2);
        desiredProducts.put("Carrot",3);
        desiredProducts.put("Tomato", 2);
        desiredProducts.put("Potato", 4);
        desiredProducts.put("mushroom", 4);
        desiredProducts.put("Pears", 1);
        desiredProducts.put("strawberry", 3);

//        desiredProducts.put("Cashews", 2);

        for (String key : desiredProducts.keySet()) {
            addProductsToCart(chromeDriver, products, key, desiredProducts.get(key));
        }

    }

    // find product index in list
    public static void addProductsToCart(WebDriver driver, List<WebElement> products, String productName, int count) throws InterruptedException{
        for (int i = 0; i < products.size(); i++) {
            String justProductName = products.get(i).getText().toLowerCase().split("-")[0];
            if (justProductName.trim().equals(productName.toLowerCase())){
                System.out.println(justProductName);
                WebElement temp = driver.findElements(By.xpath("//div[@class='stepper-input'] //input[@class = 'quantity']")).get(i);
                temp.click();
                temp.sendKeys(Keys.ARROW_RIGHT);
                temp.sendKeys(Keys.BACK_SPACE);
                temp.sendKeys(String.valueOf(count));
                //caused error
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                System.out.printf("Adding %d of %s%n", count, productName);
                break;
            }
        }
    }

    public static void addProductsToCart(WebDriver driver, List<WebElement> products, String productName ) throws InterruptedException{
        addProductsToCart(driver, products, productName, 1);
    }

    // add item to cart
}
