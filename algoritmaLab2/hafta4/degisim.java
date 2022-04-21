public class degisim {

	public static void main(String[] args){
		int x = 10;
		System.out.println("İlk X değeri: " + x);
		x = degistir(x);
		System.out.println("Son X değeri: " + x);
	}

	public static int degistir(int x){
		x = 5;
		return(x);
	}

}

/* 
Referans veri tiplerinde metot, main'deki değişkeni değiştirebilir, ilkel veri tiplerinde değiştiremez.
*/
