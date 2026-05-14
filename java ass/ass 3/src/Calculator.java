
 class Calculator {
	 
	 int addition(int a,int b) {              //addition
		 return a + b;
	 }
	 
	 double addition(double a,double b) {
		 return a+b;
	 }
	 
	 double addition(int a,double b) {
		 return a+b;
	 }
	 
	 double addition(double a,int b) {
		 return a+b;
	 }

	 
	 int substraction(int a,int  b) {          //subs
		 return a-b;
	 }
	 
	 double substraction(double a,double b) {
		 return a-b;
	 }
	 
	 double substraction( int a,double b) {
		 return a-b;
	 }
	 
	 double substraction(double a,int b) {
		 return a-b;
	 }
	 
	 int multiplication(int a,int  b) {          //multiply
		 return a*b;
	 }
	  
	 double multiplication(double a,double b) {
		 return a*b;
	 }
	 
	 double multiplication(int a,double b) {
		 return a*b;
	 } 
	 
	 double multiplication(double a,int  b) {
		 return a*b;
	 }
	 
	 int division (int a,int b) {               //div
		 return a/b;
	 }
	 
	double division (double a,double b) {
		 return a/b;
	 } 
	 
	 double division (int a,double b) {
		 return a/b;
	 }
	 
	 double division (double a,int b) {
		 return a/b;
	 }
	 
	public static void main(String[] args) {
		Calculator c=new Calculator();
		
		// Addition
        System.out.println("Add (int, int): " + c.addition(10, 8));
        System.out.println("Add(double, double): " + c.addition(10.5, 8.5));
        System.out.println("Add (int, double): " + c.addition(10, 8.5));
        System.out.println("Add (double, int): " + c.addition(10.5,8));

        // Subtraction
        System.out.println("Sub (int, int): " + c.substraction(10, 8));
        System.out.println("Sub (double, double): " + c.substraction(10.5, 8.5));
        System.out.println("Sub (int, double): " + c.substraction(10, 8.5));
        System.out.println("Sub (double, int): " + c.substraction(10.5, 8));

        // Multiplication
        System.out.println("Multiply(int, int): " + c.multiplication(10, 8));
        System.out.println("Multiply(double, double): " + c.multiplication(10.5, 8.5));
        System.out.println("Multiply (int, double): " + c.multiplication(10, 8.5));
        System.out.println("Multiply (double, int): " + c.multiplication(10.5, 8));

        // Division
        System.out.println("Div (int, int): " + c.division(10, 8));
        System.out.println("Div(double, double): " + c.division(10.5, 8.5));
        System.out.println("Div (int, double): " + c.division(10, 8.0));
        System.out.println("Div(double, int): " + c.division(10.5, 8));
	}

}
