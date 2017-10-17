package com.cn.listpacket;

import java.util.*;

public class BaseListText {

	public static void main(String[] args) {
		
		List s1 = new LinkedList();
		List s2 = new LinkedList();
		
		for(int i=0;i<=9;i++){
			
			s1.add("a"+i);
		}
		System.out.println(s1 + " ");
		
		Collections.shuffle(s1);  //��̬���� �������
		System.out.println(s1);
		
		Collections.reverse(s1);  //����
		System.out.println(s1);  
		
		Collections.sort(s1);   //��������
		System.out.println(s1);  

		System.out.println(Collections.binarySearch(s1,"a5"));
	}

}
