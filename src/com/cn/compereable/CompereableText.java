package com.cn.compereable;

import java.util.*;

class Name implements Comparable{
	
	private String Firstname,Lastname;
	
	public Name(String Firstname,String Lastname){
		
		this.Firstname = Firstname;
		this.Lastname = Lastname;
		
	}
	
	public String getFirstname(){ return Firstname; }
	public String getLastname(){ return Lastname; }
	public String toString(){ return Firstname + " " + Lastname; }
	
	public boolean equals(Object obj){
		
		if(obj instanceof Name){
			
			Name name = (Name)obj;
			return (Firstname.equals(name.Firstname))&&(Lastname.equals(name.Lastname));
		}
		
		return super.equals(obj);
	}
	
	public int hascode(){
		
		return Firstname.hashCode();
	}
	
	
	public int compareTo(Object o){
		
		Name n = (Name)o;
		int lastCmp = Lastname.compareTo(n.Lastname);
		
		return (lastCmp != 0 ?lastCmp : 
			Firstname.compareTo(n.Firstname));
		
	}
	
}


public class CompereableText {

	public static void main(String[] args) { 
		
		List list  = new LinkedList();
		list.add(new Name("first1","last1"));
		list.add(new Name("mo","pk"));
		list.add(new Name("d","t"));
		list.add(new Name("n","a"));
		list.add(new Name("b","t"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		

	}

}
