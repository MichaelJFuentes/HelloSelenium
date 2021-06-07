package org.example.untitled.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdown {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        chromeDriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        chromeDriver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(2000);
//        chromeDriver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        // without using indexes
        chromeDriver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

    }
}
