package CREDIT7;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.remote.Response;
//import org.testng.annotations.Test;
//import io.rest-assured:jar:5.4.0.RestAssured;
//import io.rest-assured.response.Response;
//
//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;

public class LoanHistory {
    public static void main(String[] args) throws InterruptedException {
        String browserName = System.getenv("browser");
        System.out.println(browserName);
        String baseUrl = "https://api7.uashort.agis.work";

//        @Test
//
//        public void testPostRequest () {
//            Response response = RestAssured.given().post(baseUrl).andReturn();
//            assertEquals(response.getStatusCode(), 200);
//        }
//        @Test
//        public void testGetRequest () {
//            Response response = RestAssured.given()
//                    .get(baseUrl)
//                    .andReturn();
//            assertEquals(response.getStatusCode(), 200);
//            assertTrue(response.getTime() <= 250);
//        }
//
//        public void testPutRequest () {
//            Response response = RestAssured.given()
//                    .put(baseUrl)
//                    .andReturn();
//            assertEquals(response.getStatusCode(), 200);
//            assertTrue(response.getTime() <= 250);
//        }
//
//        public void testDeleteRequest () {
//            Response response = RestAssured.given()
//                    .delete(baseUrl)
//                    .andReturn();
//            assertEquals(response.getStatusCode(), 200);
//            assertTrue(response.getTime() <= 250);
//        }
//
//        public void testHeadRequest () {
//            Response response = RestAssured.given()
//                    .head(baseUrl)
//                    .andReturn();
//            assertEquals(response.getStatusCode(), 200);
//            assertTrue(response.getTime() <= 250);
//        }

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

