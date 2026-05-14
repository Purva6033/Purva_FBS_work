class Shape{
	double area;
	
	void calculateArea(Triangle t) {
		area=0.5 * t.base * t.height;
		System.out.println("area of triangle:" + area);
	}
	
	void calculateArea(Circle c) {
		area=3.14 * c.radius * c.radius;
		System.out.println("area of circle:"+area);
	}
	
	void calculateArea(Rectangle r) {
		area=r.length * r.breadth;
		System.out.println("area of rectangle:"+area);
	}
	
}

class Triangle{
	double base,height;
	Triangle(double base,double height){
	this.base=base;
	this.height=height;
	}	
}

class Circle{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
}

class Rectangle{
	double length,breadth;
	Rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
}
public class area {
     public static void main(String [] args) {
    	 
    	 Shape s=new Shape();
    	 
    	 Triangle t=new Triangle(45,6);
    	 Circle c = new Circle(5);
    	 Rectangle r=new Rectangle(10,20);
    	 
    	 s.calculateArea(t);
    	 s.calculateArea(c);
		s.calculateArea(r);
	}
}
