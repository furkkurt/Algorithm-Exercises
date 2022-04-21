import java.util.Scanner;
public class uygulama5{
	public static void main(String[] args){
		Scanner klavye = new Scanner(System.in);
		String parola = klavye.next();
		boolean valid = true;
		int num = 0;
		for(int i = 0; i<parola.length(); i++){
			if (parola.charAt(i) >= 65 && parola.charAt(i) <= 122)
				valid = true;
			else if(parola.charAt(i) >= 48 && parola.charAt(i) <= 57){
				valid = true;
				++num;
			}
			else
				valid = false;

			if(i<8)
				valid = false;

			if(num<2)
				valid = false;
		}
		System.out.println(valid);
	}	
}
