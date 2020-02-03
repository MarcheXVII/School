package dd;

public class armamischia extends Arma{

	public armamischia(){	
		super(5);
		int r=(int) (Math.random()*1+1);
		if(r==1) {
			dueMani=true;	 
		}else {
			dueMani=false;
		}

	}



}

	
