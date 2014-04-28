package com.example.listview;

import java.util.ArrayList;
import java.util.List;

public class ContatosInformacion {
	public static List<Contacto> getContactos() {
		List<Contacto> contactos = new ArrayList<Contacto>();
		
		Contacto contactoA = new Contacto();
		contactoA.setName("Camilo Gonzales");
		contactoA.setTelefono("3135898596");
		
		Contacto contactoB = new Contacto();
		contactoB.setName("Julian Felipe Gomez");
		contactoB.setTelefono("3201858592");
		
		Contacto contactoC = new Contacto();
		contactoC.setName("Diana Maria Perez");
		contactoC.setTelefono("3161878533");
		
		Contacto contactoD= new Contacto();
		contactoD.setName("Catalina Martinez");
		contactoD.setTelefono("3101868522");
		
		Contacto contactoE= new Contacto();
		contactoE.setName("Luz Marina Mesa");
		contactoE.setTelefono("3102576212");
		
		contactos.add(contactoA);
		contactos.add(contactoB);
		contactos.add(contactoC);
		contactos.add(contactoD);
		contactos.add(contactoE);
		
		return contactos;
	}
}
