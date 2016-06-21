package edu.ch1;

public class UniqueString {
	
	public static boolean isUnique(String s)
	{
		StringBuilder sb=new StringBuilder();
		String ss=s.trim();
		
		
		
		for (int i=0;i<ss.length();i++)
		{
			if(s.charAt(i)!=' ')
				sb.append(s.charAt(i));
		
			
		}
		
		for (int i=0;i<ss.length();i++) {
			if (sb.substring(i+1).contains(sb.substring(i, i + 1))) {
				//System.out.println(sb.substring(i + 1) + " + " + sb.substring(i, i + 1));
				return false;
			} 
		}
		return true;
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tst1=" I am will!";
		String tst2="xyz";
		
		
		System.out.println(tst1.trim());
		
		System.out.println("First: "+UniqueString.isUnique(tst1));
		System.out.println("Second: "+UniqueString.isUnique(tst2));

	}

}
