package test;


import io.appium.java_client.windows.WindowsDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WinappDriver {

    public static WindowsDriver driver;

    @BeforeMethod
    public void setup() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("app", "C:\\Program Files\\Expert1\\Tango Enterprise\\Expert1.Tango.exe");
       capabilities.setCapability("platformName", "Windows");
       capabilities.setCapability("deviceName", "WindowsPC");
        capabilities.setCapability("app", "C:\\Program Files\\Expert1\\Tango Enterprise\\Expert1.Tango.exe");

        driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), capabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElementByName("Account Managment").click();

    }

    @AfterMethod
    public void cleanup() throws MalformedURLException {
        driver.close();


    }

    @Test
    public void startTango() throws Exception {
       // WebElement expertLoginWindow = driver.findElementByName("Expert1 Login");
       // WebElement startButton = driver.findElement(By.name("Start"));
       // startButton.click();
        //Thread.sleep(10000);
    }


}
