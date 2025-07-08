
package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

public class UserApiSteps {
    private Response response;

    @When("I send a GET request to {string}")
    public void i_send_a_get_request_to(String endpoint) {
        response = RestAssured.get("https://jsonplaceholder.typicode.com" + endpoint);
    }

    @When("I send a POST request to {string} with body")
    public void i_send_a_post_request_to_with_body(String endpoint, String body) {
        response = RestAssured.given().header("Content-Type", "application/json").body(body)
                .post("https://jsonplaceholder.typicode.com" + endpoint);
    }

    @When("I send a PUT request to {string} with body")
    public void i_send_a_put_request_to_with_body(String endpoint, String body) {
        response = RestAssured.given().header("Content-Type", "application/json").body(body)
                .put("https://jsonplaceholder.typicode.com" + endpoint);
    }

    @When("I send a PATCH request to {string} with body")
    public void i_send_a_patch_request_to_with_body(String endpoint, String body) {
        response = RestAssured.given().header("Content-Type", "application/json").body(body)
                .patch("https://jsonplaceholder.typicode.com" + endpoint);
    }

    @When("I send a DELETE request to {string}")
    public void i_send_a_delete_request_to(String endpoint) {
        response = RestAssured.delete("https://jsonplaceholder.typicode.com" + endpoint);
    }

    @Then("the response status should be {int}")
    public void the_response_status_should_be(int statusCode) {
        response.then().statusCode(statusCode);
    }
}
