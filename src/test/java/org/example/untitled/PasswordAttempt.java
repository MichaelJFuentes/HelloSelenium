package org.example.untitled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasswordAttempt {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");
        chromeDriver.findElement(By.cssSelector("#modalusername")).sendKeys("testEmail@gmail.com");
        chromeDriver.findElement(By.cssSelector("#current-password")).sendKeys("test123");

        // click the show password button
        chromeDriver.findElement(By.cssSelector("._8HgG3")).click();
        // click on login
        chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/div/div[4]/div[1]/button")).click();
    }
}
