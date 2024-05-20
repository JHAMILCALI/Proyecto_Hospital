import java.util.Scanner;

public class Sala_Atencion {
	String nomSalaArea,id;
	LD_NormalPaciente paciente = new LD_NormalPaciente();
	ColaCircularEnfermera enfermera = new ColaCircularEnfermera();
	LS_CircularCama cama = new LS_CircularCama();
	public Sala_Atencion() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public Sala_Atencion(String nomSalaArea, String id, LD_NormalPaciente paciente, ColaCircularEnfermera enfermera,
			LS_CircularCama cama) {
		super();
		this.nomSalaArea = nomSalaArea;
		this.id = id;
		this.paciente = paciente;
		this.enfermera = enfermera;
		this.cama = cama;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro Nombre Sala: ");
		nomSalaArea=sc.next();
		System.out.println("Inttro Id sala: ");
		id=sc.next();
		System.out.println("Introduce la cantiad de Pacientes: ");
		int cantPaciente=sc.nextInt();
		paciente.leer1(cantPaciente);
		System.out.println("Intro cantidad de camas: ");
		int cantCamas=sc.nextInt();
		cama.llenar1(cantCamas);
		System.out.println("Intro cantidad de Enferrmera(o): ");
		int cantEnfer=sc.nextInt();
		enfermera.llenar(cantEnfer);
	}
	void mostrar() {
		System.out.println("NOMBRE SALA: "+nomSalaArea);
		System.out.println("ID SALA :"+id);
		paciente.mostrar();
		enfermera.mostrar();
		cama.mostrar();
	}
	public String getNomSalaArea() {
		return nomSalaArea;
	}
	public void setNomSalaArea(String nomSalaArea) {
		this.nomSalaArea = nomSalaArea;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LD_NormalPaciente getPaciente() {
		return paciente;
	}
	public void setPaciente(LD_NormalPaciente paciente) {
		this.paciente = paciente;
	}
	public ColaCircularEnfermera getEnfermera() {
		return enfermera;
	}
	public void setEnfermera(ColaCircularEnfermera enfermera) {
		this.enfermera = enfermera;
	}
	public LS_CircularCama getCama() {
		return cama;
	}
	public void setCama(LS_CircularCama cama) {
		this.cama = cama;
	}
	
}
