package Banco;

public class Cliente {
private String nombre;
private String cod_cliente;
private int edad;
public Cliente(String cod_cliente, String nombre, int edad) {
	this.crearCliente(cod_cliente, nombre, edad);
}

public void crearCliente(String cod_cliente, String nombre, int edad) {
	this.nombre = nombre;
	this.cod_cliente = cod_cliente;
	this.edad = edad;
}
public String getCodigo() {
	return cod_cliente;
}
public String verCliente() {
	return "El nombre del cliente es " + this.nombre + " su codigo es " + this.cod_cliente + " tiene una edad de " + this.edad + " años";
}
}
