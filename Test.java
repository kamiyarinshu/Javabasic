package Page162;

public class Test {
	public static void main(String[] args) {
		Circle c=new Circle();
		Square s=new Square();
		double radius=4;
		double side_length=6;
		System.out.println("The area of a circle with radius "+radius+" is "+c.area(radius));
		System.out.println("The area of a square with a side length of "+side_length+" is "+s.area(side_length));
	}

}
