import java.util.Scanner;

public class Medicamento {
	private
	String nombre,indicaciones;
	int dosis;
	public Medicamento() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public Medicamento(String nombre,int dosis, String indicaciones ) {
		super();
		this.nombre = nombre;
		this.dosis = dosis;
		this.indicaciones = indicaciones;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nombre del medicamento: ");
		nombre=sc.next();
		System.out.println("Intro dosisis: ");
		dosis=sc.nextInt();
		System.out.println("Inttroduce las indicaciones: ");
		indicaciones=sc.next();
	}
	void mostrar() {
		System.out.println("NOMBRE MEDICAMENTO : "+nombre);
		System.out.println("DOSIS: "+dosis);
		System.out.println("INDICACIONES : "+indicaciones);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIndicaciones() {
		return indicaciones;
	}
	public void setIndicaciones(String indicaciones) {
		this.indicaciones = indicaciones;
	}
	public int getDosis() {
		return dosis;
	}
	public void setDosis(int dosis) {
		this.dosis = dosis;
	}
	
	
}
