package dd;
public class Arma {
	public String nome;
	public int DannoBase;
	public int magia;
	public boolean isElementale;
	public String elemento;
	public int danniElementali;
	public boolean dueMani;
	public float danno;  

	public Arma(int a){ 

		DannoBase=(int) (Math.random()*12+1);
		magia=(int) (Math.random()*5+0);
		a=(int) (Math.random()*1+1);
		if(a==1) {
			isElementale=true;
			elemento="Ghiaccio";
			danniElementali=(int) (Math.random()*6+1);
		}else {
			isElementale=false;
			danniElementali=0;
		}
		int b=(int) (Math.random()*1+1);
		if(b==1) {
			dueMani=false;
			danno=DannoBase+magia+danniElementali;
		}else {
			danno=(DannoBase+magia+danniElementali)*1.5f;
		}

	}

	public Arma() {
		nome="Spada di cartone";
		DannoBase=(int) (Math.random()*12+1);
		isElementale=false;
		danniElementali=0;
		dueMani=false;
		danno=DannoBase+magia+danniElementali;


	}

	public static void main(String[]args) {
		int a=(int) (Math.random()*5+1);
		if(a==1) {
			Arma A=new Arma();
			System.out.println(A.danno);
		}else {
			Arma A=new Arma(a);
			System.out.println(A.danno);
		}
	}
}
