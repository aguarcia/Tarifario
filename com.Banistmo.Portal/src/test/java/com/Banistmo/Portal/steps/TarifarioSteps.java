package com.Banistmo.Portal.steps;

import com.Banistmo.Portal.pageobjects.TarifarioObjects;

import net.thucydides.core.annotations.Step;

public class TarifarioSteps {
	
	TarifarioObjects tarifarioObjects;

	public void IngresarAplicacion() {
		tarifarioObjects.open();
	}

	public void seleccionarTarifario() {
		tarifarioObjects.clickTarifario();
	}

	public void SeleccionarPDF() throws InterruptedException {
		tarifarioObjects.clickPDFCtasDeposito();
	}

}
