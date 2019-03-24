package com.gmail.shnapi007.steps;

import com.gamil.shnapi007.pages.GooglePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class GoogleSteps extends ScenarioSteps {

  GooglePage page;

  public GoogleSteps(Pages pages) {
    super(pages);
  }

  @Step

  public void openPage() {
    page.open();

  }

  @Step

  public void searchForKeyword(String keyword) {
    page.search(keyword.toLowerCase());
  }

  @Step

  public boolean findInResults(String keyword) {
    return page.getSearchResult()
        .stream()
        .allMatch(sr -> sr.contains(keyword));

  }
}
