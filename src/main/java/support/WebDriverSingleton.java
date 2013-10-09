package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class WebDriverSingleton {

    private static WebDriver driver;

    public static WebDriver getInstance() {
        if (driver == null) {
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        }

        return driver;

    }


}
