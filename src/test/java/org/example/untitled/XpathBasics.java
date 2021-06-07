package org.example.untitled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBasics {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://www.homedepot.com//");
        chromeDriver.manage().window().maximize();
        // getting you don't have permission to view page
        chromeDriver.findElement(By.xpath("//*[@id=\"headerSearch\"]")).sendKeys("PEX pipe");
        // click search button
        chromeDriver.findElement(By.xpath("//*[@id=\"headerSearchButton\"]")).click();
        // click on best seller
        chromeDriver.findElement(By.xpath("//*[@id=\"browse-search-pods-1\"]/div[1]/div/div[3]/a/div/img")).click();

        chromeDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[3]/div/div/div[12]/div/div/div[2]/div/div[1]/div/div/button[2]")).click();

    }
}
