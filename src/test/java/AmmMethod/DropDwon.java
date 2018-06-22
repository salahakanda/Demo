package AmmMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;



public class DropDwon {
    static WebDriver driver;
    @BeforeTest

    public static void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/salahakanda/IdeaProjects/NewProject/src/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    @Test
    public static void test() throws Exception{
        WebElement month = driver.findElement(By.xpath(".//*[@id='month']"));
        Select drop = new Select(month);

       //jan
        Thread.sleep(5000);
        drop.selectByIndex(1);

        Thread.sleep(3000);

        //may
        drop.selectByValue("5");
        Thread.sleep(3000);



        //Dec
        drop.selectByVisibleText("Dec");

        System.out.println(month.getTagName());
        System.out.println(month.getText());
        System.out.println( month.getSize());
        List<WebElement> dpo = drop.getOptions();

        dpo.size();
        driver.quit();





    }
}
