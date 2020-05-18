package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}


public class Stepdefs {
    private String today;
    private String actualAnswer;

    @Given("today is Sunday")
    public void today_is_Sunday() {
        today = "Sunday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        // Write code here that turns the phrase above into concrete actions
        actualAnswer = IsItFriday.isItFriday(today);
        //System.out.println("working");
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void I_should_be_bold(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Given("today is Friday")
    public void today_is_Friday(){
        today = "Friday";
    }
}
