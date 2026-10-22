import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class FirstTest {

    public void simpleTest() {
        String expectedName = "Zamira";
        String actualName = "Zamira";

        Assert.assertEquals(actualName, expectedName, "Имена не совпадают!");
        System.out.println("Тест прошел успешно!");
    }
}
