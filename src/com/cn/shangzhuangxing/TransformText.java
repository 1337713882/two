package com.cn.shangzhuangxing;

class A{
	public String color;
	
	public A(String color)
	{
	    this.color = color;	
	}
	
}

class B extends A{
   	public String weight;
  
   	public B(String color,String weight)
   	{
   		super(color); this.weight = weight;
   	}
	
	
}


class C extends A{
   	public String weight;
  
   	public C(String color,String weight)
   	{
   		super(color); this.weight = weight;
   	}
	
	
}

public class TransformText {

	public static void main(String[] args) {
		
		A a = new A("yanse");
		B b = new B("lanse","120");
		C c= new C("hongse","110");
		
		//instanceof 判断该引用型变量是否属于该类或子类
		
		System.out.println(a instanceof A);   
		System.out.println(b instanceof A);
		System.out.println(a instanceof B);
		
		a = new B("ab","12");
		System.out.println(a.color);  //父类的对象引用子类的成员变量时，只能用其父类本身的成员。
		System.out.println(a instanceof B);
		System.out.println(a instanceof A);
		System.out.println(a instanceof C);
		
		B c1 = (B) a;
		System.out.println(c1.color);
		System.out.println(c1.weight);
		
		
		
		
		
		
		
	}

}
