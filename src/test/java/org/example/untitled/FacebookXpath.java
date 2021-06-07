package org.example.untitled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.facebook.com/");
        chromeDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("2344325323");
        chromeDriver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pass123");
        chromeDriver.findElement(By.xpath("//button[@name='login']")).click();
        System.out.println(chromeDriver.findElement(By.xpath("//*[@class='_9ay7']")).getText());

    }
}
