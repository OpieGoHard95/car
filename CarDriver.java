public class CarDriver {
	public static void main (String [] args) {
		Car testCar = new Car();
		System.out.println(testCar.toString());
		Car myCar = new Car("Ford", "Taurus", "Gold");
		System.out.println(myCar.toString());
		Car dadCar = new Car("Chrysler", "PT Cruiser");
		System.out.println(dadCar.toString());
	}
}
