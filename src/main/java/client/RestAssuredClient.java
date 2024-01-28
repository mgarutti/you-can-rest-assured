package client;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public abstract class RestAssuredClient {
    String baseUrl;

    public RestAssuredClient (String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Response get(String path) {
        RequestSpecification httpRequest = RestAssured.given()
                .log()
                .all(true);
        httpRequest.baseUri(baseUrl);
        httpRequest.header("Content-Type", "application/json");
        return httpRequest.get(path);
    }


}
