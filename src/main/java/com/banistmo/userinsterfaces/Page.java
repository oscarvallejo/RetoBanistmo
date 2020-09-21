package com.banistmo.userinsterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.latam.com/")
public class Page extends PageObject {
    public static final Target ALERT_MESSAGE = Target.the("Alert Message").locatedBy("id:onesignal-slidedown-cancel-button");
    public static final Target COMPRAR_VUELO = Target.the("Comprar Vuelo").locatedBy("id:compra-select-origin");
    public static final Target MENU_MIS_VIAJES = Target.the("Menu Mis Viajes").locatedBy("//p[contains(text(),'Mis viajes')]");
    public static final Target VINCULO_CODIGO_RESERVA = Target.the("Vinculo Codigo Reserva").locatedBy("//span[contains(text(),'{0}')]");
    public static final Target BUSCAR_CODIGO_RESERVA = Target.the("Codigo Reserva").locatedBy("//span[contains(@class , 'record-locator') and contains(text(),'{0}')]");

}
