package org.example.untitled.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestedDropDown {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        chromeDriver.findElement(By.id("autosuggest")).sendKeys("in");
        Thread.sleep(1000);
        List<WebElement> elements = chromeDriver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals("India")) {
                elements.get(i).click();
                break;
            }
        }

    }
}
