import java.util.Scanner;
class InvalidRollNumber extends Exception 
{
	InvalidRollNumber(String s){
	super(s);
	}
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll Number");
		String roll=sc.next();
		int length=roll.length();
		if(length==10){
		System.out.println("Your roll number is:: "+roll);

		}
		else{
			try{
		throw new InvalidRollNumber("Invalid Roll Number");
			}
			catch(InvalidRollNumber e){
			System.out.println(e.toString());
			}
		}


		}
}
