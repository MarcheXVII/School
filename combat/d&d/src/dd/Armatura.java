package dd;
public class Armatura {
	public String nome;
	public int CA;
	public String rarit�;
	public Armatura() {
		nome="Corazza dell'eroe";
		CA=(int) (Math.random()*8+1);
		int i;
		i=(int) (Math.random()*3+1);
		switch (i) { 
		case 1: 
			rarit�="comune";
			CA=(int) (Math.random()*3+1);
			break;
		case 2:
			rarit�="rara";
			CA=(int) (Math.random()*6+1);
			break;
		case 3:
			rarit�="eroica";
			CA=(int) (Math.random()*8+1);
			break;
		} 
	}
	public static void main(String[]args) {
		Armatura Arm=new Armatura();
		System.out.println(Arm.CA);
	} 
}
