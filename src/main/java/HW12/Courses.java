package HW12;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class Courses {
protected WebDriver driver;
    private static final By Course_Categories = By.className("categories_item");
    public Courses(WebDriver driverList) {
       this.driver = driverList;
    }
    public Courses() {}

    public void getCourses() {
        List<WebElement> category = driver.findElements(Course_Categories);
       category.stream().map(WebElement :: getText).forEach(System.out::println);
       }
}
