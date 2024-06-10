package Clases;
import java.util.Scanner;

public class ColaCircularEnfermera extends ColaEnfermera{
	public ColaCircularEnfermera() {
		super();
	}
	public int nroElem() {
		return (fi - fr + MAX) % MAX;
	}
	public boolean esVacia() {
		if(nroElem() == 0)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(nroElem() == MAX-1)
			return true;
		return false;
	}
	public void adi(Enfermera elem) {
		if(!esLlena()) {
			fi = (fi + 1) % MAX;
			v[fi] = elem;
		}else
			System.out.println("cola circular llena!!!");
	}
	public Enfermera eli() {
		Enfermera elem = new Enfermera();
		if(!esVacia()) {
			fr = (fr + 1) % MAX;
			elem = v[fr];
		}else
			System.out.println("Cola circular vacia!!");
		return elem;
	}
	
	public void vaciar(ColaCircularEnfermera z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("\tIntro Enfermera");
			Enfermera elem = new Enfermera();
			elem.leer();
			adi(elem);
		}
	}
	public void mostrar() {
		ColaCircularEnfermera aux = new ColaCircularEnfermera();
		Enfermera elem;
		System.out.println("\t****COLA DE ENFEREMERA(O)****");
		while(!esVacia()) {
			elem = eli();
			elem.mostrar();
			System.out.println();
			aux.adi(elem);
		}
		vaciar(aux);
	}
}
