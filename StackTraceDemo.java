class StackTraceDemo 
{
	void m1(){ 
		
		
		try{
			System.out.println(10/0);
		}
		catch(Exception e){
		
	e.printStackTrace();
	}
		}


		void m2(){
			m1();
		System.out.println("This is from m2 method");
		}
		
		void m3(){
			m2();
		System.out.println("This is from m3 method");
		}
	public static void main(String[] args) 
	{
		StackTraceDemo obj=new StackTraceDemo();
		obj.m3();
		System.out.println("This is from main method");
	}
}
