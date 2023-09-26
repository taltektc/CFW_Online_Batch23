
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class SignInTest extends SignUpTest {

    public static void main(String args[])  {

        driver = new FirefoxDriver();
        driver.get("https://qa.taltektc.com");
        driver.findElement(By.xpath("")).sendKeys("hassan.qa@gmail.com");
        driver.findElement(By.xpath("")).sendKeys("password");
        driver.findElement(By.xpath("LoginButtonXpathGoesHere")).click();
        // Assert
        String exp = "Welcome to TalentTek"; // BA/Requirements/Mock up
        String act = driver.findElement(By.xpath("//*[@id='profile_form']/legend")).getText(); // From Coding
        Assert.assertEquals(act, exp);
    }
}
