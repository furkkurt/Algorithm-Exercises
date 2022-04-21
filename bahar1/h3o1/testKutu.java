public class testKutu{
	public static void main(String[] args){
		Kutu kutu1 = new Kutu();
		Kutu kutu2 = new Kutu(2,3,4);
		System.out.println(kutu1.getMass());
		System.out.println(kutu2.getMass());
	}
}

class Kutu{
	private double en;
	private double boy;
	private double yukseklik;

	Kutu(){
		this.en = 1;
		this.boy = 1;
		this.yukseklik = 1;
	}

	Kutu(double en, double boy, double yukseklik){
		this.en = en;
		this.boy = boy;
		this.yukseklik = yukseklik;
	}

	double getMass(){
		return(en*boy*yukseklik);
	}
}
