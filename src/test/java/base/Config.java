package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Config {
    public static WebDriver driver;

    public static WebDriver setupBrowser (String driverType){
        if(driverType.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (driverType.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        } else if (driverType.equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }


}
