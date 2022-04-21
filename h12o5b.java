public class h12o5b{
	public static void main(String[] args){
		int[][] matris={
			{100,20,300},
			{44,55,666},
			{7,80,9},
			{10,11,12}
		};
		int min = 9999;
		int max = -1;
		int minX = 0;
		int minY = 0;
		int maxX = 0;
		int maxY = 0;
		
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				if(matris[i][j]<min){
					minY=i;
					minX=j;
					min = matris[i][j];
				}
			}
		}

		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				if(matris[i][j]>max){
					maxY=i;
					maxX=j;
					max = matris[i][j];
				}
			}
		}
		System.out.printf("max: %d %15s min: %d \n", max, "", min);
		System.out.printf("Satır: %d Sütun: %d %5s Satır: %d Sütun: %d", maxX, maxY, "", minX, minY);
	}
}
