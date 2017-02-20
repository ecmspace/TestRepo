package com.wipro;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.*;

class ABC{
	protected void finalize(){
		System.out.println("in finalize");
	}
}
public class Test {
	
	public static void main(String[] arg){
		Object v=new Vector();
		Float f1=(Float)30.1f;
		System.out.println(f1.floatValue());
		String s2="Good";
		int [] array=new int[5];
		System.out.println(s2.length());
		System.out.println(array.length);
		System.out.println(v instanceof Map);
		System.out.println(v instanceof Set);
		System.out.println(v instanceof List);
		ABC a=new ABC();
		ABC a2=new ABC();
		
	
		int s=10;
		//float s2=10.0f;
	//	System.out.println(s==s2);
		a=null;
		a2=null;
		Runtime.getRuntime().gc();
	}
}
