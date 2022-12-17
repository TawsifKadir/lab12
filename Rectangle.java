package lab_12;

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle() {
		super();
		this.width = 5;
		this.height = 5;
	}
	
	public Rectangle(double width,double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(double width,double height,String color,boolean filled) {
		super(color,filled);
		this.width = width;
		this.height = height;
	}
	
	public double getPerimeter() {
		return 2*(this.height+this.width);
	}
	
	public double getArea() {
		return this.height*this.width;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
