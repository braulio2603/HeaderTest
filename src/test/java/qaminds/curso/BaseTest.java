package qaminds.curso;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
   WebDriver driver;
    @BeforeTest
    public void openBrowser() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://microsoft.com");
        driver.manage().window().maximize();
        //Thread.sleep(15000);
    }
/*@AfterTest
public void cerrarBrowser(){
        driver.quit();
}*/

public WebDriver getDriver(){
        return driver;
}

}
