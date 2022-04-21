import java.util.Scanner;
public class uygulama3{
	public static void main(String[] args){
		Scanner klavye = new Scanner(System.in);
		String entry = klavye.next();
		String[] array = new String[entry.length()];

		for (int i = 0; i<entry.length(); i++){
			array[i] = entry.substring(i, i+1);
		};

		int midNum = array.length/2;
		if (array.length % 2 == 0)
			System.out.println(array[midNum-1] + "" + array[midNum]);
		else
			System.out.println(array[midNum]);
	}
}
