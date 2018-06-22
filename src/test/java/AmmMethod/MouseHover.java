package AmmMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class MouseHover {
     WebDriver driver;
    @BeforeTest

    public  void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/salahakanda/IdeaProjects/NewProject/src/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
    }

    @Test
    public  void test() throws Exception{

        WebElement month = driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(month).perform();
        Thread.sleep(5000);
        driver.quit();

    }
}
