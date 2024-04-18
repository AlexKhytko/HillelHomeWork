package HW11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Post {
          public static void main(String[] args) throws InterruptedException {

            String browserName = System.getenv("browser");
            System.out.println(browserName);


            RemoteWebDriver browser = getDriver(args[0]);
            browser.get("https://track.ukrposhta.ua/tracking_UA.html");
            Thread.sleep(1000);

            browser.manage().window().maximize();
            System.out.println(browser.getTitle());

            WebElement fieldTrack = browser.findElement(By.cssSelector("input[data-ng-model=\"barcode\"][id=\"trackcode\"]"));
            fieldTrack.click();
            fieldTrack.sendKeys("0503714178700");
//
            WebElement mailTrack = browser.findElement(By.cssSelector("button[data-ng-model=\"loading\"][id=\"trackbutton\"]"));
            mailTrack.click();

          Thread.sleep(1000);
            //browser.quit();

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





