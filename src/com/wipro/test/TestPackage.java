package com.wipro.test;



import com.wipro.MyInterface;

public class TestPackage implements MyInterface{

public void meth(){

System.out.println("Done");
}
public static void main(String[] args){
System.out.println("in main method");
TestPackage test=new TestPackage();
test.meth();

}
}
