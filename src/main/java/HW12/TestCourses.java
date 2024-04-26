package HW12;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.ArrayList;
import static java.sql.DriverManager.getDriver;
import org.openqa.selenium.WebElement;
public class TestCourses {
//    Описати Page Object сторінки https://ithillel.ua/courses/testing та реалізацію методів:
//    getCourses() - список курсів
//    getAdditionalCourses() - список додаткових курсів
//    getOportunities() - "Чому варто стати ..."
//    goToCategory(String category) - перейти на іншу категорію курсів ("Програмування", "Менеджмент", "Маркетинг" і т.д.)
//    Задачу реалізувати використовуючи бібліотеку Selenium.

    public static void main(String[] args) throws InterruptedException {
//        String browserName = System.getenv("browser");
//        System.out.println(browserName);

        RemoteWebDriver browser = getDriver(args[0]);
        browser.get("https://ithillel.ua/courses/testing");
        Thread.sleep(1000);


        Courses category = new Courses(browser);
        category.getCourses();

        AdditionalCourses blockProfession = new AdditionalCourses(browser);
        blockProfession.getAdditionalCourses();

        Oportunities opportunityList = new Oportunities(browser);
        opportunityList.getOportunities();

        GoCategory goCategory = new GoCategory(browser);
        goCategory.getGoToCategory(String.valueOf(1));
        goCategory.getGoToCategory(String.valueOf(3));
        goCategory.getGoToCategory(String.valueOf(4));
        goCategory.getGoToCategory(String.valueOf(5));
        goCategory.getGoToCategory(String.valueOf(6));
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
