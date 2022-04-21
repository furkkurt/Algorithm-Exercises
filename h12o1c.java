import java.util.Scanner;
import java.util.Arrays;
public class h12o1c{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] dizi = new int[5];

		for(int i=0; i<dizi.length; i++)
			dizi[i] = input.nextInt();

		Arrays.sort(dizi);
		for(int i=0; i<dizi.length; i++)
			System.out.print(dizi[i]);
	}
}
