package com.one.text;

class AA{
	public int i;
	
	AA()
	{
		System.out.println("A无参");
	}
	
	AA(int i)
	{
		System.out.println("A有参");
		this.i = i;
	}
}


class BB extends AA{
	public int i;
	
	BB()
	{
		System.out.println("B无参");
	}
	BB(int i)
	{
		super(100);
		System.out.println("B有参");
		this.i = i;
	}
	
	
	
}

public class ConstructionSuperText {
    public static void main(String[] args){
    	
    	BB b = new BB(100);
    	
    	
    	
    	
    	
    	
    }
}
