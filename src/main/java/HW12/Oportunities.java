package HW12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Oportunities extends TestingCoursePage{
   // protected WebDriver driver;
    private static final By List_Oportunities = By.className("opportunities_list");
    public Oportunities(WebDriver driver) {
      //this.driver = driver
       // super(driver) = driver;
    }
//    public Oportunities() {}

    public void getOportunities() {
        List<WebElement> opportunityList = driver.findElements(List_Oportunities);
        opportunityList.stream().map(WebElement :: getText).forEach(System.out::println);
    }
}

