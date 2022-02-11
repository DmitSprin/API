package reqBuilder;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utils.UserCredentials;

public class RequestBuilder {

    private static RequestSpecification requestSpecification;

    private static String baseUrl = "https://api.spotify.com/v1/";

    public static RequestSpecification getReqSpec() {
        return requestSpecification = new RequestSpecBuilder().
                setBaseUri(baseUrl)
                .setContentType(ContentType.JSON)
                .log(LogDetail.BODY)
                .addHeader("Authorization","Bearer "+UserCredentials.getToken())
                .build();
    }
}