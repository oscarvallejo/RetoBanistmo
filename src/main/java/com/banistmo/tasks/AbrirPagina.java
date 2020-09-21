package com.banistmo.tasks;

import com.banistmo.userinsterfaces.Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class AbrirPagina implements Task {
    private Page homePage;

    public static Performable sitio() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(homePage));
        WaitUntil.the(Page.ALERT_MESSAGE, WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(10).seconds();
        actor.attemptsTo(Click.on(Page.ALERT_MESSAGE));
        WaitUntil.the(Page.MENU_MIS_VIAJES, WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(10).seconds();
        actor.attemptsTo(Click.on(Page.MENU_MIS_VIAJES));
    }
}
