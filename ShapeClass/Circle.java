//Circle Class
//Interfaces and Inner Classes
//Written by Timothy Tu
//November 13 2020
//Language: Java

package ShapeClass;

public class Circle implements Shape{
	private double inputRadius;
	
	public Circle() {
		inputRadius = 1;
	}
	
	public Circle(double radius) {
		inputRadius = radius;
	}
	
	public double getRadius(double radius) {
		return inputRadius;
	}
	
	public void setRadius(double radius) {
		inputRadius = radius;
		return;
	}
	
	public double area() {
		final double PI = 3.14;
		return PI * (inputRadius * inputRadius);
	}
	
	public String type(){
		return "Circle";
	}
}