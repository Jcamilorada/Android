package com.example.dynamicui.model;

import java.util.ArrayList;
import java.util.List;

public class ContactosInformacion {
	private static List<Contacto> contactos;

	public static List<Contacto> getContactos() {
		if (contactos == null) {
			contactos = new ArrayList<>();
			contactos.add(new Contacto("Contacto 1", "3302559", "cra 65 # 9 -80", 23));
			contactos.add(new Contacto("Contacto 2", "3152695", "calle 12 # 2 -10", 42));
			contactos.add(new Contacto("Contacto 3", "6658932", "cra 24 # 9 -80", 14));
			contactos.add(new Contacto("Contacto 4", "2203596", "cra 15 # 9 -80", 17));
			contactos.add(new Contacto("Contacto 5", "8963542", "cra 15 # 9 -80", 42));
			contactos.add(new Contacto("Contacto 6", "4528936", "calle 5 # 3 -10", 30));
			contactos.add(new Contacto("Contacto 7", "3245869", "calle 11 # 9 -10", 60));
		}

		return contactos;

	}

}
