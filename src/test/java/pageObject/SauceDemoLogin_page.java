package pageObject;

import base.Config;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SauceDemoLogin_page extends Config {

    public void enterUsername(String userName){
        driver.findElement(By.name ("user-name")).sendKeys(userName);
    }

    public void enterPassword(String enterPassword){
        driver.findElement(By.name ("password")).sendKeys(enterPassword);
    }

    public void clickLoginButton(){
        driver.findElement(By.name("login-button")).click();
    }

    public void invalidEmailOrPasswordMsg(){
        String act = driver.findElement(By.xpath("//*[@id='error_message']/div/h5")).getText();
        String exp = "You have entered an incorrect email or student Id.";
        Assert.assertEquals(act, exp);
    }

    public void verifyLogoName(){
        String act = driver.findElement(By.xpath("//*[@id='root']/div/div[1]")).getText();
        String exp = "Swag Labsssss";
        Assert.assertEquals(act, exp);
    }

    //*[@id="root"]/div/div[1]



}
