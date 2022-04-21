import java.util.Scanner;
public class sifreEsleme{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String[] sifreler = {"1071","1923","1453","2023"};

		int i=0;

		boolean kontrol = false;
		do{
			System.out.print("şifre gir");
			String sifre = input.nextLine();
			i++;
			if(sifre.equals(sifreler[0]) && i<3){
				System.out.println("Şifre doğru");
				kontrol = true;
			}
			else if(i>=3){
				System.out.println("3 kez hatalı giriş yapıldı");
				break;
			}
			else
				kontrol=false;
		}
		while(kontrol == false);
	}
}
