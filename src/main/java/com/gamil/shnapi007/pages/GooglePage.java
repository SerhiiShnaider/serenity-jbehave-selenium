package com.gamil.shnapi007.pages;

import java.util.List;
import java.util.stream.Collectors;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl("http://google.com")
public class GooglePage extends PageObject {

  @FindBy(how = How.NAME, using = "q")
  WebElementFacade q;

  @FindBy(how = How.CLASS_NAME, using = "srg")
  List<WebElementFacade> searchResults;


  @WhenPageOpens
  public void pageLoadWait() {
    System.out.println("Waiting");
    try {
      q.waitUntilVisible();
    } catch (Exception e) {
      System.out.println("Page is not load");
    }
  }

  public void search(String keyword) {
    q.typeAndEnter(keyword);
  }

  public List<String> getSearchResult() {
    return searchResults.stream()
        .map(sr -> sr.getText())
        .collect(Collectors.toList());
  }
}
