package Tests;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseSetUp {
    @Test
    public void LoginFacebook(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
        driver.get("https://www.facebook.com");
    }
    @Test
    public void OpenGamil(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
        driver.get("https://www.gmail.com");
    }
}
