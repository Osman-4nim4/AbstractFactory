package org.formacion.abstractfactory;

public class Product {

	public static Abstract fabricia(String idioma) {
		if(idioma =="es") {
			return new Espa�olFac();
		}
		else if(idioma == "en") {
			return new InglesFac();
		}
		else {
			return null;
		}
	}
}
