import java.util.Scanner;
public class h11o4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int s1 = (int) (Math.random() * 10);
		int s2 = (int) (Math.random() * 10);
		System.out.print(s1 + " + " + s2 + " = ?");
		int cevap = input.nextInt();
		do{
			System.out.println("Yanlış cevap!");
			cevap = input.nextInt();
		}
		while(cevap != (s1+s2));
	}
}
