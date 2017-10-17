package com.cn.obj;

class A{
	int a,b,c;
	
	public A(int a,int b,int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean equals(Object obj)
	{
		if(obj == null) return false;
		
		else
		{
			if(obj instanceof A)
			{
				A a3 = (A)obj;
				if(a3.a == this.a && a3.b == this.b && a3.c == this.c)
				return true;
			}
		}
		
		return false;
		
	}
	
}

public class EqualText {

	public static void main(String[] args) {
		A a1 = new A(1,2,3);
		A a2 = new A(1,2,3);
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		
		String s1 = new String("beauty");
		String s2 = new String("beauty");
	
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
