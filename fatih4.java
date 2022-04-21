import java.util.Scanner;
public class fatih4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int s = input.nextInt();
		int deger = 10;
		int azalış = 2;
		int[][] dizi = new int[s][4];

		for(int i=0; i<s; i++){
			for(int j=0; j<4; j++){
				dizi[i][j] = ((i+1)*10) - (azalış*j);
				System.out.printf("%4d ",dizi[i][j]);
			}
			azalış += 1;
			System.out.println();
		}
	}
}
