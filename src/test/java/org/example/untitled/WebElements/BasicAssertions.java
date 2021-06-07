package org.example.untitled.WebElements;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAssertions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        chromeDriver.findElement(By.cssSelector("input[id *= 'family']")).click();
        boolean isFamilySelected = chromeDriver.findElement(By.xpath("//input[contains(@id,'family')]")).isSelected();
        Assertions.assertTrue(isFamilySelected);
//        Assertions.assertFalse(isFamilySelected, "Check box is selected");

    }

}
