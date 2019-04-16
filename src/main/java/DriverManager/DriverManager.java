package DriverManager;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
    protected WebDriver driver;
    // Below abstract methods are abstracted so that whoever extends this class they need to implement their implementation in their own way
    protected abstract void createDriver();

    public void quitDriver() {
        if (this.driver != null) {
            this.driver.quit();
            this.driver = null;
        }

    }

    public WebDriver getDriver() {
        if (this.driver == null) {
            createDriver();
        }
        return this.driver;
    }
}
