class CalculatorOOP{

	public int sum(int a, int b){
	
		System.out.println("Two int arg sum:"+(a+b));
	}
	public void sum(int a, int b, int c){
		System.out.println("Three int arg sum:"+(a+b+c));
	
	}
	public void sum(double a, double b, double c, double d){
		System.out.println("Four Double arg sum:"+(a+b+c+d));
	}
	

	public static void main(String arg[]){
	
		Calculator cal=new Calculator();
		cal.sum(4,4);
		cal.sum(40,40,60);
		cal.sum(4000.5,4000.55,5555.555,60.4);
	
	}

}
