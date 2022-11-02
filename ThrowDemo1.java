class ThrowDemo1 extends Throwable 
{
	public static void main(String[] args) 
	{
	  try{
		  throw new ThrowDemo1();
	  }
	  catch(ThrowDemo1 e){
	  e.printStackTrace();
	  }
	}
}
