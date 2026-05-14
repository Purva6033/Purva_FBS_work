class Shape{
	double area;
	
}

class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
		area=3.14 * radius * radius;
	}
}

class Triangle extends Shape{
	double base,height;
	Triangle(double base,double height){
		this.base=base;
		this.height=height;
		area= 0.5 * base * height;
	}
	
}

class Rectangle extends Shape{
	double length,breadth;
	Rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
		area=length * breadth;
	}
}

 class TestShape {
	 public static void main(String[] args) {
		Circle c = new Circle(2);
		Triangle t = new Triangle(12,23);
		Rectangle r = new Rectangle(11,13);
		
		System.out.println("Shape Hierarchy: ");
		System.out.println("Circle area" + c.area);
		System.out.println("Triangle area" + t.area);
		System.out.println("Rectangle area" + r.area);
	}

}
