public class h9o1{
	public static void main (String[] args){
		int s1 = (int)(System.currentTimeMillis() % 10);
		int s2 = (int)(System.currentTimeMillis() / 7 % 10);

		System.out.println(s1 + " + " + s2 + " = " + (s1+s2));
	}
}
