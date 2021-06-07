package org.example.untitled;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest {
    public static void main(String[] args) {
        // invoke browser
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
        // creating drive object
        WebDriver chromeDriver = new ChromeDriver();
        // getting a page
        chromeDriver.get("https://www.google.com/");
        // get title of page
        String title = chromeDriver.getTitle();
        // ensure correct page, no redirect
        if (chromeDriver.getCurrentUrl().equals("https://www.google.com/")) {
            System.out.println("Correct URL");
        } else {
            System.out.println("Incorrect URL");
        }
        System.out.println(title);

        // get page source
        String source = chromeDriver.getPageSource();
//        System.out.println(source);

        // move to another website
        chromeDriver.get("https://www.apple.com/");

        // return to google page
        chromeDriver.navigate().back();

        // close browser
        chromeDriver.close();

    }
}
