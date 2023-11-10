public class Mesada {
private int ancho;
private int largo;
private static final int maximoAltoYLargo = 1000000;
private boolean apila;

public Mesada(int ancho, int largo) throws Exception {
this.setAncho(ancho);
this.setLargo(largo);
this.apila = false;
}

public boolean getApila() {
return apila;
}

public void setApila(boolean a) {
this.apila = a;
}

public int getAncho() {
return ancho;
}
public void setAncho(int a) throws Exception {
	if(a > this.maximoAltoYLargo) 
		throw new Exception("Error: El ancho de una mesada supera el permitido");
	else this.ancho = a;

}

public int getLargo() {
return largo;
}
public void setLargo(int largo) throws Exception {
	if(largo > this.maximoAltoYLargo) 
		throw new Exception("Error: El largo de un mesada supera el permitido");
	else this.largo = largo;
}

public String toString() {
return "Mesada [ancho=" + this.getAncho() + ", largo=" + this.getLargo()+" apilable: " +this.getApila()+ "]";
}

}
///////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////


