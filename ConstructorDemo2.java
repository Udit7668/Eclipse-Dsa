class Parent
	{

	final Parent(){
	System.out.println("Parent class");
	}
}

class ConstructorDemo2 
{
	public static void main(String[] args) 
	{
		Parent obj=new Parent();
	}
}


/*
private Parent()----this implies that class Parent object can be created onlye in same class
it cannot be created outside the other class

final Parent()--- this acess modifieres cannot be used here because child class inherits the all members of
parents  except the constructor
in other words ,constructor cannot be override or inherited in java
so final written before constructor makes no sense because we use final before function to protect it from 
overiding and final before class is used to protect it from inherited

Static Parent()-- we cannot use static against constructor
In general, static means class level. A constructor will be used to assign initial values for the instance
variables. Both static and constructor are different and opposite to each other. We need to assign initial 
values for an instance variable we can use a constructor. We need to assign static variables we can use Static Blocks.
*/