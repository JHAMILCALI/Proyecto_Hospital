

public class NodoCama {
	private
	NodoCama sig;
	Cama x = new Cama();
	
	public
	NodoCama() {
		sig=null;
	}

	public NodoCama getSig() {
		return sig;
	}

	public void setSig(NodoCama sig) {
		this.sig = sig;
	}

	public Cama getX() {
		return x;
	}

	public void setX(Cama x) {
		this.x = x;
	}
	
}
