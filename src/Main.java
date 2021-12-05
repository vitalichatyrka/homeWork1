import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        String URL = "https://s5.casino.softswiss.com/ru";
        String passToWebdriver = "C:\\Users\\vitali.chatyrka\\Downloads\\selenium-java-4.1.0\\chromedriver.exe";


        System.setProperty("webdriver.chrome.driver",passToWebdriver);
        ChromeDriver newDriver = new ChromeDriver();
        newDriver.get(URL);

        WebElement signInButton = newDriver.findElement(By.cssSelector("#mm-0 > div.main > header > div > div.header-user-block.col-lg-5.col-md-5.col-sm-5.col-xs-6 > div > div:nth-child(1) > div > a.login_lnk.ng-scope"));
        signInButton.click();

        WebElement inputEmail = newDriver.findElement(By.xpath("//*[@id=\"email\"]"));
        inputEmail.sendKeys("player.user.ss+301292@gmail.com");

        WebElement inputPassword = newDriver.findElement(By.xpath("//*[@id=\"password\"]"));
        inputPassword.sendKeys("1234567Qa!");

        WebElement button = newDriver.findElement(By.cssSelector("body > div.modal.fade.ng-isolate-scope.modal-login.in > div > div > div > div:nth-child(4) > div:nth-child(5) > input"));
        button.click();

        WebElement successTest = newDriver.findElement(By.cssSelector("#mm-0 > div.main > header > div > div.header-user-block.col-lg-5.col-md-5.col-sm-5.col-xs-6 > div > div.auth-user > div.user > div.user__name.ng-binding"));
        System.out.println("Test passed");


    }
}
