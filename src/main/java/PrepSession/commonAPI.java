package PrepSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Hello world!
 *
 */
public class commonAPI
{
    WebDriver driver;
    @BeforeTest
    public void buildUP(){
        System.setProperty("web-driver.gecko.driver",System.getProperty("user.dir")+"/Drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
