package lab_12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Shape();
		Shape s2 = new Circle(5,"Yellow",false);
		Shape s3 = new Rectangle(10,11,"Red",true);
		Shape s4 = new Square(2,"Purple",false);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
	}

}
