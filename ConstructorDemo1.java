class Parent
{
	Parent(){
		this(10);
	System.out.println("Parent class");
	}
    Parent(int data){
	System.out.println("One param Constructor for parent class");
	}
}
class Child extends Parent
{
    Child(){
	//this(10);
	System.out.println("Zero param constructor");
}

Child(int data){
System.out.println("Child Class");
//this();-- it must be first statement of constructor;
// also this is a non static reference which can be used in static method();

}
}

class ConstructorDemo1
{
	public static void main(String[] args) 
	{
		
		Child obj=new Child();
		
	}
}
