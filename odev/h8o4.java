import java.util.Scanner;
public class h8o4{
	public static void main(String[] args){
		Scanner klavye = new Scanner(System.in);
		System.out.println("Sayıyı, ardından üssünü giriniz;");
		int s = klavye.nextInt();
		int üs = klavye.nextInt();
		System.out.println(Math.pow(s, üs));
	}
}
