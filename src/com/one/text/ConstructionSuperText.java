package com.one.text;

class AA{
	public int i;
	
	AA()
	{
		System.out.println("A�޲�");
	}
	
	AA(int i)
	{
		System.out.println("A�в�");
		this.i = i;
	}
}


class BB extends AA{
	public int i;
	
	BB()
	{
		System.out.println("B�޲�");
	}
	BB(int i)
	{
		super(100);
		System.out.println("B�в�");
		this.i = i;
	}
	
	
	
}

public class ConstructionSuperText {
    public static void main(String[] args){
    	
    	BB b = new BB(100);
    	
    	
    	
    	
    	
    	
    }
}
