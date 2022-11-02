class Exception2 
{
	public static void main(String[] args) 
	{
		try{
			System.out.println("Statement-1");
		System.out.println("Statement-2");
		System.out.println(10/0);
		System.out.println("Statement-4");// the code which are written below the risky code an are in try block is not exceuted when countering exception in risky code
		System.out.println("Statement-5");
		System.out.println("Statement-6");
		}
		catch(Exception e){
		e.printStackTrace();
		}
	}
}
