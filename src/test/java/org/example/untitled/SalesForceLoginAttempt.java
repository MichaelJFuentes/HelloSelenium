package org.example.untitled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceLoginAttempt {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();

        // get website page
        chromeDriver.get("https://login.salesforce.com/");
        // enter username
        chromeDriver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Hello");
        // enter password
        chromeDriver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("World");
        // click enter
        chromeDriver.findElement(By.xpath("//*[@id=\"Login\"]")).click();

        // get the error message that is shown
        String errorMessage = chromeDriver.findElement(By.xpath("//*[@id=\"error\"]")).getText();
        System.out.println(errorMessage);

        // click on forgot password
        chromeDriver.findElement(By.xpath("//*[@id=\"forgot_password_link\"]")).click();

    }
}
