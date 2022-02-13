package steps;

import endpoints.BaseEndPoints;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import model.SearchingByString;
import org.junit.Assert;

import java.util.List;
import java.util.Optional;

public class SearchingSteps {


    BaseEndPoints bas = new BaseEndPoints();
    Response response;
    List<SearchingByString> searchingByString;
    @When("I create a POST request")
    public void i_create_a_POST_request() {
response= bas.callEndpointHttpMethodGet();
        System.out.println(response.prettyPrint());
//      searchingByString=  bas.callEndpointHttpMethodByString("stem");
    }

    @Then("I see response has {int} status code")
    public void i_see_response_has_status_code(Integer code) {
        System.out.println(response.getStatusCode()+ "xuy");
        Assert.assertEquals(response.getStatusCode(),200);

    }

    @Then("I verify that response contains at least {int} items")
    public void i_verify_that_response_contains_at_least_items(Integer int1) {
   String s= response.jsonPath().get("totalResults");
        System.out.println(s);
    }

//    @Then("I verify that response contains following {string}")
//    public void i_verify_that_response_contains_following(String string, io.cucumber.datatable.DataTable dataTable) {
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//        // Double, Byte, Short, Long, BigInteger or BigDecimal.
//        //
//        // For other transformations you can register a DataTableType.
//        throw new cucumber.api.PendingException();
//    }
}
