package Banco;

public class Cuenta {
	private String cod_cliente;
	private String contraseña_cuenta;
	private double saldo;
	
	//constructor
	public Cuenta(String cod_cliente, String contraseña_cuenta, double saldo) {
		this.cod_cliente = cod_cliente;
		this.contraseña_cuenta = contraseña_cuenta;
		this.saldo = saldo;
	}
	public Cuenta() {
		
	}
	//metodos
	public void ingresar(double dinero) {
		saldo += dinero;
	}
	public void sacar(double dinero) {
		double total = this.saldo-dinero;
		if(total<0) {
			System.out.print("Error");
		}else {
			saldo -=dinero;
		}
	}
	public void verCuenta() {
		System.out.print("La cuennta tiene " + saldo);
	}

}