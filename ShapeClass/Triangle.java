//Triangle Class
//Interfaces and Inner Classes
//Written by Timothy Tu
//November 13 2020
//Language: Java

package ShapeClass;

public class Triangle implements Shape{
	private double inputHeight;
	private double inputBase;

	public Triangle(){
		inputHeight = 1;
		inputBase = 1;
	}

	public Triangle(double height, double base){
		inputHeight = height;
		inputBase = base;
	}
    
	public double getHeight(){
		return inputHeight;
	}

	public void setHeight(double base){
		inputHeight = base;
		return;
	}

	public double getWidth(){
		return inputBase;
	}

	public void setWidth(double base){
		inputBase = base;
		return;
	}

	public double area(){
		return inputHeight * (inputBase / 2);
	}
	
	public String type(){
		return "Triangle";
	}
}
