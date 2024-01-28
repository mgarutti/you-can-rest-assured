package services;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import config.APIConfigs;
import static io.restassured.RestAssured.given;

public class ProductService {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = APIConfigs.FakeSore.BASE_URL;
    }

    @Test
    public void Get_all_products_happy_path() {
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get(APIConfigs.FakeStoreEndpoints.PRODUCTS_ENDPOINT)
                .then()
                .extract().response();
        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertNotEquals(null, response.body());
    }

}
