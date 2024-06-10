package Clases;
import java.util.Scanner;

public class Cama {
	private
	String disponible,IDCama,IDOcupante;
	public Cama() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public Cama(String disponible, String iDCama, String iDOcupante) {
		super();
		this.disponible = disponible;
		IDCama = iDCama;
		IDOcupante = iDOcupante;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro Dispodibilidad: [si] [no]");
		disponible=sc.next();
		System.out.println("Intro ID Cama: ");
		IDCama=sc.next();
		System.out.println("Intro ID OCupante:  de no existir [0]");
		IDOcupante=sc.next();
	}
	void mostrar() {
		System.out.println("DISPONIBLE: "+disponible);
		System.out.println("ID CAMA: "+IDCama);
		System.out.println("ID OCUPANTE: "+IDOcupante);
	}
	public String getDisponible() {
		return disponible;
	}
	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}
	public String getIDCama() {
		return IDCama;
	}
	public void setIDCama(String iDCama) {
		IDCama = iDCama;
	}
	public String getIDOcupante() {
		return IDOcupante;
	}
	public void setIDOcupante(String iDOcupante) {
		IDOcupante = iDOcupante;
	}
	
}
