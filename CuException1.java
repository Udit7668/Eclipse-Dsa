
//customised exception handling by using try catch block

class CuException1 
{
	public static void main(String[] args) 
	{
		System.out.println("Statement-1");
		System.out.println("Statement-2");
		try{
		
		System.out.println(10/0);
		}
		catch(NullPointerException e){
		System.out.println("please enter only non zero value");
		}
		catch(ArithmeticException e){
		System.out.println("please enter only non sero value");
		}
		catch(Exception e){
		System.out.print("please enter only non zero value");
		}
		
		System.out.println("Statement-4");
		System.out.println("Statement-5");
		System.out.println("Statement-6");
		

		
	}
}
