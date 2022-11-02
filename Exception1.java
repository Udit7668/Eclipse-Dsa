class Exception1 
{
	public static void main(String[] args) 
	{
		System.out.println("statement-1");
		System.out.println("statement-2");
		System.out.println("statement-3");
		
		try{
			System.out.println(10/0);
		}
		catch(Exception e){
		e.printStackTrace();
		}
		System.out.println("statement-5");
		System.out.println("statement-6");

	}
}
