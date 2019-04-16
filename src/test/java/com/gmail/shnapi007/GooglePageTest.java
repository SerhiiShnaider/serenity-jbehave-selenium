package com.gmail.shnapi007;

import com.gmail.shnapi007.steps.GoogleSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.springframework.util.Assert;

public class GooglePageTest {

  @Steps
  GoogleSteps gs;

  @Given("Accesses the google page")
  public void create() {
    gs.openPage();
  }

  @When("When they type in $keyword")
  public void getRez(String keyword) {
    gs.searchForKeyword(keyword);
  }

  @Then("We should see $keyword")
  public void validate(String keyword) {
    Assert.isTrue(gs.findInResults(keyword), keyword + " is absent");
  }
}
