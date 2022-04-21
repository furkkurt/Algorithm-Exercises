public class h12o1a{
	public static void main(String[] args){
		int[]	dizi = {31,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int maks = 0;

		for(int i = 0; i < dizi.length; i++){
			if(dizi[i]>maks)
				maks = dizi[i];
		}

		System.out.println(maks);
	}
}
