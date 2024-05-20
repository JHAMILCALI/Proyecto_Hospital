import java.util.Scanner;

public class Enfermera {
	private
	String nombre,turno;
	public Enfermera() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public Enfermera(String nombre, String turno) {
		super();
		this.nombre = nombre;
		this.turno = turno;
	}
	void leer() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nombre: ");
		nombre=sc.next();
		System.out.println("Intro turno: ");
		turno=sc.next();
	}
	void mostrar() { 
		System.out.println("NOMBRE: "+nombre);
		System.out.println("TURNO: "+turno);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
}
