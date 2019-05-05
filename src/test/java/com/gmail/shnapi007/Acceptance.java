package com.gmail.shnapi007;

import net.serenitybdd.jbehave.SerenityStories;


public class Acceptance extends SerenityStories {

    public Acceptance() {
        findStoriesCalled("acceptance.story");
    }
}
