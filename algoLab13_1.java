import java.util.Arrays;
import java.util.Scanner;
public class algoLab13_1 {
	public static void main(String[] args){
		String[] bir = {"bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"}; 
		String[] on = {"on", "yirdmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};
		Scanner klavye = new Scanner(System.in);
		byte n = klavye.nextByte();
		
		if(n/10<1){
			System.out.println(bir[(n-1)]);
		}
		else{
			int birler = n%10;
			int onlar = n/10;
			System.out.print(on[(onlar-1)] + " ");
			if(birler != 0){
				System.out.println(bir[(birler-1)]);
			}
		}
	}
}
