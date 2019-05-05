package com.gmail.shnapi007.jbehave;

import com.gamil.shnapi007.steps.DuckDuckGoSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.springframework.util.Assert;

public class DuckDuckGoPageStepDefinitions {

  @Steps
  DuckDuckGoSteps gs;

  @Given("Accesses the DuckDuckGo page")
  public void create() {
    gs.openPage();
  }

  @Then("We should see DuckDuckGo in title")
  public void validate() {

    Assert.isTrue(gs.getTitle().contains("DuckDuckGo")," is absent");
  }

}
