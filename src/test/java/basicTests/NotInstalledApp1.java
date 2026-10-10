package basicTests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class NotInstalledApp1 {

    AppiumDriver driver;

    @BeforeClass
    public void setup(){
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setNoReset(true);
        options.setApp(System.getProperty("user.dir")+"/src/test/resources/apps/app-qa-release.apk");

        try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));

    }
    @Test
    public void testimonialTest(){

        driver.findElement(AppiumBy.accessibilityId("Testimonials")).click();
        driver.findElement(AppiumBy.accessibilityId("All Reviews")).isDisplayed();

    }
}
