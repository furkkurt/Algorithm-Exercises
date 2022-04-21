import java.util.Scanner;
public class uygulama4{
	public static void main(String[] args){
		Scanner klavye = new Scanner(System.in);
		double a = klavye.nextInt();
		double b = klavye.nextInt();
		double c = klavye.nextInt();

		double u = (a+b+c)/2;
		double A = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println(A);
	}
}
