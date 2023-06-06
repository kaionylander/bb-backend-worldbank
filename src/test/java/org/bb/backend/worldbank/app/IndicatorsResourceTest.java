package org.bb.backend.worldbank.app;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import jakarta.inject.Inject;
import org.bb.backend.worldbank.app.rest.response.IndicatorsResponse;
import org.bb.backend.worldbank.app.service.IIndicatorsService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class IndicatorsResourceTest {

    @Inject
    IIndicatorsService indicatorsService;

    @Test
    public void testGetIndicators() {
        // Mock the service response
        IndicatorsResponse indicatorsResponse = new IndicatorsResponse();

        IIndicatorsService mockIndicatorsService = Mockito.mock(IIndicatorsService.class);
        Mockito.when(mockIndicatorsService.getIndicatorsByCountry(Mockito.anyString()))
                .thenReturn(indicatorsResponse);

        indicatorsService = mockIndicatorsService;

        // Make the REST API call
        given()
                .contentType(ContentType.JSON)
                .queryParam("countryCode", "BR")
                .when()
                .get("/worldbank/indicators")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .response();
    }
}
