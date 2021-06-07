package org.example.untitled;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

// searching homedepot page
public class SimpleLocators {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.homedepot.com/");
        chromeDriver.manage().window().maximize();
        // get by ID
//        chromeDriver.findElement(By.id("headerSearch")).sendKeys("door knobs");

        // get by css
//        chromeDriver.findElement(By.cssSelector("#headerSearch")).sendKeys("Door Knobs");

        // xpath
        chromeDriver.findElement(By.xpath("//*[@id=\"headerSearch\"]")).sendKeys("Door Knob");
        chromeDriver.findElement(By.xpath("//*[@id=\"headerSearchButton\"]")).sendKeys(Keys.ENTER);

        // add the most popular door knob to cart
        chromeDriver.findElement(By.xpath("//*[@id=\"browse-search-pods-1\"]/div[1]/div/div[3]/a/div/img[2]")).click();
//        WebDriverWait wait = new WebDriverWait(chromeDriver, 5000);
        // change the zip code to 76140 todo can not locate element
//        chromeDriver.findElement(By.xpath("//*[@id='root']/div/div[3]/div/div/div[3]/div/div/div[12]/div/div/div[1]/div/div/div[1]/span/button")).click();

        // add two to cart todo same problem as above unable to locate element
//        chromeDriver.findElement(By.xpath("//*[@id=\'root\']/div/div[3]/div/div/div[3]/div/div/div[12]/div/div/div[2]/div/div[1]/div/div/button[2]")).click();

        // add to cart
        chromeDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]/div/div/div[12]/div/div/div[2]/div/div[2]/div[1]/div/div/button/span")).click();
    }
}
