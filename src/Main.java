import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    private static final String URL = "https://s5.casino.softswiss.com/ru";
    private static final String PATH_TO_DRIVER = "C:\\Users\\vitali.chatyrka\\Downloads\\selenium-java-4.1.0\\chromedriver.exe";
    private ChromeDriver newDriver;

    //TODO: before
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", PATH_TO_DRIVER);
        newDriver.get(URL);
    }

    public static void main(String[] args) {
        // TODO: SAFE => util class
        String password = "1234567Qa!";
        String email = "player.user.ss+301292@gmail.com";
        //

        //TODO: to page
        String cssSelectorOfSignInButton = "#mm-0 > div.main > header > div > div.header-user-block.col-lg-5.col-md-.col-sm-5.col-xs-6 > div > div:nth-child(1) > div > a.login_lnk.ng-scope";
        String xpathOfInputEmail = "//*[@id='email']";
        String xpathOfInputPassword = "//*[@id='password']";
        String cssSelectorOfsignInButton = "body > div.modal.fade.ng-isolate-scope.modal-login.in > div > div > div > div:nth-child(4) > div:nth-child(5) > input";
        String cssSelectorOfUserName = "#mm-0 > div.main > header > div > div.header-user-block.col-lg-5.col-md-5.col-sm-5.col-xs-6 > div > div.auth-user > div.user > div.user__name.ng-binding";

        setUp();

        //TODO: to page
        WebElement signInButton = newDriver.findElement(By.cssSelector(cssSelectorOfSignInButton));
        //TODO: add step logs
        signInButton.click();

        WebElement inputEmail = newDriver.findElement(By.xpath(xpathOfInputEmail));
        inputEmail.sendKeys(email);

        WebElement inputPassword = newDriver.findElement(By.xpath(xpathOfInputPassword));
        inputPassword.sendKeys(password);

        WebElement LoginButton = newDriver.findElement(By.cssSelector(cssSelectorOfsignInButton));
        LoginButton.click();

        //TODO: actual == expected
        WebElement successTest = newDriver.findElement(By.cssSelector(cssSelectorOfUserName));

        //TODO: to logger or listener
        System.out.println("Test passed");
    }
}

