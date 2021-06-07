package org.example.untitled.WebElements;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EndToEndPractice {
    public static void main(String[] args) throws InterruptedException{
        // set up driver
        WebDriver driver = ChromeDriverSetup.getDriver();
        driver.manage().window().maximize();

        // get page
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // enter india in search
        WebElement searchBar = driver.findElement(By.cssSelector("#autosuggest"));
        searchBar.sendKeys("ind");
        Thread.sleep(1000);
        List<WebElement> searchBarElements = searchBar.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
        Assertions.assertEquals(3, searchBarElements.size());
        for (WebElement element :
                searchBarElements) {
            if (element.getText().equals("India")) {
                element.click();
                break;
            }
        }

        // select a city from departure city todo only works when window is maximized
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='JRG']")).click();
        Thread.sleep(1000);

        // select a city from arrival city
        driver.findElement(By.cssSelector("div[id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] a[value = 'VTZ']")).click();

        // select a date
        Thread.sleep(1000);
//        web page element is not working
        driver.findElement(By.id("ctl00_mainContent_view_date1")).click();

        // add two adults
        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("hrefIncAdt")).click();
        // change currency to USD
        driver.findElement(By.cssSelector("select[id*='DropDownListCurrency'] option[value='USD']")).click();
        // apply student discount
        driver.findElement(By.xpath("//input[contains(@name, 'family')]")).click();
    }
}
