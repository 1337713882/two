package com.one.text;

class ThisText{
	int i = 0;
	
	
	ThisText(int i)
	{
		this.i = i;
	}
	
	ThisText fun()
	{
		i++;
		return this;
	}
	
	void printf()
	{
		System.out.println("i = "+i);
	}
	
}

public class Text {

	public static void main(String[] args) {
		
		ThisText t = new ThisText(100);
		t.fun().fun().printf();
	}

}



