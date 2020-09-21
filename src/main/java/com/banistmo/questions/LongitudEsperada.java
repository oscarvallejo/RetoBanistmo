package com.banistmo.questions;

import com.banistmo.userinsterfaces.Page;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LongitudEsperada implements Question<Integer> {

    private String codigo;

    public LongitudEsperada(String codigo) {
        this.codigo = codigo;
    }

    public static Question<Integer> codigoReserva(String codigo) {
        return new LongitudEsperada(codigo);
    }

    @Override
    public Integer answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(Page.BUSCAR_CODIGO_RESERVA.of(codigo), WebElementStateMatchers.isCurrentlyVisible()).forNoMoreThan(100).seconds());
        WebElementFacade webElementFacade = Page.BUSCAR_CODIGO_RESERVA.of(codigo).resolveFor(actor);
        String codigoReserva = webElementFacade.getText().replace(".", "");
        return codigoReserva.length();
    }
}
