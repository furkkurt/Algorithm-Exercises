import java.util.Scanner;
public class bitirme2{
	public static void main(String[] args){
		Scanner klavye = new Scanner(System.in);
		System.out.println("Makine sayısı giriniz;");
		int makineSayisi = klavye.nextInt();
		System.out.println("Kaçıncı aydayız?");
		int ay = klavye.nextInt();
		
		//ilkbahar/yaz
		if(ay>2 && ay<9){
			int sure=480;
			int ara=45;
			for(int i = 0; i<makineSayisi; i++){
				System.out.print((sure - ara*i) + ", ");
			}
		}
		else{
			int sure = 540;
			int ara = 30;
			for(int i = 0; i<makineSayisi; i++){
				System.out.print((sure - ara*i) + ", ");
			}
		}
	}
}
