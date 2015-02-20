// Coded by Jared Smith
// Car class from the practicum
// Coded on 2/20/15

public class Car {
	public String make;
	public String model;
	public String color;

// --------------------------------
Car() {
	make = "No make given";
	model = "No model given";
	color = "No color given";
}

Car(String thisMake, String thisModel, String thisColor) {
	make = thisMake;
	model = thisModel;
	color = thisColor;
}

Car(String thisMake, String thisModel) {
	this();
	make = thisMake;
	model = thisModel;
}

public String toString() {
	String output = "";
	output = "Make: " + make + "| Model: " + model + "| Color: " + color;
	return output;
	}
}
