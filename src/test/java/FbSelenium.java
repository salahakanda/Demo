import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class FbSelenium {

    public static WebDriver driver = null;


    public static void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/salahakanda/IdeaProjects/NewProject/src/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    public static void afterTest(){
        driver.quit();
    }
    public static void sendKeys(String xpath, String id){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(xpath)).sendKeys(id);
    }
    public static void clear(String xpath){
        driver.findElement(By.xpath(xpath)).clear();
    }
    public static void click(String xpath){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(xpath)).click();
    }
    public static boolean valiDate(String Xpath){
        return driver.findElement(By.xpath(Xpath)).isDisplayed();
    }
}
