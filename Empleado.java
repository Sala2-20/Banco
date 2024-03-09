package Banco;

public class Empleado {
	private String cod_emp;
	private String nombre;
	
	public Empleado() {
		
	}
	
	public void crearEmpleado(String cod_emp, String nombre) {
		this.nombre = nombre;
		this.cod_emp = cod_emp;
	}
	
	public String verEmpleado() {
		return "El empleado " + this.cod_emp + " se llama " + this.nombre;
	}
}
