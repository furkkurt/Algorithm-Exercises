import java.util.Scanner;
public class futbolTakımı{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] formalar = new int[33];
		String[] maçlar = {"içsaha","deplasman","kupa"};
		String[] takım = {"kaleci","2","3","4","5","6","7","8","9","kaptan","11"};
		for(int i=0; i<formalar.length; i++)
			formalar[i]=i;
		int forma = input.nextInt();
		int maç = (int)(forma/11);
		int oyuncu = (int)(forma%11 - 1);
		System.out.println(maçlar[maç] + " " + takım[oyuncu]);
	}
}
