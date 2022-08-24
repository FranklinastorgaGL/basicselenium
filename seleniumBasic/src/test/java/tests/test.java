package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import config.*;

public class test {

     WebDriver driver;

    @BeforeTest(groups = {"prueba"})
    public void browserCreator() throws Exception {
        driver = webDriverCreator.createChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }
    @Test (groups = {"prueba"})
    public void pageTest() throws InterruptedException {
        driver.findElement(By.id("search_query_top")).sendKeys("GRACIAS POR VENIR AL WORKSHOP!!");
    }

    @AfterTest(groups = {"prueba"})
    public void browserCloser(){
        driver.close();
    }
}
