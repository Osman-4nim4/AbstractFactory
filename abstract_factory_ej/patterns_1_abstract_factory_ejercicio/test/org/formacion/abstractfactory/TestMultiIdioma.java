package org.formacion.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiIdioma {

	@Test
	public void test_es() {
		
		Abstract Espa�olFac = Product.fabricia("es");
		
		//implementar Abstract factory
		Preguntas preguntas = Espa�olFac.pPreguntas();
		
		assertEquals("¿qué hora es?", preguntas.preguntaHora() );
		assertEquals("¿qué tiempo hace?", preguntas.preguntaTiempo() );
		//implementar Abstract factor
		Saludos saludos = Espa�olFac.pSaludos();
		
		assertEquals("buenos días", saludos.buenosDias());
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
