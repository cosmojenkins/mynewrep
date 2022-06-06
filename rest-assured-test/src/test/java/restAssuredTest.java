import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;
import java.util.Map;
import java.util.Random;

import static io.restassured.RestAssured.given;

public class restAssuredTest {

    @BeforeClass
    public static void prepareData() throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("my.properties"));

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://petstore.swagger.io/v2/")
                .addHeader("api_key", System.getProperty("api.key"))
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
        RestAssured.filters(new ResponseLoggingFilter());
    }

    @Test
    public void postAndGetTest() {
        ORDER order = new ORDER();
        Integer petId = new Random().nextInt(2000);
        order.setId(254169);
        order.setPetId(petId);
        order.setComplete(true);
        order.setQuantity(3);
        order.setStatus("placed");
        order.setShipDate("2022-06-06T18:49:05.457Z");

        given()
                .body(order)
                .when()
                .post("/store/order")
                .then()
                .statusCode(200);

        ORDER actualGet =
                given()
                        .pathParam("orderId", order.getId())
                        .when()
                        .get("/store/order/{orderId}")
                        .then()
                        .statusCode(200)
                        .extract().body()
                        .as(ORDER.class);
        Assert.assertEquals(actualGet.getId(), order.getId());
    }

    @Test
    public void deleteTest() throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("my.properties"));
        given()
                    .pathParam("orderId", System.getProperty("orderId"))
                .when()
                    .delete("/store/order/{orderId}")
                .then()
                    .statusCode(200);

        given()
                .pathParam("orderId", System.getProperty("orderId"))
                .when()
                .get("/store/order/{orderId}")
                .then()
                .statusCode(404);
    }

    @Test
    public void secondGet() {
        Map storeInventory = given()
                .when()
                .get("/store/inventory")
                .then()
                .statusCode(200)
                .extract().body().as(Map.class);
        Assert.assertTrue("Inventory не содержит статус sold", storeInventory.containsKey("sold"));
    }
}

