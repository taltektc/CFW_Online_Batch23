package stepDef;

import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends Config {
    public static String envType = System.getProperty("env");
    public static String browserType = System.getProperty("browser");
    public static String baseURL;

    @Before
    public void startTest(){
        driver = setupBrowser(browserType);
        switch (envType){
            case "qa":
                //baseURL = "https://qa.taltektc.com";
                baseURL = "https://www.qa.saucedemo.com/";
                SAUCE_DEMO_USER_NAME = "standard_user";
                SAUCE_DEMO_PASSWORD = "secret_sauce";
                break;
            case "stage":
                //baseURL = "https://stage.taltektc.com";
                baseURL = "https://www.saucedemo.com/";
                SAUCE_DEMO_USER_NAME = "visual_user";
                SAUCE_DEMO_PASSWORD = "secret_sauce";
                break;
            case "prod":
                baseURL = "https://prod.taltektc.com";
                break;
        }
        driver.get(baseURL);
    }

    @After
    public void testComplete(Scenario scenario){
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        driver.close();
        driver.quit();
    }

}
