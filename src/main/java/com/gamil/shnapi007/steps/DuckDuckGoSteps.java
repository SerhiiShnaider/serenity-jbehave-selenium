package com.gamil.shnapi007.steps;

import com.gamil.shnapi007.pages.DuckDuckGoPage;
import net.thucydides.core.annotations.Step;

public class DuckDuckGoSteps {

  DuckDuckGoPage page;

  @Step
  public void openPage() {
    page.open();
  }

  @Step
  public String getTitle() {
   return page.getTitle();
  }
}
