
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Deposito {
	
	public	ArrayList<Mesada> mesadas = new ArrayList<Mesada>();
	public int cant;

	public void iniciar() throws IOException, Exception{
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\rosae\\OneDrive\\Escritorio\\mesada.in.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("src\\mesada.out.txt"));

		try {

			String line;
			ArrayList aux = new ArrayList();
			while((line=in.readLine())!=null) {
				aux.add(line);
				if(aux.size()>1) {

					mesadas.add(crearMesa(line));
				}
				else cant=Integer.parseInt(line);
			}
			out.write(" "+this.calcular(mesadas));

		}finally {

			if(out != null)
				out.close();
		}
		
		
}
private Mesada crearMesa(String renglon) throws Exception {
		int a; int h;
		String[] medidas = renglon.split(" ");
		a=Integer.parseInt(medidas[0]);
		h=Integer.parseInt(medidas[1]);
		return new Mesada(a,h);
	}
private int calcular(ArrayList<Mesada> j) {
	int cantPilas=0;
	for(Mesada e: j) {
		for(Mesada f: j) {
			if(e.getAncho()<f.getAncho() && e.getLargo()< f.getLargo() 
					|| (e.getAncho()<f.getLargo() && e.getLargo()<f.getAncho())) {
				e.setApila(true);
			
					}
			}

		}

	for(Mesada e:j) {
		if(e.getApila()==false) {
			cantPilas++;

		}

	}
if(j.isEmpty()==false){
  if(cantPilas==0){
	   System.out.print("cantidad de pilas minimo:     "+1);
	   return 1;}
  else{
    System.out.print("cantidad de pilas minimo: "+cantPilas);
	  cantPilas;}
  }
else return cantPilas;
}


}//fin clase

