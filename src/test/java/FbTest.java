import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FbTest{
    static FbPage fbPage = new FbPage();
    @Test
    public static void test(){
        fbPage.login();
        if (fbPage.vaidatprofileIcon()==true){
            System.out.println("pass");
        }else {
            System.out.println("failed");
        }



    }
}
