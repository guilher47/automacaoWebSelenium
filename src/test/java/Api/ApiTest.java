package Api;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;

public class ApiTest {

    @Test
     public void testeConsultaProduto(){

        given().param("name", "game of thrones")
                .param("quantityPerEachCategory", "2")
                .when().baseUri("https://www.advantageonlineshopping.com/catalog/api/v1/products/search")
                .then().statusCode(200)
                .body("products[0].productId", is("85"));
    }

}
