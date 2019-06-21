package javaBasic;

public class IfElse_Demo {             

	public static void main(String[] args) {
		int x= 20;
		if(x>10)
		{
			System.out.println("If code executed");	
		}
		else
		{
			System.out.println("Else code executed");
		}
		//		This method is created out side the main method. As the method is static hence just 
		//		called in main method t execute the code.
		TestElse();
	}
	public static void TestElse()
	{
		int x= 20;
		if(x>30)
		{
			System.out.println("If code executed");	
		}
		else
		{
			System.out.println(" Second method Else code  is executed");
		}
	}
}


