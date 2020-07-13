package com.Banistmo.Portal.pageobjects;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class TarifarioObjects extends PageObject {
	
	// Enlace a tarifario
	@FindBy(xpath = "//a[text()='Tarifario']")
	public WebElementFacade lnkTarifario;
	
	// Enlace a pdf de tarifas de Cuentas de Depósito
	@FindBy(xpath = "//span[text()='Tarifas de Cuentas de Depósitos']/../..//img")
	public WebElementFacade lnkPDFCtasDeposito;

	public void clickTarifario() {
		lnkTarifario.waitUntilClickable().and().click();
	}

	public void clickPDFCtasDeposito() throws InterruptedException {
		lnkPDFCtasDeposito.waitUntilEnabled().and().click();
	}
	


}
