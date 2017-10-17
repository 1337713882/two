package com.cn.text.pr;

class A{
	
	protected void fun(String s)
	{
		System.out.println(s);
	}
	
	A()
	{
		System.out.println("A()");
	}
	
	public void printf()
	{
		System.out.println("A:printf()");
	}
	
}

public class ConstructionText extends A{
	
	ConstructionText()
	{
		System.out.println("ConstructionText()");
	}
	
	public void printf()
	{
		System.out.println("ConstructionText():printf");
	}
	
	public static void main(String[] args) {
	
		ConstructionText ct = new ConstructionText();
	}

}
