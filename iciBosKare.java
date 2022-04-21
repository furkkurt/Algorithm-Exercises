import java.util.Scanner;
public class iciBosKare{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int en = input.nextInt();
		int boy = input.nextInt();
		
		for(int i=0; i<en; i++){
			for(int j=0; j<boy; j++){
				if(i!=0 && i!=en-1){
					if(j!=0 && j!=boy-1)
						System.out.print("  ");
					else
						System.out.print("* ");
				}
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
