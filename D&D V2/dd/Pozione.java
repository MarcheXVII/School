package dd;

public class Pozione extends Oggetto{
	private String colore;
	private String effetto;
	private float modstat;
	public float getModstat() {
		
		return modstat;
	}
	public void setModstat(float modstat) {
		this.modstat = modstat;
	}
	private int tipo;
	public int usi;
	public Pozione(int c) {
		super(1);
		 tipo=c;
		usi=1; 
		int r=(int)(Math.random()*15+1);
		setRarità(r);
		switch (c){
		case 1: setNome("benedizione di berlusconi"); colore="rosso"; effetto="cura"; modstat=(float)(Math.random()*r+1); setCosto((float)(Math.random()*200+1)); break;
		case 2: setNome("pillola di berlusconi");colore="blue"; effetto="forzaUp"; modstat= (float)(Math.random()*r+1);setCosto((float)(Math.random()*200+1)); break;
		case 3: setNome("ira di berlusconi"); colore="nero"; effetto="instantDamage"; modstat= (float)(Math.random()*r+1);setCosto((float)(Math.random()*200+1)); break;
		case 4: setNome("governo di berlusconi");colore="verde"; effetto="veleno"; modstat= (float)(Math.random()*r+1);setCosto((float)(Math.random()*200+1)); break;
		
		}
	}
	public static void main (String[] args) { 
		/*int a= (int) (Math.random()*4+1);
		Pozione p1 = new Pozione(a);
		System.out.println("nome: "+p1.getNome());
		System.out.println("livello di rarità: "+p1.getRarità());
		System.out.printf("costo %.2f \n",p1.getCosto()); 
		System.out.println("colore: "+p1.colore);
		System.out.println("effetto: "+p1.effetto);
		System.out.printf("potenza %.2f",p1.modstat);*/
	}
}
