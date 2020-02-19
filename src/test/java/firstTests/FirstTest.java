package firstTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public ChromeDriver driver;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "/Users/ifoxer/Drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://yandex.ru/");
    }

    @After
     public void  close() {
            driver.quit();
    }
}
