package dd;

public class Oggetto {
	 private String nome;
	 private float costo;
	 private int rarità;
	 public Oggetto() {
		 
	 }
	 public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public int getRarità() {
		return rarità;
	}
	public void setRarità(int rarità) {
		this.rarità = rarità;
		
	}
	public static void main(String[] args) {
		 Oggetto O1= new Oggetto();
		 System.out.println(O1);
	 }
}
