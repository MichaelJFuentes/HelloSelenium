package org.example.untitled.WebElements;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementEnabled {
    public static void main(String[] args) {
        WebDriver driver = ChromeDriverSetup.getDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement secondCalendar = driver.findElement(By.cssSelector("#Div1"));
        Assertions.assertTrue(secondCalendar.getAttribute("style").contains("0.5"));
    }
}
