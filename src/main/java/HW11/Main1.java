package HW11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
//        Заходить на сайт https://ithillel.ua/
//        Обирає курс Програмування -> Курс Front-End Basic
//        Збирає та виводит в консоль імена викладачів
        String browserName = System.getenv("browser");
        System.out.println(browserName);

        RemoteWebDriver browser = getDriver(args[0]);
        browser.get("https://ithillel.ua/");
        Thread.sleep(1000);

       // browser.manage().window().maximize();
        System.out.println(browser.getTitle());

        WebElement courseMenu = browser.findElement(By.cssSelector("button.site-nav-btn[data-dropdown-trigger=\"coursesMenu\"]"));
        courseMenu.click();

        WebElement courseFront = browser.findElement(By.cssSelector("#body > div.site-wrapper > main > section.section.-courses.-sprints > div > div > div.courses-section_recommendations > div > ul > li:nth-child(2)\n"));
        courseFront.click();
        Thread.sleep(1000);

        //#coachesContainer
        WebElement coachFront = browser.findElement(By.id("coachesContainer"));
        // Найдите элемент, к которому хотите проскроллить
        ((JavascriptExecutor) browser).executeScript("arguments[0].scrollIntoView(true);", coachFront);
        System.out.println(browser.getTitle());


        List<WebElement> coaches = browser.findElements(By.className("coach-card_name"));
        coaches.stream().map(WebElement :: getText).forEach(System.out::println);
//        Set<String> coacheValues = new HashSet<>();
//        for(WebElement coach : coaches){
//        String text = coach.getText();
//        if (!coacheValues.add(text)) {
//        System.out.println("Викладачі та ментори спринту: " + text);
//        }
 //   }
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

