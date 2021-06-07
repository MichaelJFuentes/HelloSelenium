package org.example.untitled.WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverSetup {
    public static ChromeDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
        return new ChromeDriver();
    }
}
