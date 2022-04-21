public class dünya{
	public static void main(String[] args){
		Ağaç ağaç = new Ağaç("gürgen", 12.5, 2, 6);
		System.out.println("Tür: " + ağaç.tür + "\nBoy: " + ağaç.boy + "\nÇap: " + ağaç.çap + "\nYaş: " + ağaç.yaş);
	}
}

class Ağaç{
	String tür;
	double boy;
	double çap;
	int yaş;

	Ağaç(String tür, double boy, double çap, int yaş){
		this.tür = tür;
		this.boy = boy;
		this.çap = çap;
		this.yaş = yaş;
	}
}
