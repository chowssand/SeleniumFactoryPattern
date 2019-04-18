package Manager;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public abstract class DriverManager {
    protected WebDriver driver;
    // Below abstract methods are abstracted so that whoever extends this class they need to implement their implementation in their own way
    protected abstract void createDriver() throws MalformedURLException;

    public void quitDriver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }

    }

    public WebDriver getDriver() throws MalformedURLException {
        if (driver == null) {
            createDriver();
        }
        return driver;
    }
}
