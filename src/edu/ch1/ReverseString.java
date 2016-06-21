package edu.ch1;

public class ReverseString {
	
	public static String reverse(String s)
	{
		StringBuilder sb=new StringBuilder(s);
		
		return sb.reverse().toString();
	 
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt1="I am the best!";
		System.out.println(ReverseString.reverse(txt1));

	}

}
