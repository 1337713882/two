package com.cn.arrypacket;

import java.util.*;

public class ArrayText {

	public static void main(String[] args) {
		
		List l = new LinkedList();
		
		for(int i=0;i<5;i++){
			
			l.add("a" + i);
		}
		System.out.println(l);
		l.add(3, "a100");
		System.out.println(l);
		l.set(5, "a200");
		System.out.println(l);
		System.out.println((String)l.get(2)+" ");
		System.out.println(l.indexOf("a3"));  //Î»ÖÃ
		l.remove(1);
		System.out.println(l);
		
		

	}

}
