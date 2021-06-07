package org.example.untitled.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UIPractice {
    public static void main(String[] args) {
        WebDriver chromeDriver = ChromeDriverSetup.getDriver();
        chromeDriver.get("https://www.cleartrip.com/");

        //select adult members, any number
        chromeDriver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/select[1]")).click();
        chromeDriver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/select[1] //option[@value='2']")).click();
        // select children, any number
        chromeDriver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/select[1]")).click();
        chromeDriver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/select[1] //option[@value='1']")).click();
        // select depart date today
        chromeDriver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
        chromeDriver.findElement(By.cssSelector(".DayPicker-Day--today")).click();
        // click on link "more options"
        chromeDriver.findElement(By.xpath("//a/strong[@class='pr-1']")).click();
        // search for a preferred airline
        chromeDriver.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys("South");
        List<WebElement> airlines = chromeDriver.findElements(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[3]/div[1]/div[1]/div[2] //li"));
        for(WebElement airline : airlines) {
            if (airline.getText().equals("SouthWest (WN)")) {
                airline.click();
                break;
            }
        }

        // search flights
        chromeDriver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[8]/div[2]/div[1]/button[1]")).click();
        // print out the error message to console
        String message = chromeDriver.findElement(By.xpath("//span[contains(text(),'Select Departure and Arrival airports/cities.')]")).getText();
        System.out.println(message);
    }
}
