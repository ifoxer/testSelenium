package firstTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class findeElements {
    public ChromeDriver driver;

        @Before
        public void start() {
            System.setProperty("webdriver.chrome.driver", "/Users/ifoxer/Drivers/chromedriver");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

        @Test
        public void Test() {
            driver.navigate().to("http://localhost/litecart/admin/");
            driver.findElement(By.name("username")).sendKeys("admin");
            driver.findElement(By.name("password")).sendKeys("admin");
            driver.findElement(By.tagName("button")).click();
            driver.findElement(By.id("logotype"));
            WebElement search = driver.findElement(By.cssSelector("div#search"));
            search.click();



            WebElement appearance = driver.findElement(By.cssSelector("li.app[data-code=appearance]"));
            appearance.click();
            WebElement template = driver.findElement(By.cssSelector("li.doc.selected[data-code=template]"));
            template.click();
            WebElement logotype = driver.findElement(By.cssSelector("li.doc[data-code=logotype]"));
            logotype.click();



            WebElement catalog = driver.findElement(By.cssSelector("li.app[data-code=catalog]"));
            catalog.click();
            WebElement catalog_v = driver.findElement(By.cssSelector("li.doc.selected[data-code=catalog]"));
            catalog_v.click();
            WebElement attribute_groups = driver.findElement(By.cssSelector("li.doc[data-code=attribute_groups]"));
            attribute_groups.click();
            WebElement option_groups = driver.findElement(By.cssSelector("li.doc[data-code=option_groups"));
            option_groups.click();
            WebElement manufacturers = driver.findElement(By.cssSelector("li.doc[data-code=manufacturers]"));
            manufacturers.click();
            WebElement suppliers = driver.findElement(By.cssSelector("li.doc[data-code=suppliers]"));
            suppliers.click();
            WebElement delivery_statuses = driver.findElement(By.cssSelector("li.doc[data-code=delivery_statuses]"));
            delivery_statuses.click();
            WebElement sold_out_statuses = driver.findElement(By.cssSelector("li.doc[data-code=sold_out_statuses"));
            sold_out_statuses.click();
            WebElement quantity_units = driver.findElement(By.cssSelector("li.doc[data-code=quantity_units]"));
            quantity_units.click();
            WebElement csv = driver.findElement(By.cssSelector("li.doc[data-code=csv]"));
            csv.click();

            WebElement countries = driver.findElement(By.cssSelector("li.app[data-code=countries]"));
            countries.click();

            WebElement currencies = driver.findElement(By.cssSelector("li.app[data-code=currencies]"));
            currencies.click();

            WebElement customers = driver.findElement(By.cssSelector("li.app[data-code=customers]"));
            customers.click();
            WebElement customer = driver.findElement(By.cssSelector("li.doc.selected[data-code=customers]"));
            customer.click();
            WebElement csv_v = driver.findElement(By.cssSelector("li.doc[data-code=csv]"));
            csv_v.click();
            WebElement newsletter = driver.findElement(By.cssSelector("li.doc[data-code=newsletter]"));
            newsletter.click();

            WebElement geoZones = driver.findElement(By.cssSelector("li.app[data-code=geo_zones]"));
            geoZones.click();

            WebElement languages = driver.findElement(By.cssSelector("li.app[data-code=languages]"));
            languages.click();
            WebElement language = driver.findElement(By.cssSelector("li.doc.selected[data-code=languages]"));
            language.click();
            WebElement storage_encoding = driver.findElement(By.cssSelector("li.doc[data-code=storage_encoding]"));
            storage_encoding.click();

            WebElement modules = driver.findElement(By.cssSelector("li.app[data-code=modules"));
            modules.click();
            WebElement customer_modules = driver.findElement(By.cssSelector("li.doc.selected[data-code=customer]"));
            customer_modules.click();
            WebElement shipping_modules = driver.findElement(By.cssSelector("li.doc[data-code=shipping]"));
            shipping_modules.click();
            WebElement payment_modules = driver.findElement(By.cssSelector("li.doc[data-code=payment]"));
            payment_modules.click();
            WebElement order_modules = driver.findElement(By.cssSelector("li.doc[data-code=order]"));
            order_modules.click();
            WebElement order_total_modules = driver.findElement(By.cssSelector("li.doc[data-code=order_total]"));
            order_total_modules.click();
            WebElement job_modules = driver.findElement(By.cssSelector("li.doc[data-code=jobs]"));
            job_modules.click();

            WebElement orders = driver.findElement(By.cssSelector("li.app[data-code=orders"));
            orders.click();
            WebElement orders_doc = driver.findElement(By.cssSelector("li.doc.selected[data-code=orders]"));
            orders_doc.click();
            WebElement order_statuses = driver.findElement(By.cssSelector("li.doc[data-code=order_statuses]"));
            order_statuses.click();

            WebElement pages = driver.findElement(By.cssSelector("li.app[data-code=pages"));
            pages.click();
            WebElement pages_doc = driver.findElement(By.cssSelector("li.doc.selected[data-code=pages]"));
            pages_doc.click();
            WebElement csv_page = driver.findElement(By.cssSelector("li.doc[data-code=csv]"));
            csv_page.click();

            WebElement reports = driver.findElement(By.cssSelector("li.app[data-code=reports"));
            reports.click();
            WebElement monthly_sales = driver.findElement(By.cssSelector("li.doc.selected[data-code=monthly_sales]"));
            monthly_sales.click();
            WebElement most_sold_products = driver.findElement(By.cssSelector("li.doc[data-code=most_sold_products]"));
            most_sold_products.click();
            WebElement most_shopping_customers = driver.findElement(By.cssSelector("li.doc[data-code=most_shopping_customers]"));
            most_shopping_customers.click();

            WebElement settings = driver.findElement(By.cssSelector("li.app[data-code=settings"));
            settings.click();
            WebElement store_info = driver.findElement(By.cssSelector("li.doc.selected[data-code=store_info]"));
            store_info.click();
            WebElement defaults = driver.findElement(By.cssSelector("li.doc[data-code=defaults]"));
            defaults.click();
            WebElement email = driver.findElement(By.cssSelector("li.doc[data-code=email]"));
            email.click();
            WebElement listings = driver.findElement(By.cssSelector("li.doc[data-code=listings]"));
            listings.click();
            WebElement customer_details = driver.findElement(By.cssSelector("li.doc[data-code=customer_details]"));
            customer_details.click();
            WebElement legal = driver.findElement(By.cssSelector("li.doc[data-code=legal]"));
            legal.click();
            WebElement images = driver.findElement(By.cssSelector("li.doc[data-code=images]"));
            images.click();
            WebElement checkout = driver.findElement(By.cssSelector("li.doc[data-code=checkout]"));
            checkout.click();
            WebElement advanced = driver.findElement(By.cssSelector("li.doc[data-code=advanced]"));
            advanced.click();
            WebElement security = driver.findElement(By.cssSelector("li.doc[data-code=security]"));
            security.click();

            WebElement slides = driver.findElement(By.cssSelector("li.app[data-code=slides"));
            slides.click();

            WebElement tax = driver.findElement(By.cssSelector("li.app[data-code=tax"));
            tax.click();
            WebElement tax_rates = driver.findElement(By.cssSelector("li.doc.selected[data-code=tax_rates]"));
            tax_rates.click();
            WebElement tax_classes = driver.findElement(By.cssSelector("li.doc[data-code=tax_classes]"));
            tax_classes.click();

            WebElement translations = driver.findElement(By.cssSelector("li.app[data-code=translations"));
            translations.click();
            WebElement search_trans = driver.findElement(By.cssSelector("li.doc.selected[data-code=search]"));
            search_trans.click();
            WebElement scan = driver.findElement(By.cssSelector("li.doc[data-code=scan]"));
            scan.click();
            WebElement csv_trans = driver.findElement(By.cssSelector("li.doc[data-code=csv]"));
            csv_trans.click();

            WebElement users = driver.findElement(By.cssSelector("li.app[data-code=users"));
            users.click();

            WebElement vqmods = driver.findElement(By.cssSelector("li.app[data-code=vqmods"));
            vqmods.click();


            List<WebElement>allElements = driver.findElements(By.cssSelector("div.panel-heading"));
        }



        @After
        public void  close() {
            driver.quit();
        }


    }


