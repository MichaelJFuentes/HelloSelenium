package org.example.untitled.WebElements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxesExercise {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        // select the first check box user checkbox example
        chromeDriver.findElement(By.cssSelector("#checkBoxOption1")).click();
        WebElement firstCheckbox = chromeDriver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
        // assert that it is selected
        Assertions.assertTrue(firstCheckbox.isSelected());
        // uncheck the same checkbox
        firstCheckbox.click();
        // assert that it is unselected
        Assertions.assertFalse(firstCheckbox.isSelected());
        // print out the under of checkboxes
        List<WebElement> checkBoxes = chromeDriver.findElements(By.cssSelector("input[type='checkbox']"));
        Assertions.assertEquals(3,checkBoxes.size());
    }
}
