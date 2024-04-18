package HW11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Заходить на сайт https://ithillel.ua/
//        Обирає курс Програмування -> Курс Front-End Basic
//        Збирає та виводит в консоль імена викладачів
        String browserName = System.getenv("browser");
        System.out.println(browserName);

        RemoteWebDriver browser = getDriver(args[0]);
        browser.get("https://ithillel.ua/");
        Thread.sleep(1000);

        browser.manage().window().maximize();
        System.out.println(browser.getTitle());

        WebElement blogButton = browser.findElement(By.cssSelector("*.site-nav-btn[href*=\"blog\"]"));
        blogButton.click();

        System.out.println(browser.getTitle());

        WebElement searchFieldButton = browser.findElement(By.cssSelector("*.site-nav-search_btn"));
        searchFieldButton.click();

        WebElement searchInput = browser.findElement(By.cssSelector("*.site-nav-search_input"));
        searchInput.sendKeys("jobs");
        searchFieldButton.click();


        Thread.sleep(1000);
       // browser.quit();
    }
        static RemoteWebDriver getDriver (String driverName){
            switch (driverName) {
                case "chrome":
                    return new ChromeDriver();
                default:
                    throw new IllegalArgumentException("I don't have such driver");
            }
        }
    }
