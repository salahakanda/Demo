import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FaceBook {


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
    public static void login(String idd, String passd){

            clear("//*[@id=\"email\"]");
            //driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
            sendKeys("//*[@id=\"email\"]", idd);
            //driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("jakfdhlksanflk");
            clear("//*[@id=\"pass\"]");
            //driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
            sendKeys("//*[@id=\"pass\"]", passd);
            // driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("098789lkjg");
            click(".//*[@id='u_0_2']");
            //click(".//*[@id='u_0_2']");
            //driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
            driver.navigate().back();

    }

    public static WebDriver driver = null;

    public static String id = "jlkjkljklj";
    public static String pass = "kjklh";

    @BeforeMethod
    public static void beforeMethod(){

        System.setProperty("webdriver.chrome.driver", "/Users/salahakanda/IdeaProjects/NewProject/src/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    @Test
    public static void test(){
        for (int i=0;i<5;i++) {
            login(id + i + "@yahoo.com",pass + i );
        }


    }

    @AfterMethod
    public static void afterTest(){
        driver.quit();



    }

}
