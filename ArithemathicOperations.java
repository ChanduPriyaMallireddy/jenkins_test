public class ArithemathicOperations {
	
	public static int addition(int a,int b)
	{
		return a+b;
	}
	
	public static int subtraction(int a,int b)
	{
		return a-b;
	}
	public static int multiplication(int a,int b)
	{
		return a*b;
	}
	
	public static void main(String[]args){
        ArithemathicOperations ao = new ArithemathicOperations();
		System.out.println(ao.addition(10,20));
		System.out.println(ao.subtraction(20,10));
		System.out.println(ao.multiplication(10,20));
	}

}