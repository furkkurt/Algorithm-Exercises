public class test{
	public static void main(String[] args){
		Parent p = new Child();
		p.name = "Alper";

		Child child = (Child) p;
		child.age = 19;

		System.out.println(child.name);
		System.out.println(child.age);
		child.showMessage();
		p.showMessage();
	}
}
