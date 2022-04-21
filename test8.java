import java.util.Scanner;
public class test8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[][] b=new int[3][3];
		int[][] c=new int[3][3];
		int[][] a=new int[3][3];

		for(int j=0; j<3; j++){
			for(int i=0; i<3; i++){
				System.out.printf("a[%d][%d], b[%d][%d]: ",j,i,j,i);
				a[j][i] = input.nextInt();
				b[j][i] = input.nextInt();
			}
		}

		for(int j=0; j<3; j++){
			for(int i=0; i<3; i++){
				for(int k=0; k<3; k++){
					c[j][i] = c[j][i] + a[k][0] +[1]
				}
			}
		}
	}
}
