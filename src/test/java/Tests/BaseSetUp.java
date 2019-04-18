package Tests;

import Manager.CreateBrowserObject;
import Manager.DriverManager;
import Manager.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

public class BaseSetUp {
    protected WebDriver driver;
    DriverManager dm;
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        dm = CreateBrowserObject.getManager(DriverType.CHROME);
        driver = dm.getDriver();
        System.out.println("Instance is "+driver);
    }

    @AfterMethod
    public void tearDown(){
        dm.quitDriver();
    }
}
