public class dörtgenOluştur{
	public static void main(String[] args){
		rectangle dörtgen = new rectangle();
		rectangle dörtgen2 = new rectangle(5, 10);
		System.out.println(dörtgen.getArea());
		System.out.println(dörtgen2.getArea());
	}
}

class rectangle{
	double en;
	double boy;

	rectangle(){
		en = 1;
		boy = 1;
	}
	rectangle(double en, double boy){
		this.en = en;
		this.boy = boy;
	}
	
	double getArea(){
		return(en * boy);
	}
	double getPerimeter(){
		return((en+boy)*2);
	}
}
