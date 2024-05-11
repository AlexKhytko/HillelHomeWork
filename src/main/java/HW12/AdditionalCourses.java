package HW12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AdditionalCourses {
    protected WebDriver driver;
    private static final By Additional_Courses = By.className("block-profession_list");
    public AdditionalCourses(WebDriver driverList) {
        this.driver = driverList;
    }

    public void getAdditionalCourses() {
        List<WebElement> blockProfession = driver.findElements(Additional_Courses);
        blockProfession.stream().map(WebElement :: getText).forEach(System.out::println);
    }
}


