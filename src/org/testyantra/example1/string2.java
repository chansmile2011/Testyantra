package org.testyantra.example1;

public class string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		String x="java developer";
		String s2="developer";
		String s3=s1+2;
		String s4="java developer";
	//	System.out.println(s3==s4);
		
		String s5="java "+"developer";
		System.out.println(s5);
		
		System.out.println(s4==s5); 
		
		System.out.println(s1.length());
		String s6="";  // don't use null --- No object created
		System.out.println(s6.isEmpty());
		
		char hh=s1.charAt(2);
		System.out.println(hh);
		//reverse
		
	String rev="";
	int len=s1.length();
	
	for(int i=len-1;i>=0;i--)
	{
		
		rev=rev+s1.charAt(i);
		
		
	}
		
	System.out.println(rev);
	
		//convert string to array
	char[] ch=s1.toCharArray();
	int ll=ch.length;
	
	for(int i=0;i<ll;i++)
	{
	
		System.out.println(ch[i]);
		
	}
	
	int i=10;
	int j=20;
	
	String ss=String.valueOf(i);
	System.out.println(ss);
	String ss1=String.valueOf(j);
String	ss2=ss+ss1;
System.out.println(ss2);

//merge strings

String ss3=s1+s2;

	System.out.println(ss3);
	//display the index
	String ss4=s1.substring(2);
	
	System.out.println(ss4);
	
	//check the contains method.. sequence
	
	boolean ss5=s1.contains("jav");
		
	System.out.println(ss5);
	
	String z="welcome to bangalore";
	
	String[] arr=z.split(" ");
	
	int len1=arr.length;
	System.out.println(len1);
		
	for(int j1=0;j1<=len1-1;j1++)
	{
		
		System.out.println(arr[j1]);
	}
	
	


}
}
