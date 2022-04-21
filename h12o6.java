public class h12o6{
	public static void main(String[] args){
		int[][] matris={
			{100,20,300},
			{44,55,666},
			{7,80,9},
			{10,11,12}
		};
		int[][] matrisTop= new int[5][4];
		int topSat = 0;
		int topSüt = 0;	
		//satırları topluyor
		for(int i=0; i<4; i++){
			topSat = 0;
			for(int j=0; j<3; j++){
				topSat += matris[i][j];
				matrisTop[i][3] = topSat;
			}
		}
		//sütunları topluyor
		for(int i=0; i<3; i++){
			topSüt = 0;
			for(int j=0; j<4; j++){
				topSüt+=matris[j][i];
				matrisTop[4][i] = topSüt;
			}
		}
		//yazdırıyor
		for(int i=0; i<5; i++){
			for(int j=0; j<4; j++){
				System.out.printf("%10d",matrisTop[i][j]);
			}
			System.out.println();
		}
	}
}
