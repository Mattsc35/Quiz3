package quiz3;

//Matthews Curtinhas
public class Triangle extends GeometricObject {

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle() {
		super();
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}

	public Triangle(String color, boolean filled) {
		super(color, filled);
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle(String color, boolean filled, double side1, double side2,
			double side3) {
		this(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	@Override
	public double getArea() {
		double p = getPerimeter();
		return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	@Override
	public String toString(){
		return "This triangle has three sides of length " + side1 + ", " + side2 + ", " + side3;
	}

}