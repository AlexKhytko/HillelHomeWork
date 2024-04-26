package CREDIT7;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
public class test3Enter {
    public static void main(String[] args) throws InterruptedException {
        String browserName = System.getenv("browser");
        System.out.println(browserName);

        String userNameValue = "powar";
        String userPassValue = "showmethemoney";

        RemoteWebDriver browser = getDriver(args[0]);
        browser.get("https://api3.uashort.agis.work/admin/login");


        browser.manage().window().maximize();
        System.out.println(browser.getTitle());

        WebElement userName = browser.findElement(By.id("username"));
        userName.click();
        userName.sendKeys(userNameValue);

        WebElement userPass = browser.findElement(By.id("password"));
        userPass.click();
        userPass.sendKeys(userPassValue);

        WebElement userEnter = browser.findElement(By.id("submit"));
        userEnter.click();
        WebElement treeAll = browser.findElement(By.linkText("Меню користувач"));
        treeAll.click();

        WebElement treeUserAll = browser.findElement(By.linkText("Всі користувачі"));
        treeUserAll.click();

//




    }

    static RemoteWebDriver getDriver(String driverName) {
        switch (driverName) {
            case "chrome":
                return new ChromeDriver();
            default:
                throw new IllegalArgumentException("I don't have such driver");
        }
    }
}
