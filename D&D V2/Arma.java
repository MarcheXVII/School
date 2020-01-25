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
//qolppp
	public Arma(){ 
		nome="Spada divina"; 
		DannoBase=(int) (Math.random()*8+1);
		magia=(int) (Math.random()*5+0);
		isElementale=true;
		elemento="Ghiaccio";
		if(isElementale==true) {
			danniElementali=(int) (Math.random()*6+1);
		}else {
			danniElementali=0;
		}
		dueMani=false;
		if(dueMani==true) {
			danno=(DannoBase+magia+danniElementali)*1.5f;
		}else {
			danno=DannoBase+magia+danniElementali;
		}
	}
	public Arma(int a) {
		nome="Spada di cartone";
		DannoBase=(int) (Math.random()*8+1);
		isElementale=true;
		elemento="carta";
		if(isElementale==false) {
			danniElementali=(int) (Math.random()*6+1);
		}else {
			danniElementali=0;
		}
		dueMani=false; 
		if(dueMani==true) {
			danno=(DannoBase+magia+danniElementali)*1.5f;
		}else {
			danno=DannoBase+magia+danniElementali;
		}
	}
	public static void main(String[]args) {
		int a=(int) (Math.random()*1+1);
		if(a==1) {
		Arma A=new Arma();
		System.out.println(A.danno);
		}else {
			Arma A=new Arma(a);
			System.out.println(A.danno);
		}
	}
}
