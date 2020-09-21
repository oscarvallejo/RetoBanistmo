package com.banistmo.tasks;

import com.banistmo.userinsterfaces.Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class BuscarCodigo implements Task {
    private final String codigo;

    public BuscarCodigo(String codigo) {
        this.codigo = codigo;
    }

    public static Performable nombre(String codigo) {
        return Tasks.instrumented(BuscarCodigo.class, codigo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(Page.VINCULO_CODIGO_RESERVA.of(codigo), WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(Click.on(Page.VINCULO_CODIGO_RESERVA.of(codigo)));

    }
}
