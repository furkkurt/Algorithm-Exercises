import java.util.Scanner;
public class ucgen{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int boy = input.nextInt();

		for(int i=1; i<=boy; i++){
		for(int j=i; j<=boy; j++)
			System.out.print("  ");
		for(int j=1; j<=i; j++)
			System.out.print("* ");
		for(int j=1; j<i; j++)
			System.out.print("* ");
		System.out.println();
		}
	}
}
