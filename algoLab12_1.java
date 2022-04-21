public class algoLab12_1{
	public static void main(String[] args){
		for(int i = 2; i < 50; i++){
			boolean asal = true;
			for(int j = 2; j < (i-1); j++){
				if (i%j == 0)
					asal = false;
			}
			if (asal == true)
				System.out.print(i + ", ");
		}
	}
}
