package dd;

public class ascia extends armamischia{

		public ascia(){
			DannoBase=(int) (Math.random()*12+1);
			magia=(int) (Math.random()*5+0);
			int a=(int) (Math.random()*1+1);
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
}
