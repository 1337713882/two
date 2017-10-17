package com.one.text;

class A{
	
	public int i;
	
	public void fun()
	{
		i = 100;
		System.out.println("AµÄ"+i);
	}
}

class B extends A{
	
	public int i;
	public void fun()
	{
		super.fun();
		i = 200;
		System.out.println(i);
		System.out.println(super.i);
	}
}

public class SuperText {
    public static void main(String[] arge){
    	
    	B b = new B();
    	b.fun();

    }
}
