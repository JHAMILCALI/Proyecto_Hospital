package Clases;
public class NodoPlanta{
	private String nroPlanta;
	private LD_CircularConsultorio consultorio = new  LD_CircularConsultorio();
	private PilaSala_Atencion salaAtencion = new PilaSala_Atencion();
	private NodoPlanta sig; //definiendo el campo enlace sig
	
	public NodoPlanta() {  //constructor
		sig = null;
	}

	public String getNroPlanta() {
		return nroPlanta;
	}

	public void setNroPlanta(String nroPlanta) {
		this.nroPlanta = nroPlanta;
	}

	public LD_CircularConsultorio getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(LD_CircularConsultorio consultorio) {
		this.consultorio = consultorio;
	}

	public PilaSala_Atencion getSalaAtencion() {
		return salaAtencion;
	}

	public void setSalaAtencion(PilaSala_Atencion salaAtencion) {
		this.salaAtencion = salaAtencion;
	}

	public NodoPlanta getSig() {
		return sig;
	}

	public void setSig(NodoPlanta sig) {
		this.sig = sig;
	}


}
