package com.cn.throwsandthrow;

import java.io.CharConversionException;
import java.io.IOException;

public class Texttwo {

	public void fun1() throws IOException
	{
		System.out.println("fun1()  throws");
		fun2();
	}
	
	public void fun2() throws CharConversionException
	{
		System.out.println("fun2()  throws ");
		fun3();
	}
	
	public void fun3()
	{
		System.out.println("fun3()    throw");
		throw new ArithmeticException();
		
	}
	
	public static void main(String[] args) {
		
		Texttwo t = new Texttwo();
		try{
			
		    t.fun1();
		    
		}catch(ArithmeticException e1)
		{
			System.out.println("fun1()");
		}
		catch(CharConversionException e2)
		{
			System.out.println("fun2()");
		}
		catch(IOException e3)
		{
			System.out.println("fun3()");
		}
	}

}
