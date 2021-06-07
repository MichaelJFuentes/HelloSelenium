package org.example.untitled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TalonWebPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.talonsystems.com/");

        chromeDriver.findElement(By.xpath("//*[@id=\"menu-item-58\"]/a")).click();

        // click on the product tabs
        chromeDriver.findElement(By.xpath("//*[@id=\"menu-item-60\"]/a")).click();
        // pick ETA in product tab
        chromeDriver.findElement(By.xpath("//*[@id=\"menu-item-55\"]")).click();
        // scroll down

        // go back to the home page

        // get the content of the ETA 
    }
}
