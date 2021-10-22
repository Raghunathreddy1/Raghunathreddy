package day5.inheritance.assignments;
//child class
public class Bike extends Vehicle {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.start();
		b1.stop();
		b1.name = "jawa";
		b1.price = 210000;
		System.out.println(b1.name + " " + b1.price);

	}

}
