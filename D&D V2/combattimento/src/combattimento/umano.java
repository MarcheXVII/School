package combattimento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class umano {
	public String nome;
	private int anni;
	public float peso;
	private int proiettile;

	public umano(String n, int f) {
		nome = n;
		anni = 8;
		peso = 70.5f; 
		proiettile = f;
	}

	public void mangia(int Pasta) {
		int PiattoDiPasta = Pasta;
		float pasto = PiattoDiPasta * 0.08f;
		peso += pasto;

	}

	public void compleanno() {
		anni++;
	}

	public float spara(int ncorna) {
		float danno;
		int numCorna = ncorna;
		danno = proiettile * numCorna;

		return danno;

	}

	public float caga() {
		peso = peso - (peso * 5 / 100);

		return peso;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		System.out.println("come si chiama l'umano?");
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		String nome = tastiera.readLine();
		umano u1 = new umano(nome, 2);
		System.out.println("quante corna gli ha fatto la ragazza di  ?" + u1.nome);
		int ncornae = Integer.valueOf(tastiera.readLine()).intValue();
		u1.mangia(1);
		System.out.println("dopo il pranzo pesi" + u1.peso);
		u1.caga();
		System.out.println("invece dopo la cagatina pomeridiana pesi" + u1.peso);
		u1.compleanno();
		System.out.println("la tua età ora è di " + u1.anni + "anni");

		float danni = u1.spara(ncornae);
		System.out.println("sparando contro i numerosi amanti di sua moglie ha causato dai dal totale di ?" + danni);
	}
}
