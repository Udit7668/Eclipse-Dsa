class Over1 
{

	public static void m1(Object a){
	  System.out.println("Object method");
	}
	public static void m1(String b){
	    System.out.println("String class");
	}
	public static void main(String[] args) 
	{
		Over1 obj=new Over1();
		obj.m1(null);
	}
}
