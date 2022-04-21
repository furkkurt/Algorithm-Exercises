public class kartDestesi{
	public static void main(String[] args){
		int[] deste = new int[52];
		String[] gruplar = {"Maça", "Kupa", "Karo", "Sinek"};
		String[] numaralar = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Bacak", "Kız", "Papaz"};
	
		//Kart Başlangıcı
		for(int i = 0; i<deste.length; i++)
			deste[i] = i;
		
		//Kartları Karıştır
		for(int i = 0; i<deste.length; i++){
			int index = (int)(Math.random() * deste.length);
			int temp = deste[i];
			deste[i] = deste[index];
			deste[index] = temp;
		}

		//ilk dört kartı göster
		for(int i = 0; i<4; i++){
			String grup = gruplar[deste[i] / 13];
			String numara = numaralar[deste[i] % 13];
			System.out.println(grup + " " + numara);
		}
	}
}
