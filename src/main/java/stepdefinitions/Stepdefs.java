package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefs {

    @Given("today is Sunday")
    public void today_is_Sunday() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Yep this is working");
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("working");
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void shouldBeTold(String arg0){
        System.out.println("test");
    }
}
