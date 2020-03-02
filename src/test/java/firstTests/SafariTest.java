package firstTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class SafariTest {
    public SafariDriver driver;

    @Before
    public void start() {
        driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test1() {
        driver.navigate().to("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.cssSelector("button.btn btn-default")).click();

       // driver.findElement(By.name("Appearance")).click();
      //  driver.findElement(By.id("tamplate")).click();
      //  driver.findElement(By.id("logotype")).click();
    }


    public void test2() {
        driver.findElement(By.id("appearance")).click();
        driver.findElement(By.id("tamplate")).click();
        driver.findElement(By.id("logotype")).click();
    }

    @After
    public void end() {
        driver.quit();
    }


}
