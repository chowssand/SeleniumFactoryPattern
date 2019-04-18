package Manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ChromeDriverManager extends DriverManager {

    protected void createDriver() throws MalformedURLException {
//        System.setProperty("webdriver.chrome.driver","C:\\Python27\\Scripts\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        driver = new RemoteWebDriver(new URL("http://10.100.6.176:4444/wd/hub"),options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
    }


}
