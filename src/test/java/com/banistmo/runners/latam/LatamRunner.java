package com.banistmo.runners.latam;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.banistmo.stepsdefinitions",
        features = "src/test/resources/features/latam/codigo_reserva.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)
public class LatamRunner {
}
