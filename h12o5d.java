import java.util.Arrays;
public class h12o5d{
	public static void main(String[] args){
		int[][] matris={
			{100,20,300},
			{44,55,666},
			{7,80,9},
			{10,11,12}
		};
		int[] matrisTemp = new int[12];
		int[][] matrisSorted = new int[4][3];
		int indexK = 0;

		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				matrisTemp[indexK] = matris[i][j];
				indexK++;
			}
		}
		Arrays.sort(matrisTemp);
		
		indexK=0;
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				matrisSorted[i][j] = matrisTemp[indexK];
				indexK++;
			}
		}

		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++)
				System.out.print(matrisSorted[i][j] + " ");
			System.out.println();
		}

		
	}
}
