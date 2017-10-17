package com.cn.abstracttext;

import org.omg.Messaging.SyncScopeHelper;

abstract class A{
	protected long i = 1L;

	 void f()
	{
		System.out.println("f()");
	}
	abstract public void fun();

}

class B extends A{

	@Override
	public void fun() {
		System.out.println("fun()");
	}
	
}

public class Text {

	public static void main(String[] args) {
		B b = new B();
	    b.f();
	    b.fun();


	}

}
