package org.formacion.abstractfactory;

public class EspañolFac implements Abstract{
	@Override
	public Saludos pSaludos() {
		return new SaludosEn();
		
	}
	@Override
	public Preguntas pPreguntas() {
		return new PreguntasEn();
	}

}
