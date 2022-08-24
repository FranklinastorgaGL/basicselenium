package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class webDriverCreator {

    public static WebDriver driver;

    public static WebDriver createChromeDriver() throws Exception {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }






}
