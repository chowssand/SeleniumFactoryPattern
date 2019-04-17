package Tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseSetUp {
    @Test
    public void LoginFacebook(){
        driver.get("https://www.facebook.com");
    }
    @Test
    public void OpenGamil(){
        driver.get("https://www.gmail.com");
    }
}
