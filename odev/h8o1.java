import java.util.Scanner;
public class h8o1{
	public static void main(String[] args){
		Scanner klavye = new Scanner(System.in);
		
		System.out.print("3 sayı giriniz;");
		double s1 = klavye.nextDouble();
		double s2 = klavye.nextDouble();
		double s3 = klavye.nextDouble();

		double ort = (s1+s2+s3)/3;

		System.out.println("Ortalama: " + ort);
	}
}
