package test;

import access_specifier.AS3; //import the access_specifier class AS3.

public class Demo2 
{

	public static void main(String[] args) 
	{
		AS3 s3=new AS3(); //creat obj in different package
		s3.std2();     ///call mtd in diferent package so we can call only public mtd.
      System.out.println("this msg only practice for gitbash"); 
      
	}
}


