public class ogrenciTest{
	public static void main(String[] args){
		Ogrenci öğrenci1 = new Ogrenci(31, "Mehmed", 900.50);
		Ogrenci öğrenci2 = new Ogrenci(215541013, "Furkan", 800.50);

		System.out.println(öğrenci1.ogrenciNo + " " + öğrenci1.isim + " " + öğrenci1.burs + " " + öğrenci1.ders);
		System.out.println(öğrenci2.ogrenciNo + " " + öğrenci2.isim + " " + öğrenci2.burs + " " + öğrenci2.ders);
	}
}
class Ogrenci{
	int ogrenciNo;
	String isim;
	double burs;
	String ders;

	Ogrenci(int ogrenciNo, String isim, double burs){
		this.ogrenciNo = ogrenciNo;
		this.isim = isim;
		this.burs = burs;
	}
	
	Ogrenci(int ogrenciNo, String isim, double burs, String ders){
		this.ogrenciNo = ogrenciNo;
		this.isim = isim;
		this.burs = burs;
		this.ders = ders;
	}
}
