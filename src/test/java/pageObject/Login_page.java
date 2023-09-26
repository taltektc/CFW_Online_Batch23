package pageObject;

import base.Config;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Login_page extends Config {

    public void enterEmail(String emailAddress){
        driver.findElement(By.name ("email")).sendKeys(emailAddress);
    }

    public void enterPassword(String enterPassword){
        driver.findElement(By.name ("password")).sendKeys(enterPassword);
    }

    public void clickLoginButton(){
        driver.findElement(By.xpath("//*[@id='login_form']/input[3]")).click();
    }

    public void invalidEmailOrPasswordMsg(){
        String act = driver.findElement(By.xpath("//*[@id='error_message']/div/h5")).getText();
        String exp = "You have entered an incorrect email or student Id.";
        Assert.assertEquals(act, exp);
    }



}
