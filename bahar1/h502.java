public class h502{
	public static void main(String[] args){
    A a = new A();
		a.p(10);
		a.p(10.0);
	}
}

class B{
	public void p(double i){
		System.out.println(i*2);
	}
}

class A extends B{
	//OVERLOAD:
	public void p(int i){
		System.out.println(i);
	}
}
