package AreaPerimeterOfRectangle;

public class Rectangle {
	private double width;
	private double height;
	
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	public double claculateArea() {
		return width * height;
	}
	public double calculatePerimeter() {
		return 2 * (height + width);
	}
	
}
