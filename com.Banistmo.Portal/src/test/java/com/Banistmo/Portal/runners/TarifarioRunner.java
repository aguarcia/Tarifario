package com.Banistmo.Portal.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@CucumberOptions(plugin = { "html:target/cucumber-html-report","json:target/cucumber.json" }, 
features = "src/test/resources/features/Tarifario.feature", 
glue = {"com.Banistmo.Portal.definition"},
tags = {"@DescargarPDF"})

@RunWith(CucumberWithSerenity.class)
public class TarifarioRunner {
}
