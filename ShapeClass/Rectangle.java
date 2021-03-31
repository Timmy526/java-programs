//Rectangle Class
//Interfaces and Inner Classes
//Written by Timothy Tu
//November 13 2020
//Language: Java

package ShapeClass;

public class Rectangle implements Shape{
	private double inputHeight;
	private double inputWidth;

	public Rectangle(){
		inputHeight = 1;
		inputWidth = 1;
	}	

	public Rectangle(double height, double width){
		inputHeight = height;
		inputWidth = width;
	}
	    
	public double getHeight(){
		return inputHeight;
	}

	public void setHeight(double height){
		inputHeight = height;
		return;
	}

	public double getWidth(){
		return inputWidth;
	}

	public void setWidth(double width){
		inputWidth = width;
		return;
	}

	public double area(){
		return inputHeight * inputWidth;
	}
	
	public String type(){
		return "Rectangle";
	}
}
