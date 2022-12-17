package lab_12;

public class Square extends Rectangle{
	public Square() {
		super(5,5);
	}
	
	public Square(double side) {
		super(side,side);
	}
	public Square(double side,String color,boolean filled) {
		super(side,side,color,filled);
	}
	public double getArea() {
		return this.getWidth()*this.getHeight();
	}
	public double getPerimeter() {
		return 2*(this.getWidth()*this.getHeight());
	}

	@Override
	public String toString() {
		return "Square [side="+this.getHeight()+"]";
	}
	
	
}
