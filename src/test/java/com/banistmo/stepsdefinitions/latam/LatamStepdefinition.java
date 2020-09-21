package com.banistmo.stepsdefinitions.latam;

import com.banistmo.exceptions.ExceptionError;
import com.banistmo.questions.LongitudEsperada;
import com.banistmo.tasks.AbrirPagina;
import com.banistmo.tasks.BuscarCodigo;
import com.banistmo.utilities.MsgError;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class LatamStepdefinition {


    @Dado("que el {word} quiere ingresar a la pagina {string}")
    public void quieroIngresarALaPagina(String cliente, String url) {
        theActorCalled(cliente).attemptsTo(AbrirPagina.sitio());

    }

    @Cuando("doy click en el vinculo {string}")
    public void doyClickEnElVinculo(String nombre) {
        theActorInTheSpotlight().attemptsTo(BuscarCodigo.nombre(nombre));

    }

    @Entonces("verifico que el codigo {string} sea de {int} cifras")
    public void verificoQueElCodigoSeaDeCifras(String codigo, Integer cifas) {
        theActorInTheSpotlight().should(seeThat(LongitudEsperada.codigoReserva(codigo), is(cifas))
                .orComplainWith(ExceptionError.class, MsgError.MSG_VALUE_ERROR.getMsg()));

    }
}
