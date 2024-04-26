package HW12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoCategory {
    protected WebDriver driver;
    private static final By Go_To_Programming = By.cssSelector("#categories > div > ul > li:nth-child(1) > a");
    private static final By Go_To_Management = By.cssSelector("#categories > div > ul > li:nth-child(3) > a");
    private static final By Go_To_Business = By.cssSelector("#categories > div > ul > li:nth-child(4) > a");
    private static final By Go_To_Marketing = By.cssSelector("#categories > div > ul > li:nth-child(5) > a");
    private static final By Go_To_Design = By.cssSelector("#categories > div > ul > li:nth-child(6) > a");
    private static final By Go_To_Kids = By.cssSelector("#categories > div > ul > li:nth-child(7) > a");
    private static final By Go_To_Kids711 = By.cssSelector("#categories > div > ul > li:nth-child(8) > a");
    public String[] GoCategory = {"1", "2", "3", "4", "5", "6", "7", "8"} ;
    public GoCategory(WebDriver driver) {
        this.driver = driver;
    }
    public void getGoToCategory(String category) {
        WebElement element;
         switch (category) {
             case "1":
                 element = driver.findElement(Go_To_Programming);
                 element.click();
                 break;
             case "3":
                 element = driver.findElement(Go_To_Marketing);
                 element.click();
                 break;
             case "4":
                 element = driver.findElement(Go_To_Design);
                 element.click();
                 break;
             case "5":
                 element = driver.findElement(Go_To_Management);
                 element.click();
                 break;
             case "6":
                 element = driver.findElement(Go_To_Business);
                 element.click();
                 break;
             case "7":
                  element = driver.findElement(Go_To_Kids);
                  element.click();
                  break;
             case "8":
                  element = driver.findElement(Go_To_Kids711);
                  element.click();
                  break;
             default:
                 throw new IllegalArgumentException("I don't have such driver");
                    }
    }
}