public class FbPage {
    public static FbSelenium fbSelenium = new FbSelenium();

    // Id and Pass

    static String id = "ljhklsdfglkjkl@gmail.com";
    static String pass = "878687687";
    //login xpath
    static String emailClearXpath = "//*[@id=\"email\"]";
    static String emailIdXpath = "//*[@id=\"email\"]";
    static String passwordClearXpath = "//*[@id=\"pass\"]";
    static String passwoedXpath = "//*[@id=\"pass\"]";
    static String clickXpath = "//*[@id=\"u_0_8\"]";
    // Validate xpath
    static String validateXpath = "";


    public static void login() {
        fbSelenium.beforeTest();
        fbSelenium.clear(emailClearXpath);
        fbSelenium.sendKeys(emailIdXpath, id);
        fbSelenium.clear(passwordClearXpath);
        fbSelenium.sendKeys(passwoedXpath, pass);
        fbSelenium.click(clickXpath);
        fbSelenium.driver.navigate().back();
        fbSelenium.afterTest();

    }

    public static boolean vaidatprofileIcon() {
        try {
            return fbSelenium.valiDate(validateXpath);
        } catch (Exception e) {

        }

        return false;
        //return System.out.println(" ");
    }

}