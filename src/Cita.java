import java.util.Scanner;

public class Cita {
	private
	String id,fecha,hora,motivo;
	Historial historial = new Historial();
	public Cita() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public Cita(String id, String fecha, String hora, String motivo, Historial historial) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.motivo = motivo;
		this.historial = historial;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro ID CITA: ");
		id=sc.next();
		System.out.println("Intro Fecha: ");
		fecha=sc.next();
		System.out.println("Intro hora: ");
		hora=sc.next();
		System.out.println("Intro motivo: ");
		motivo=sc.next();
		System.out.println("\t INTRODUCE DATOS DEL HISTORIAL");
		historial.leer();
	}
	void mostrar() {
		System.out.println("ID Cita: "+id);
		System.out.println("FECHA: "+fecha);
		System.out.println("HORA: "+hora);
		System.out.println("MOTIVO: "+motivo);
		System.out.println("\tDATOS DE HISTORIAL");
		historial.mostrar();
	}
}
