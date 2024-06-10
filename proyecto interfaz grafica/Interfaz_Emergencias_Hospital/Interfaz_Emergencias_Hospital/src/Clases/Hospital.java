package Clases;
import java.util.Scanner;

public class Hospital {
	String nombreHos,direccion;
	int telefono;
	LS_NormalPlanta planta = new LS_NormalPlanta();
	public Hospital() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public Hospital(String nombreHos, String direccion, int telefono, LS_NormalPlanta planta) {
		super();
		this.nombreHos = nombreHos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.planta = planta;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro Nombre Hospital");
		nombreHos=sc.next();
		System.out.println("Intro Direccion: ");
		direccion=sc.next();
		System.out.println("Intro Telefono: ");
		telefono=sc.nextInt();
		System.out.println("\tIntroduce cantidad de plantas del Hospital");
		int canPla=sc.nextInt();
		planta.llenar1(canPla);
	}
	void mostrar() {
		System.out.println("NOMBRE HOSPITAL: "+nombreHos);
		System.out.println("DIRECCION: "+direccion);
		System.out.println("TELEFONO: "+telefono);
		planta.mostrar();
	}
	public String getNombreHos() {
		return nombreHos;
	}
	public void setNombreHos(String nombreHos) {
		this.nombreHos = nombreHos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public LS_NormalPlanta getPlanta() {
		return planta;
	}
	public void setPlanta(LS_NormalPlanta planta) {
		this.planta = planta;
	}
	
}
