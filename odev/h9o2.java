import java.util.Scanner;
public class h9o2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("ax^2 + bx + c = 0, sırasıyla a, b ve c değerlerini giriniz;");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double x1 = (-b + (Math.sqrt(Math.abs(Math.pow(b,2) - (4*a*c))))) / (2*a);
		double x2 = (-b - (Math.sqrt(Math.abs(Math.pow(b,2) - (4*a*c))))) / (2*a);
		
		System.out.println(a + "x^2 + " + b + "x + " + c + " denkleminin kökleri: " + x1 + " " + x2);
	}
}
