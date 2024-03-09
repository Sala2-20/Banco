package Banco;

public class MainBanco {
	public static void main(String []args) {
		boolean exit= false;/*Lo usaremos para salir del menu*/
		/*Creamos los objetos y algunos los inicializamos*/
		Empleado empleado= new Empleado(1234,"Jorge Atienza");
		Cliente cliente =new Cliente("Hernan Cortes","HOLA",23);
		Cuenta cuenta;
		do {/*Creamos los menus para seleccionar que hacer */
			GestorIO gestorIO= new GestorIO();
			gestorIO.out("1.Crear cuenta");gestorIO.out("2.Borrar cuenta");gestorIO.out("3.Realizar movimiento de dinero o gestionar cuenta");gestorIO.out("4.Salir");
			int aux=gestorIO.inInt();
			if(aux==1) {
				gestorIO.out("Contraseña");String contrasena=gestorIO.inString();
				cuenta= new Cuenta(cliente.getCodigo,contrasena, 0);
			}else if(aux==2) {
				cuenta = new Cuenta();
			}else if(aux==3) {/*Creo un submenu por comodidad*/
				boolean exitSubmenu=false;
				do {
					gestorIO.out("1.Sacar diero");gestorIO.out("2.Ingresar dinero");gestorIO.out("3.Consultar cuenta");gestorIO.out("4.Salir");
					int aux1=gestorIO.inInt();
					if(aux1==1) {
						gestorIO.out("¿Cuanto quieres sacar?");
						cuenta.sacar(gestorIO.inDouble());
					}else if(aux1==2) {
						gestorIO.out("¿Cuanto quieres ingresar?");
						cuenta.ingresar(gestorIO.inDouble());
					}else if(aux==3) {
						cuenta.verCuenta();
					}else if(aux==4) {
						exitSubmenu=true;
					}else {
						gestorIO.out("Error");
					}
				}while(exitSubmenu);
			}else if(aux==4){
				exit=true;
			}else {
				gestorIO.out("Error");
			}
		}while(exit);
	}

}
