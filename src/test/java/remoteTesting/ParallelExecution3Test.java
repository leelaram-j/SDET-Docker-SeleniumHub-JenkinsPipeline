package remoteTesting;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ParallelExecution3Test
{
    @Test
    public void test3() throws MalformedURLException
    {
        DesiredCapabilities des = new DesiredCapabilities().chrome();
        URL u = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(u, des);
        driver.get("https://www.youtube.com");
        System.out.println(driver.getTitle());
    }
}
