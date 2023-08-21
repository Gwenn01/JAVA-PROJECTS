package AreaPerimeterOfRectangle;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter a width: ");
		double width = s.nextDouble();
		System.out.println("Enter a height: ");
		double height = s.nextDouble();
		
		rec.setWidth(width);
		rec.setHeight(height);
		
		System.out.println("Width = " + rec.getWidth() + " Height = " + rec.getHeight());
		
		System.out.println("Area of Rectangle = " + rec.claculateArea());
		System.out.println("Perimeter of Rectangle = " + rec.calculatePerimeter());
	
	
	
	}

}
