import java.util.Scanner;
public class faktoriyel{
	public static void main(String[] args){
		Scanner klavye = new Scanner(System.in);
		int sayi = klavye.nextInt();
		int sonuc = 1;
		while(sayi>1){
			sonuc = sonuc*sayi;
			sayi=sayi-1;
		}
		System.out.println(sonuc);
	}
}
