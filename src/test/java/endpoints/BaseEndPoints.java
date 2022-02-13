package endpoints;

import env.ApplicationProperties;
import env.Environment;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.SearchingByString;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.runner.Request;
import org.openqa.grid.web.servlet.handler.RequestType;

import java.util.Arrays;
import java.util.List;

public class BaseEndPoints {
    ApplicationProperties appProps = Environment.INSTANCE.getApplicationProperties();


    public String getAuthorizationToken() {
        return appProps.getPropertyValue("token");
    }

    /**
     * common specification for request
     */
    public RequestSpecification getCommonSpec() {
        RequestSpecification rSpec = SerenityRest.given();
        rSpec.contentType(ContentType.JSON).baseUri(appProps.getBaseURL());
        return rSpec;
    }

    /**
     * Convert POJO to JSON
     */
    protected JSONObject createJSONPayload(Object pojo) {
        return new JSONObject(pojo);
    }


    /**
     * Verify that the response code is the same as expected code by comparing the
     * provided expected code and the response code from the response received by
     * sending the request
     */
    public void verifyResponseStatusCode(Response response, int expectedCode) {
        Assert.assertEquals(response.getStatusCode(), expectedCode);
    }


    public Response callEndpointHttpMethodGet() {
        Response response = SerenityRest.given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .get(appProps.getBaseURL());
        return response;

    }
}
//   public int totalAmountofpages(){
//      String s=  SerenityRest.given()
//               .contentType("application/json")
//               .header("Content-Type", "application/json")
//               .get(appProps.getBaseURL()).jsonPath().get("totalResponses");
//
//      return Integer.parseInt(s/5);//11
//
//   }

//    public List<SearchingByString> callEndpointHttpMethodByString(String value) {
//     Response response;
//     int i =0;
//        while (response.notNull)
//       List<SearchingByString> dd= dd.addAll(SerenityRest.given()
//                .contentType("application/json")
//                .header("Content-Type", "application/json")
//                .queryParam("s",value)
//                .queryParam("page",i)
//                .get(appProps.getBaseURL()));
//   i++;
//
//    }




