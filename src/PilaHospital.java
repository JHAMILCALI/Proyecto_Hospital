

import java.util.Scanner;

public class PilaHospital extends VectorHospital{
	private int tope;

	public PilaHospital() {
		this.tope = -1;
	}
	
	public boolean esVacia(){
		if(this.tope == -1)
			return true;  //pila vacia
		else
			return false; //pila no es vacia
	}
	public boolean esLlena(){
		if(this.tope == max-1)
			return true;  //pila llena
		else 
			return false; //pila no es llena
	}
	public void adi(Hospital elem){
		if(!esLlena()){ //si la pila no es llena
			this.tope++;  //incrementa en una unidad  tope = tope + 1
			this.v[this.tope] = elem;
		}
		else
			System.out.println("Pila Llena!!!");
	}
	public Hospital eli(){
		Hospital elem = new Hospital();
		if(!esVacia()){ //si la pila no es vacia
			elem = this.v[this.tope];
			this.tope--; //decrementamos en una unidad
		}
		else
			System.out.println("Pila es vacia!!!!");
		return elem;
	}
	
	public void mostrar(){
		PilaHospital aux = new PilaHospital();
		System.out.println("\t****Datos del Hospital*****");
		while(!esVacia()){
			Hospital elem = new Hospital();
			 elem = eli();
			System.out.println();
			elem.mostrar();
			aux.adi(elem);
		} 
		vaciar(aux);
	}
	public void vaciar(PilaHospital p){
		while(!p.esVacia()){  //mientras la pila p NO es vacia
			this.adi(p.eli());
		}
	}
	public void llenar(int n){
		Scanner lee = new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			Hospital elem = new Hospital();
			elem.leer();
			this.adi(elem);
		}
	}
	public int nroElem(){
		return tope + 1;
	}
	public int NroElem(){
		PilaHospital aux = new PilaHospital();
		int c = 0;
		while(!esVacia()){
			Hospital elem = eli();
			aux.adi(elem);
			c++;
		} 
		vaciar(aux);
		return c;
	}
}
