package firstTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {
    public SafariDriver driver;

    @Before
    public void start() {
        driver = new SafariDriver();
    }

    @Test
    public void test1() {
        driver.navigate().to("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.tagName("button")).click();

    }

    @After
    public void end() {
        driver.quit();
    }
}
