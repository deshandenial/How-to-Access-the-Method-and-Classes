package com.org.classdemo;

public class NewInsance 
{
	void message(){System.out.println("Hello Java");}  
	}  
	  
	class Test{  
	 public static void main(String args[]){  
	  try{  
	  Class c=Class.forName("NewInsance");  
	  NewInsance s=(NewInsance)c.newInstance();  
	  s.message();  
	  
	  }catch(Exception e){System.out.println(e);}  
	  
	 }  

}
