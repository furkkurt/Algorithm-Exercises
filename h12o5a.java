public class h12o5a{
	public static void main(String[] args){
		int[][] matris={
			{100,20,300},
			{44,55,666},
			{7,80,9},
			{10,11,12}
		};
		int min = 9999;
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				if(matris[i][j]<min)
					min = matris[i][j];
			}
		}
		System.out.println(min);
	}
}
