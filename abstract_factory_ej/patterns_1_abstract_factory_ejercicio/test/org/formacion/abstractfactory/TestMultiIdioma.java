package org.formacion.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiIdioma {

	@Test
	public void test_es() {
		
		Abstract EspañolFac = Product.fabricia("es");
		
		//implementar Abstract factory
		Preguntas preguntas = EspañolFac.pPreguntas();
		
		assertEquals("Â¿quÃ© hora es?", preguntas.preguntaHora() );
		assertEquals("Â¿quÃ© tiempo hace?", preguntas.preguntaTiempo() );
		//implementar Abstract factor
		Saludos saludos = EspañolFac.pSaludos();
		
		assertEquals("buenos dÃ­as", saludos.buenosDias());
		assertEquals("buenas tardes", saludos.buenasTardes());
	}
	
	@Test
	public void test_en() {
		
		Abstract InglesFac = Product.fabricia("en");
		
		//implementar Abstract factor
		Preguntas preguntas =  InglesFac.pPreguntas();
		
		assertEquals("what time is it?", preguntas.preguntaHora());
		assertEquals("how is the weather?", preguntas.preguntaTiempo());
		
		//implementar Abstract factor
		Saludos saludos = InglesFac.pSaludos();
		
		assertEquals("good morning", saludos.buenosDias());
		assertEquals("good afternoon", saludos.buenasTardes());
	}

}
