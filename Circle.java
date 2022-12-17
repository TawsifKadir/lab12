package lab_12;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle() {
		super();
		this.radius = 2;
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius,String color,boolean filled) 
	{
		super(color,filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	public double getPerimeter() {
		return 2*Math.PI*this.radius;
	}
	
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
}
