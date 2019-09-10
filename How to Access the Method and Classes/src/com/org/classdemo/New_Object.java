package com.org.classdemo;

public class New_Object 
{
	String name;
	int age;
	String schoolname;
	int pincode;
	
	
	
	public New_Object(String name,int age,String schoolname,int pincode)
	{
		this.name=name;
		this.age=age;
		this.schoolname=schoolname;
		this.pincode=pincode;
				
	}
	
	public String GetName()
	{
		return name;
	}
	
	public int GetAge()
	{
		return age;
	}
	
	public String GetSchoolName()
	{
		return schoolname;
	}
	
	public int GetPincode() 
	{
		return pincode;
		
	}
	
	
	
		public static void main(String[] args) 
		{
			New_Object demo1=new New_Object("Deshan", 25, "Popes", 600314);
			System.out.println("Name:"+demo1.GetName());
			System.out.println("Age:"+demo1.GetAge());
			System.out.println("School:"+demo1.GetSchoolName());
			System.out.println("Pincode:"+demo1.GetPincode());
			
			
		}
	
}
