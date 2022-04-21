import java.util.Scanner;
public class h12o2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] dizi = new int[5];
		int top = 0;

		for(int i=0; i<dizi.length; i++){
			dizi[i] = input.nextInt();
		}
		
		for(int i=0; i<dizi.length; i++){
			top += dizi[i];
		}

		int ort = top/dizi.length;
		System.out.println(top + " " + ort);
	}
}
