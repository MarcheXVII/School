package dd;

public class spada extends armamischia {
	public spada(){
		DannoBase=(int) (Math.random()*10+1);
		magia=(int) (Math.random()*4+0);
		int a=(int) (Math.random()*1+1);
		if(a==1) {
			isElementale=true;
			elemento="Ghiaccio";
			danniElementali=(int) (Math.random()*8+1);
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
	
	}		
