package org.homework;

import io.restassured.http.ContentType;
import org.homework.model.Pax;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiTest {

    @Test
    void firstTest() {
        String firstUrl = "https://cdn.optimizely.com/datafiles/73ANu7N6D94s8inWeguwy.json";

//        Pax response= given()
                given()
                .accept(ContentType.JSON)
                .when()
                .get(firstUrl)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200);
//                .extract()
//                .response()
//                .as(Pax.class);

//        assertEquals("4", response.getVersion());
    }

    @Test
    void versionTest() {
        String firstUrl = "https://cdn.optimizely.com/datafiles/73ANu7N6D94s8inWeguwy.json";

                Pax response = given()
                .accept(ContentType.JSON)
                .when()
                .get(firstUrl)
                .then()
                       .statusCode(200)
                        .contentType(ContentType.JSON)
                                .extract()
                                        .response()
                                                .as(Pax.class);

        assertEquals("11701662245", response.getAccountId());
    }
}
