package com.org.classdemo;

public class Demo2 implements Cloneable
{

	int rollno;
	String name;
	
	public Demo2(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Demo2 demo2=new Demo2(101, "Deshan");
		
		Demo2 demo3=(Demo2)demo2.clone(); 

		
		System.out.println(demo2.name +" "+demo2.rollno);
		System.out.println(demo3.name +" "+demo3.rollno);
	}
}
