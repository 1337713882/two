package com.cn.throwsandthrow;

class A {
	int i;
	public void fun() throws ArithmeticException
	{
		i = 2/0;
		throw new ArithmeticException();
		
	}
}

public class Text {

	public static void main(String[] args) {
		
       try{
    	   
    	   A a = new A();
    	   a.fun();
    	   
       }catch(ArithmeticException ex)
       {
    	   System.out.println("ArithmeticException");
    	  // ex.printStackTrace();
       }
       
	}

}
