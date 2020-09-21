package com.banistmo.stepsdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class HookAuto {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }
}
