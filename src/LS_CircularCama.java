

import java.util.Scanner;

public class LS_CircularCama extends ListaSimpleCama{
	public
		boolean esVacia() {
		if (p==null) {
			return true;
		}
		return false;
		}
		int nroNodos() {
			int c=0;
			if (p!=null) {
				NodoCama r = p;
				while(r.getSig()!=p) {
					c++;
					r=r.getSig();
				}
				c++;
			}
			return c;
		}
		void adiFinal(Cama z){
			NodoCama nuevo = new NodoCama();
			nuevo.setX(z);
			if (p==null) {
				p=nuevo;
				p.setSig(p);
			}else {
				NodoCama r = p;
				while (r.getSig()!=p) {
					r=r.getSig();
				}
				r.setSig(nuevo);
				nuevo.setSig(p);
			}
		}
		void mostrar() {
			NodoCama r =p;
			System.out.println("\t***LISTA DE CAMAS***");
			while (r.getSig()!=p) {
//				System.out.println("Nombre ["+r.getNom()+"] , Edad ["+r.getEdad()+"]");
				r.x.mostrar();
				System.out.println("");
				r=r.getSig();
			}
			//System.out.println("Nombre ["+r.getNom()+"] , Edad ["+r.getEdad()+"]");
			r.x.mostrar();
		}
		void adiPrincipio(Cama z) {
			NodoCama nuevo = new NodoCama();
			nuevo.setX(z);
			if (p==null) {
				p=nuevo;
				p.setSig(p);
			}else {
				NodoCama r=p;
				while (r.getSig() !=p) {
					r=r.getSig();
				}
				r.setSig(nuevo);
				nuevo.setSig(p);
				p=nuevo;
			}
		}
		NodoCama eliPrincipio() {
			NodoCama x = null;
			if (!esVacia()) {
				if (p.getSig()==p) {
					x=p;
					x.setSig(null);
					p=null;
				}else {
					x=p;
					
					NodoCama r = p;
					while (r.getSig()!=p) {
						r=r.getSig();
					}
					p=p.getSig();
					r.setSig(p);
					x.setSig(null);
				}
			}
			return x;
		}
		NodoCama eliFinal() {
			NodoCama x = new NodoCama();
			if (!esVacia()) {
				if (p.getSig()==p) {
					x=p;
					x.setSig(null);
					p=null;
				}else {
					NodoCama s = new NodoCama();
					NodoCama r = p;
					while (r.getSig()!=p) {
						s=r;
						r=r.getSig();
					}
					x=r;
					x.setSig(null);
					s.setSig(p);
				}
			}
			return x;
		}
		void llenar1(int n) {
			for (int i = 0; i < n; i++) {
				Cama x = new Cama();
				x.leer();
				adiFinal(x);
			}
		}
		void llenar2(int n) {
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < n; i++) {
				Cama x = new Cama();
				x.leer();
				adiPrincipio(x);
			}
		}
}
