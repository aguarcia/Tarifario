package com.Banistmo.Portal.definition;

import com.Banistmo.Portal.steps.TarifarioSteps;

import cucumber.api.PendingException;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class TarifarioDefinition {
	
	@Steps
	TarifarioSteps tarifarioSteps;
	
	    
	    
	    @Dado("^que ingreso al Portal de Banistmo$")
	    public void que_ingreso_al_Portal_de_Banistmo() throws Exception {
	    	tarifarioSteps.IngresarAplicacion();
	    
	    }

	    @Cuando("^me encuentro en la opcion de tarifario$")
	    public void me_encuentro_en_la_opcion_de_tarifario() throws Exception {
	        tarifarioSteps.seleccionarTarifario();
	        
	    }

	    @Entonces("^descargo la informacion en pdf$")
	    public void descargo_la_informacion_en_pdf() throws Exception {
	       tarifarioSteps.SeleccionarPDF();
	       Thread.sleep(3000);
	    }
	    


}
