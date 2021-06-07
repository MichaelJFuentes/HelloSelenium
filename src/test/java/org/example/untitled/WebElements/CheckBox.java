package org.example.untitled.WebElements;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class CheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // select family and friends check box
//        chromeDriver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        // using regex expression
        chromeDriver.findElement(By.xpath("//input[contains(@id,'family')]")).click();

        // check if selected
        boolean isFamilyCheckSelected = chromeDriver.findElement(By.cssSelector("input[id *= 'family']")).isSelected();
        System.out.println(isFamilyCheckSelected);



        // select odd number of check boxes in the header, site only allows for one discount, but the function method below works
//        List<WebElement> checkboxes = chromeDriver.findElements(By.cssSelector("div[id *= 'discount-checkbox'] input[type = 'checkbox']"));
//        for (int i = 0; i < checkboxes.size(); i++) {
//            if (i % 2 == 1) {
//                checkboxes.get(i).click();
//            }
//        }
//        System.out.println(checkboxes.size());

    }

}
