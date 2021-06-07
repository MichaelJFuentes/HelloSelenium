package org.example.untitled.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownLooping {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        chromeDriver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        for (int i = 0; i < 2; i++) {
            chromeDriver.findElement(By.id("hrefIncAdt")).click();
        }
        chromeDriver.findElement(By.id("btnclosepaxoption")).click();
        String passengersText = chromeDriver.findElement(By.id("divpaxinfo")).getText();
        System.out.println(passengersText);

    }
}
