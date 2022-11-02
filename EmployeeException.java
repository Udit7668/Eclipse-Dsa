import java.util.Scanner;
class EmployeeException extends RuntimeException
{
	EmployeeException(String s){
		super(s);
		}
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary of Employee");
		int sal=sc.nextInt();
		if(sal>=5000 && sal<=10000){
		System.out.println("Employee salary is:: "+sal);
		}
		else if(sal<5000){
		try{
			throw new EmployeeException(" Salary is too low");
		}
		catch(EmployeeException e){
		System.out.println(e.toString());
		}
		}
		else{
			try{
		throw new EmployeeException("Salary is too High");	
			}
			catch(EmployeeException e){
			System.out.println(e.toString());
			}
		}
	}
}
