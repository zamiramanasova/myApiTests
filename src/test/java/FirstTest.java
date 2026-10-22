import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

@Test
public class FirstTest {

    public void simpleTest() {
        String expectedName = "Zamira";
        String actualName = "Zamira";

        Assert.assertEquals(actualName, expectedName, "Имена не совпадают!");
        System.out.println("Тест прошел успешно!");
    }

    public void checkUserJanet() {
        RestAssured
                .given()
                .relaxedHTTPSValidation() //доверять всем сертификатам
                .baseUri("https://jsonplaceholder.typicode.com") //база
                .when()
                .get("/users/2")//Эндпоинт (как в Charles
                .then()
                .statusCode(200) //Проверяем, что сервер ответил ОК
                .body("username", equalTo("Antonette")); //Проверяем JSON
    }
}
