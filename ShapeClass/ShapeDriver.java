//Shape Driver File
//Interfaces and Inner Classes
//Written by Timothy Tu
//November 13 2020
//Language: Java

package ShapeClass;

public class ShapeDriver {
    public static void main(String[] args){
		Circle Circle = new Circle(10);
		Rectangle Rectangle = new Rectangle(12, 5);
		Triangle Triangle = new Triangle(5,2);
		ShowArea(Circle);
		ShowArea(Rectangle);
		ShowArea(Triangle);
	}

	public static void ShowArea(Shape size){
		double area = size.area();
		System.out.printf("The %s has an area of %.2f\n", size.type(), area);
	
	}
}
