package PrepSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

/**
 * Hello
 *
 */
public class commonAPI {
  WebDriver driver;

  @BeforeTest
  @Parameters("browser")
  public void buildUP(String browser) {
    if (browser.equalsIgnoreCase("firefox")) {
      //System.setProperty("web-driver.gecko.driver", System.getProperty("user.dir") + "/Drivers/geckodriver");
      // driver = new FirefoxDriver();
      DesiredCapabilities cap = new DesiredCapabilities();
      cap.setCapability("browserName", "firefox");
      try {
        driver = new RemoteWebDriver(new URL("http://192.168.1.235:4444/wd/hub"), cap);
      } catch (MalformedURLException e) {
        // TODO: handle exception
        e.printStackTrace();
      }

    } else if (browser.equalsIgnoreCase("chrome")) {
      //System.setProperty("web-driver.gecko.driver", System.getProperty("user.dir") + "/Drivers/chromedriver");
      // driver = new ChromeDriver();
      DesiredCapabilities cap = new DesiredCapabilities();
      cap.setCapability("browserName", "chrome");
      try {
        driver = new RemoteWebDriver(new URL("http://192.168.1.235:4444/wd/hub"), cap);
      } catch (MalformedURLException e) {
        // TODO: handle exception
        e.printStackTrace();
      }
    }
    driver.manage().window().maximize();
    driver.get("https://google.com");
  }

  @AfterTest
  public void tearDown() {
    driver.quit();
  }
}
