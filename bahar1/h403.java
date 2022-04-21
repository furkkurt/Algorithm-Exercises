import java.util.Scanner;
public class h403{
	public static void main(String[] args){
    Scanner input = new Scanner(System.in);
		boolean endSession = false;
		int eylem;
		System.out.println("Hesap tanımla (no, isim, bakiye):");
		
		int no = input.nextInt();
		input.nextLine();
		String isim = input.nextLine();
		double bakiye = input.nextDouble();
		Hesap hesap = new Hesap(no, isim, bakiye);

		System.out.println("1: Göster\n2: çek\n3: Yatır\n4: Çıkış");
		while (endSession == false){
			eylem = input.nextInt();
			
			if (eylem == 1){
				hesap.göster();
			}
			else if (eylem == 2){
				System.out.println("Çekilecek miktar:");
				double x = input.nextDouble();
				hesap.paraÇek(x);
			}
			else if (eylem == 3){
				System.out.println("Yatırılacak miktar:");
				double x = input.nextDouble();
				hesap.paraYatır(x);	
			}
			else if (eylem == 4){
				endSession = true;
			}
			else
				System.out.println("1: Göster\n2: çek\n3: Yatır\n 4: Çıkış");
			System.out.println();
		}
	}
}

class Hesap{
	int hesapNo;
	String isim;
	double bakiye;

	Hesap(int no, String isim, double bakiye){
		this.hesapNo = no;
		this.isim = isim;
		this.bakiye = bakiye;
	}

	void paraÇek(double miktar){
		bakiye -= miktar;
	}

	void paraYatır(double miktar){
		bakiye += miktar;
	}

	void göster(){
		System.out.print("Hesap Numarası: " + hesapNo + "\nMüşteri Ad-Soyad: " + isim + "\nBakiye: " + bakiye);
	}
}
