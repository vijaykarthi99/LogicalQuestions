package logicalQus;

import java.util.ArrayList;

public class SwapString {
	static String a = "Java Selenium";
	static String b = "Python Seleninum";

	public static void main(String[] args) {
		// SwapString ss=new SwapString();
		// System.out.println(ss.a);
		// System.out.println(ss.b);

		a = a + b;
		System.out.println(a);
		b = a.substring(0, a.length() - b.length());
		System.out.println(b);
		a = a.substring(b.length());
		System.out.println(a);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(a);
		System.out.println(b);
		System.out.println("***************************");

		String op = " ";

		String[] split = a.split(op);
		
		for (String sp : split) {
			String rev=" ";
			for (int i = sp.length() - 1; i >= 0; i--) {

				rev = rev + sp.charAt(i);
			}
			op = op + rev + " ";

		}
		System.out.println(op);
System.out.println("***********************");
	String s= "VijaymaniGanesan";
	String output ="";
	for (int i = s.length()-1; i >= 0; i--) {
		char c = s.charAt(i);
		
		output= output+c;
		}
	System.out.println(output);
	
	

	if(s='a'|| s='e'||s='i'||s='o'||s='u') {
		
	}
	else (s=='a') {
		
	}
		
	
		System.out.println();



	





	}

}
