package com.example.dynamicui.model;

public class Contacto {
	String nombre;
	String telefono;
	String dirreccion;
	int edad;

	public Contacto(String nombre, String telefono, String direccion, int edad)
	{
		this.nombre = nombre;
		this.telefono = telefono;
		this.dirreccion = direccion;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDirreccion() {
		return dirreccion;
	}

	public void setDirreccion(String dirreccion) {
		this.dirreccion = dirreccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
