import java.util.Scanner;
public class h8o2{
	public static void main(String[] args){
		Scanner klavye = new Scanner(System.in);
		System.out.println("Kardeşlerin yaşlarını girin;");

		int s1 = klavye.nextInt();
		int s2 = klavye.nextInt();
		double ort = (s1 + s2)/2;
		System.out.println("Kardeşlerin yaşları toplamı: " + (s1 + s2));
		System.out.println("Kardeşlerin yaşları ortalaması: " + ort);
	}
}
