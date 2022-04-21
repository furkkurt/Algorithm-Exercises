public class h501{
	public static void main(String[] args){
    A a = new A();
		B b = new B();
		b.p(10);
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
	//OVERRIDE:
	public void p(double i){
		System.out.println(i);
	}
}
