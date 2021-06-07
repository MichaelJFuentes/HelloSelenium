package org.example.untitled.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        // get static drop down
        WebElement staticDropDownWebElement = chromeDriver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]"));
        Select dropDownStatic = new Select(staticDropDownWebElement);
        dropDownStatic.selectByValue("USD");
//        dropDownStatic.selectByVisibleText("USD");
//        dropDownStatic.selectByIndex(3);

        // print out what is selected
        System.out.println(dropDownStatic.getFirstSelectedOption().getText());
    }
}
