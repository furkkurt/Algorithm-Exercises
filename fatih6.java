import java.util.Scanner;
public class fatih6{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int s = input.nextInt();
		double arOrt=0;
		double geOrt=1;
		double i = 0;

		if(s%2 == 0){
			while(s>0){
				arOrt += s%10;
				s=s/10;
				i=i+1;
			}
			arOrt = arOrt/i;
			System.out.println(arOrt);
		}
		else{
			while(s>0){
				geOrt = geOrt * s%10;
				System.out.println(s%10);
				s=s/10;
				i=i+1;
			}
			geOrt = Math.pow(geOrt, (1/i));
			System.out.println(geOrt);
		}
	}
}
