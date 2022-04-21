import java.util.Scanner;
public class ucBasamakCarpim{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		System.out.print(sayi + " = " + sayi/100 + "*100 + ");
		System.out.print((sayi-((sayi/100)*100))/10 + "*10 + ");
		System.out.println(sayi%10);
	}
}
