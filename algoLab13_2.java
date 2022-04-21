public class algoLab13_2{
	public static void main(String[] args){
		String cumle = "Evrenin gizemini anlamak istiyorsanız, enerji, frekans ve tireşim cinsinden düşünün.";

		int n = 0;
		char[] karakterler = cumle.toCharArray();
		for(char c:karakterler){
			n++;
		}
		System.out.print(n);
	}
}
