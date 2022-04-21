import java.util.Scanner;
public class fatih7{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sayi = input.nextInt();
		int sayiYedek = sayi;
		int çiftTop = 0;
		int tekTop = 0;
		
		//basamak sayısı bul	
		int bas = 0;
		while(sayi>0){
			sayi/=10;
		  bas=bas+1;
		}
		int[] basamaklar = new int[bas];
		sayi = sayiYedek;
		for(int i=0; i<bas; i++){
			basamaklar[i]=(int)(sayi%10);
			sayi/=10;
		}

		//tek çift topla
		for(int i=0; i<bas; i++){
		 if(basamaklar[i]%2==0)
			çiftTop += basamaklar[i];
		 else
			tekTop += basamaklar[i];
		}

		System.out.println(bas + " " + çiftTop + " " + tekTop + " " + Math.abs(çiftTop-tekTop));
	}
}
