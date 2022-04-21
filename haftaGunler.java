import java.util.Scanner;
public class haftaGunler{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int deger = input.nextInt();
		switch(deger){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5: System.out.println("Hafta içi"); break;
			case 6:
			case 7: System.out.println("Hafta sonu");
		}
	}
}
