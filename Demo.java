package test;

import access_specifier.AS1;

public class Demo extends AS1 {

	public static void main(String[] args) {
		AS1 s1=new AS1(); //creat object of AS1 class
		s1.test1(); //calling public method from AS1 class
	Demo d=new Demo();
        d.Test3();  //calling protected mtd from AS1 class
        d.test1();  //calling protected mtd from AS1 class 
       //d.test2(); cant call default access specifier.
        //d.test4(); cant call private access specifier.

	}

}
