import java.util.Scanner;
public class fatih8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int boy = input.nextInt();
		
		for(int i=1; i<boy; i++){
			for(int j=0; j<i; j++)
				System.out.print("  ");
			System.out.println();
		}

		for(int i=1; i<=boy; i++){
			for(int j=0; j<i; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
