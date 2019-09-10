package com.org.classdemo;

public class Demo3 
{
public static void main(String[] args) throws ClassNotFoundException 
{
	
	Class clls=Class.forName("java.lang.ClassLoader");
	System.out.println("Name of Class:\t"+clls.getName());
	System.out.println("Name of Package:\t"+clls.getPackage());
	System.out.println("Name of Constructor:\t"+clls.getConstructors());
	System.out.println("Name of Classes:\t"+clls.getClasses());
	}
}
