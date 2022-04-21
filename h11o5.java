import java.util.Scanner;
public class h11o5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);	
		int sayi = (int)(Math.random()*101);
		int tahmin;
		do{
			tahmin = input.nextInt();

			if(tahmin < sayi)
				System.out.println("Çok küçük dedin");
			else
				System.out.println("Çok büyük dedin");
		}
		while(tahmin != sayi);
		System.out.println("Doğru!");
	}
}
