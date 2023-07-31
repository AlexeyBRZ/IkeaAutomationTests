package org.homework;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.homework.model.LibVersion;
import org.homework.model.LocalizationService;
import org.homework.model.SimpleCeiling;
import org.homework.model.accountId.Pax;
import org.homework.model.plannerShortDescription.Ceiling;
import org.homework.model.plannerShortDescription.Floor;
import org.homework.model.plannerShortDescription.Wall;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiTest {

    @BeforeAll
    static void setUp() {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    @Test //работает
    @Execution(ExecutionMode.CONCURRENT)
    void firstTest() {
        String firstUrl = "https://cdn.optimizely.com/datafiles/73ANu7N6D94s8inWeguwy.json";

        given()
                .accept(ContentType.JSON)
                .when()
                .get(firstUrl)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200);
    }

    @Test//работает
    @Execution(ExecutionMode.CONCURRENT)
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

    @Test//работает
    @Execution(ExecutionMode.CONCURRENT)
    void shortDescriptionOfWallTest() {
        Wall response = given()
                .accept(ContentType.JSON)
                .when()
                .get("https://productoffering-prod.2020-platform.com/API2/Catalogs/3NOAz_Dx8vM/Locales/ru-LV/Products/Common.Structural.Wall")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .response()
                .as(Wall.class);

        assertEquals("Стена", response.getShortDescription());
    }

    @Test// работает
    @Execution(ExecutionMode.CONCURRENT)
    void simpleCeilingTest() {
        String url = "\n" +
                "https://productoffering-prod.2020-platform.com/API2/Catalogs/3NOAz_Dx8vM/Locales/ru-LV/Products/Common.Structural.Ceiling/Features";

        List<SimpleCeiling> response = given()
                .accept(ContentType.JSON)
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .response()
                .as(new TypeRef<>() {
                });

        assertEquals("Потолок", response.get(0).getDescription());
    }

    @Test//работает
    @Execution(ExecutionMode.CONCURRENT)
    void shortDescriptionOfCeilingTest() {
        String url = "https://productoffering-prod.2020-platform.com/API2/Catalogs/3NOAz_Dx8vM/Locales/ru-LV/Products/Common.Structural.Ceiling";

        Ceiling response = given()
                .accept(ContentType.JSON)
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .response()
                .as(Ceiling.class);

        assertEquals("Интерьер", response.getDescription());
    }

    @Test //работает
    @Execution(ExecutionMode.CONCURRENT)
    void shortDescriptionOfFloorTest() {
        String url = "https://productoffering-prod.2020-platform.com/API2/Catalogs/3NOAz_Dx8vM/Locales/ru-LV/Products/Common.Structural.Floor";

        Floor response = given()
                .accept(ContentType.JSON)
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .response()
                .as(Floor.class);

        assertEquals("Пол", response.getShortDescription());
    }

    @Test//работает
    @Execution(ExecutionMode.CONCURRENT)
    void libNameTest() {
        String url = "https://isapi-prod.2020-platform.com/environment.json";

        LibVersion response = given()
                .accept(ContentType.JSON)
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .response()
                .as(LibVersion.class);

        assertEquals("ISAPI", response.getLibName());
    }

    @Test//работает
    @Execution(ExecutionMode.CONCURRENT)
    void localizationServiceLinkTEst() {
        String url = "https://idealspacescore-prod.2020-platform.com/components.json";

        LocalizationService response = given()
                .accept(ContentType.JSON)
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .response()
                .as(LocalizationService.class);

        assertEquals("https://localizationservice-prod.2020-platform.com", response.getBackofficeUrls().getLocalizationservice());
    }
}