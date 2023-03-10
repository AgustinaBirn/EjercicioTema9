package ejercicioTema9;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setEdad(30);
		System.out.println(cliente.getEdad());
		cliente.setNombre("Agustina");
		System.out.println(cliente.getNombre());
		cliente.setTelefono(33224455);
		System.out.println(cliente.getTelefono());
		cliente.setCredito(50000);
		System.out.println(cliente.getCredito());
		
		Trabajador trabajador = new Trabajador();
		trabajador.setEdad(50);
		System.out.println(trabajador.getEdad());
		trabajador.setNombre("Facundo");
		System.out.println(trabajador.getNombre());
		trabajador.setTelefono(66887799);
		System.out.println(trabajador.getTelefono());
		trabajador.setSalario(90000);
		System.out.println(trabajador.getSalario());
	}
}

abstract class Persona{
	int edad;
	String nombre;
	int telefono;
	
	public Persona() {
	}
	
		abstract public String getEdad();
		abstract public void setEdad(int edad);
		abstract public String getNombre();
		abstract public void setNombre(String nombre);
		abstract public String getTelefono();
		abstract public void setTelefono(int telefono);
	}

class Cliente extends Persona{
	int credito;
	
	public String getCredito() {
		return "credito de cliente: " + this.credito;
	}
	public void setCredito(int credito) {
		this.credito = credito;
	}
	public String getEdad() {
		return "edad de cliente: " + this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return "nombre de cliente: " + this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return "telefono de cliente: " + this.telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
class Trabajador extends Persona{
	int salario;
	
	public String getSalario() {
		return "salario del trabajador: " + this.salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String getEdad() {
		return "edad de trabajador: " + this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return "nombre de trabajador: " + this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return "telefono de trabajador: " + this.telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}