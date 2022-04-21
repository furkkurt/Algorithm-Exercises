import java.util.Scanner;
public class bitirme3{
	public static void main(String[] args){
		Scanner klavye = new Scanner(System.in);
		System.out.println("Cinsiyet seçin (kadın için 1 erkek için 2 girin.)");
		int cinsiyet = klavye.nextInt();
		System.out.println("Adım sayısı giriniz; ");
		int adim = klavye.nextInt();
		int adimUzunluğu;
		
		if(cinsiyet == 1)
			adimUzunluğu=30;
		else
			adimUzunluğu=45;

		double kalori = (adimUzunluğu*adim)/500;
		System.out.println(kalori + " kalori yaktınız.");
	}
}
