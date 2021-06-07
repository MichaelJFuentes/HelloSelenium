package org.example.untitled.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver chromeDriver = ChromeDriverSetup.getDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        // enter name in alert section
        chromeDriver.findElement(By.id("name")).sendKeys("Mike");
        chromeDriver.findElement(By.xpath("//input[@value='Alert']")).click();
//        Thread.sleep(1000);
        // switch ?
        System.out.println(chromeDriver.switchTo().alert().getText());
        chromeDriver.switchTo().alert().accept();
        chromeDriver.close();

    }
}
