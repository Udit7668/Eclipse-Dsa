class  Exception3
{
	public static void main(String[] args) 
	{
		System.out.println("Statement-1");
		System.out.println("Statement-2");
		try{
			System.out.println(10/0);
		}
		
		catch(ArithmeticException e){
		e.printStackTrace();
		}
		System.out.println("Statement-4");
		System.out.println("Statement-5");
		System.out.println("Statement-6");
	}
}
