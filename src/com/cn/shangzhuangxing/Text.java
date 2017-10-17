package com.cn.shangzhuangxing;

public class Text {

	public void fun(A a)
	{
		System.out.println("     color     ");
		if(a instanceof B)
		{
			B b = (B) a;
			System.out.println("bbbbbbbbbb");
		}
		else if(a instanceof C)
		{
			C c = (C) a;
			System.out.println("CCCCCCCCCCCCC");
		}
	}
	
	public static void main(String[] args) {
		
		Text t = new Text();
		
		A a = new A("color");
		B b = new B("b","12");
		C c = new C("c","123");
		t.fun(a);
		t.fun(b);
		t.fun(c);
		
		
	}

}
