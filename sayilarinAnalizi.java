import java.util.Scanner;
public class sayilarinAnalizi{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int boyut = input.nextInt();
		int[] dizi = new int[boyut];
		int toplam = 0;
		int ortUstu = 0;
			
		for(int i=0; i<dizi.length; i++){
			dizi[i] = input.nextInt();
		}

		for(int i=0; i<dizi.length; i++){
			toplam += dizi[i];	
		}

		double ort = toplam/dizi.length;
		System.out.println(ort);
		
		for(int i=0; i<dizi.length; i++){
			if(dizi[i]>ort){
				ortUstu += 1;
			}
		}
		System.out.println(ortUstu);
	}
}
