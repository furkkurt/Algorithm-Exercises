import java.util.Scanner;
public class h9o3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int rakip = (int)Math.floor(Math.random()*3);
		System.out.println("Seçim yap: Taş (0), Kağıt (1), Makas (2)");
		int oyuncu = input.nextInt();

		if(oyuncu == 0)
			System.out.print("Taş vs ");
		else if(oyuncu == 1)
			System.out.print("Kağıt vs ");
		else
			System.out.print("Makas vs ");

		if(rakip == 0)
			System.out.print("Taş: ");
		else if(rakip == 1)
			System.out.print("Kağıt: ");
		else
			System.out.print("Makas: ");

		if(rakip == oyuncu)
			System.out.println("Berabere.");
		else if(rakip == 0 && oyuncu == 1)
			System.out.println("Kazandın!");
		else if(rakip == 0 && oyuncu == 2)
			System.out.println("Kaybettin :(");
		else if(rakip == 1 && oyuncu == 0)
			System.out.println("Kaybettin :(");
		else if(rakip == 1 && oyuncu == 2)
			System.out.println("Kazandın!");
		else if(rakip == 2 && oyuncu == 0)
			System.out.println("Kazandın!");
		else if(rakip == 2 && oyuncu == 1)
			System.out.println("Kaybettin :(");
	}
}
