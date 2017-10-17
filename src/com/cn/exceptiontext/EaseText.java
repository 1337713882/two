package com.cn.exceptiontext;

import java.io.FileReader;


public class EaseText {

	public static void main(String[] args) throws Exception {
		
		EaseText.fum();
		
		
	/*
	   try{
			EaseText.fum();
		}
		catch(Exception ex)
		{
			System.out.println("“Ï≥£");
			
		}
	 */
		
	   
	}
	
	public static void fum() throws Exception
	{
		FileReader fr = new FileReader("D:/java/workspace\\io\\src\\in_out_put\\one\\ReadProcedure.java");
	    int ch;
	    
	    ch = fr.read();	
	    while(-1 != ch)
	    {
	    	System.out.printf("%c",ch);
	    	ch = fr.read();
	    }
	    fr.close();
	}
	
	

}
