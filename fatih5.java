import java.util.Scanner;
public class fatih5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int s = input.nextInt();
		String deger = "";
		if(s%2 != 0){
			while(s>0){
				deger=s%2+deger;
				s=s/2;
			}
		}
		else{
			while(s>0){
				deger=s%8+deger;
				s=s/8;
			}
		}
		System.out.println(deger);
	}
}
