import java.util.Scanner;
public class karsilastirma{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		
		double ks,bs;
		if(s1>=s2){
			bs=s1;
			ks=s2;
		}
		else{
			bs=s2;
			ks=s1;
		}
		System.out.println("Büyük sayı: " + bs + " Küçük sayı: " + ks);
	}
}
