import java.util.Scanner;
public class algoLab12_2 {
	public static void main (String[] args){
		int random, tahmin;
		int adim = 0;
		random = (int)(Math.random() * 10) + 1;
		Scanner keyboard = new Scanner(System.in);
		int sayi = -1;
		do{
			adim++;
			System.out.print("Tahmin et: ");
			tahmin = keyboard.nextInt();
			if(tahmin < random)
				System.out.println("Daha büyük dene.");
			else if (tahmin > random)
				System.out.println("Daha küçük dene.");
		}
		while(tahmin != random);
		System.out.println(adim + " adımda bildiniz");
	}
}
