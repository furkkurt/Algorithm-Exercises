public class arrayDegisim {

	public static void main(String[] args){
		int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
		System.out.println("İlk dizi: ");
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "-");
		degistir(arr);
		System.out.println("\nSon dizi: ");
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "-");
	}

	public static void degistir(int arr[]){
		for(int i = 0; i < arr.length; i++)
			arr[i] = 0;
	}

}

/* 
Referans veri tiplerinde metot, main'deki değişkeni değiştirebilir, ilkel veri tiplerinde değiştiremez.
*/
