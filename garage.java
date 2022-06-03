import java.util.Scanner;
public class garage{
	public static void main(String[] args){
		int wheels = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("How many cars do you have?");
		int cars = input.nextInt();
		wheels += cars * Car.wheels;
		System.out.println("How many trucks do you have?");
		int trucks = input.nextInt();
		wheels += trucks * Truck.wheels;
		System.out.println("How many motorcycles do you have?");
		int motorcycles = input.nextInt();
		wheels += motorcycles * Motorcycle.wheels;
		Garage.storedWheels += wheels;
		System.out.println("Total wheels: " + wheels);
		if(wheels<=12)
			System.out.println("That fits your garage.");
		else
			System.out.println("Your garage can only take up to 12 wheels.");
	}

	public static class Car{
		static int wheels = 4;
	}

	public static class Truck{
		static int wheels = 6;
	}

	public static class Motorcycle{
		static int wheels = 2;
	}

	public static class Garage{
		static int storedWheels = 0;
	}
}
