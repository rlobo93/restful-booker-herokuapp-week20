package restful.booker.herokuapp.testbase;



import io.restassured.RestAssured;
import org.junit.BeforeClass;
import restful.booker.herokuapp.utils.PropertyReader;


public class TestBase {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
    }


}
