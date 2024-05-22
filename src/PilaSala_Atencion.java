

import java.util.Scanner;

public class PilaSala_Atencion extends VectorSala_Atencion{
	private int tope;

	public PilaSala_Atencion() {
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
	public void adi(Sala_Atencion elem){
		if(!esLlena()){ //si la pila no es llena
			this.tope++;  //incrementa en una unidad  tope = tope + 1
			this.v[this.tope] = elem;
		}
		else
			System.out.println("Pila Llena!!!");
	}
	public Sala_Atencion eli(){
		Sala_Atencion elem = new Sala_Atencion();
		if(!esVacia()){ //si la pila no es vacia
			elem = this.v[this.tope];
			this.tope--; //decrementamos en una unidad
		}
		else
			System.out.println("Pila es vacia!!!!");
		return elem;
	}
	
	public void mostrar(){
		PilaSala_Atencion aux = new PilaSala_Atencion();
		System.out.println("\t==Datos de la Sala de Atencion==");
		int cont=1;
		while(!esVacia()){
			Sala_Atencion elem = new Sala_Atencion();
			 elem = eli();
			System.out.println("\t SALA ["+cont+"]");
			elem.mostrar();
			cont++;
			aux.adi(elem);
		} 
		vaciar(aux);
	}
	public void vaciar(PilaSala_Atencion p){
		while(!p.esVacia()){  //mientras la pila p NO es vacia
			this.adi(p.eli());
		}
	}
	public void llenar(int n){
		Scanner lee = new Scanner(System.in);
		System.out.println("\tINTRO DATOS SALA DE ATENCION ");
		for (int i = 1; i <= n; i++) {
			Sala_Atencion elem = new Sala_Atencion();
			elem.leer();
			this.adi(elem);
		}
	}
	public int nroElem(){
		return tope + 1;
	}
	public int NroElem(){
		PilaSala_Atencion aux = new PilaSala_Atencion();
		int c = 0;
		while(!esVacia()){
			Sala_Atencion elem = eli();
			aux.adi(elem);
			c++;
		} 
		vaciar(aux);
		return c;
	}
}
