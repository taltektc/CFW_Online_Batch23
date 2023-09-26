import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SignUpTest {
    public static WebDriver driver;

    public static void main(String args[])  {

        driver = new ChromeDriver();
        driver.get("https://qa.taltektc.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
        driver.findElement(By.xpath("//*[@id='wrap']/div/div/div/a")).click();
        driver.findElement(By.name("firstName")).sendKeys("Hassan");
        driver.findElement(By.name("lastName")).sendKeys("Bhuiyan");
        driver.findElement(By.name("email")).sendKeys("test23232dfd@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("confirmPassword")).sendKeys("123456");
        driver.findElement(By.name("month")).click();
        new Select(driver.findElement(By.name("month"))).selectByVisibleText("Apr");
        driver.findElement(By.id("signup-form")).click();
        driver.findElement(By.xpath("//form[@id='signup-form']/label[3]")).click();
        driver.findElement(By.xpath("//form[@id='signup-form']/div[5]/label/span")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
