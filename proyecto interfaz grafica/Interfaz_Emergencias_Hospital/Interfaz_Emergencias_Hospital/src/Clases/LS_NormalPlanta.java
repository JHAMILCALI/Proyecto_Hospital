package Clases;
import java.beans.IntrospectionException;
import java.util.Scanner;

public class LS_NormalPlanta extends ListaSimplePlanta{

	public LS_NormalPlanta() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(String nroPlanta, LD_CircularConsultorio con,PilaSala_Atencion aten) {
		NodoPlanta nuevo = new NodoPlanta();
		nuevo.setNroPlanta(nroPlanta);
		nuevo.setConsultorio(con);
		nuevo.setSalaAtencion(aten);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(String nroPlanta, LD_CircularConsultorio con,PilaSala_Atencion aten) {
		NodoPlanta nuevo = new NodoPlanta();
		nuevo.setNroPlanta(nroPlanta);
		nuevo.setConsultorio(con);
		nuevo.setSalaAtencion(aten);
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoPlanta R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoPlanta R = P;   //R apunta  a la raiz P
		System.out.println("\n\tLISTA DE Plantaes");
		while(R != null) {
			System.out.println("Nro Planta: "+R.getNroPlanta());
			R.getConsultorio().mostrar();
			R.getSalaAtencion().mostrar();
			System.out.println("=========================");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoPlanta R = P;
		int c = 0;
		if(this.esVacia())
			return 0;
		else {
			while(R != null) {
				c++;
				R = R.getSig();
			}
		}
		return c;
	}
	public NodoPlanta eliPrincipio() {
		NodoPlanta x = new NodoPlanta();
		if(!esVacia()) {
			x = P;
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoPlanta eliFinal() {
		NodoPlanta x = new NodoPlanta();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}
			else {
				NodoPlanta R = P;
				NodoPlanta S = P;
				while(R.getSig() != null) {
					S = R;
					R = R.getSig();
				}
				x = R;
				S.setSig(null);
			}
		}
		return x;
	}
	void llenar1(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Introduce el nro Planta: ");
			String nroPlanta = "";
			nroPlanta=sc.next();
			LD_CircularConsultorio con = new LD_CircularConsultorio();
			System.out.println("\tIntroduce la cantidad de consultorios: ");
			int canCon=sc.nextInt();
			con.leer1(canCon);
			PilaSala_Atencion sala = new PilaSala_Atencion();
			System.out.println("\tIntroduce la cantidad de Sala de Atencion: ");
			int cantSala=sc.nextInt();
			sala.llenar(cantSala);
			adiFinal(nroPlanta,con,sala);
		}
	}
	void llenar2(int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Introduce el nro Planta: ");
			String nroPlanta = "";
			nroPlanta=sc.next();
			LD_CircularConsultorio con = new LD_CircularConsultorio();
			System.out.println("\tIntroduce la cantidad de consultorios: ");
			int canCon=sc.nextInt();
			con.leer1(canCon);
			PilaSala_Atencion sala = new PilaSala_Atencion();
			System.out.println("\tIntroduce la cantidad de Sala de Atencion: ");
			int cantSala=sc.nextInt();
			sala.llenar(cantSala);
			adiPrincipio(nroPlanta,con,sala);
		}
	}
}
