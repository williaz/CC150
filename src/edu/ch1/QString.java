package edu.ch1;

import java.util.Arrays;
import java.util.HashSet;

public class QString {
	public static boolean isPermutation(String s1, String s2)//1.3
	{
	
		HashSet<Character> hs=new HashSet<Character>();
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		String sb1=new String(c1);
		String sb2=new String(c2);
		
		if(sb1.equals(sb2))
			return true;
		else
			return false;
		
	}
	
	public static char[] replaceSpace(char[] cArr, int len)//1.4
	{
		char[] cCopy=new char[len+13];
		
		for(int i=0,j=0;i<len;i++,j++)
		{
			if (j==len+13)
				break;
			
			if (cArr[i]==' ')
			{
				cCopy[j]='%';
				cCopy[j+1]='2';
				cCopy[j+2]='0';
				
				j+=2;
				
				
			}
			else
			{
				cCopy[j]=cArr[i];
				
			}
			
			
				
			
		}
		
		
		return cCopy;
		
		
	}
	
	
	public static String compressString(String s)//1.5
	{
		char cc=s.charAt(0);
		int num=1;
		StringBuilder sb=new StringBuilder();
		
		for(int i=1;i<s.length();i++)
		{
			
			if (cc!=s.charAt(i))
			{
				sb.append(cc);
				sb.append(num);
				cc=s.charAt(i);
				num=1;
			}
			else 
			{
				num++;

			}
			
			if(i==s.length()-1)
			{
				
				sb.append(cc);
				sb.append(num);
				
			}
			
			
				
			
			
		}
		
		if (sb.toString().length()<s.length())
			return sb.toString();
		else
			return s;
		
		
		
	}
	
	//1.6
	public static int[][] rotateMatrix(int[][]mtx, int n)
	{
		int[][] mCopy=new int[n][n];
		
		for (int i=0;i<n;i++)
			for (int j=0;j<n;j++)
			{
				mCopy[i][j]=mtx[j][n-1-i];

			}
		
		
		return mCopy;
		
	}
	
	//1.7
	
	public static int[][] zeroMatrix(int [][]mtx,int m, int n)
	{
		HashSet<Integer> zeroRow=new HashSet<Integer>();
		HashSet<Integer> zeroCol=new HashSet<Integer>();
		
		for (int i=0;i<m;i++)
			for (int j=0;j<n;j++)
			{
				if (mtx[i][j]==0)
				{
					zeroRow.add(i);
					zeroCol.add(j);
					
					
				}

			}
		
		int[][] mm=new int[m][n];
		
		for (int i=0;i<m;i++)
			for (int j=0;j<n;j++)
			{
				if(zeroRow.contains(i)||zeroCol.contains(j))
					mm[i][j]=0;
				else
					mm[i][j]=mtx[i][j];

			}
		
		return mm;
		
		
	}
	
	//1.8
	public static boolean isRotation(String sub,String ss)
	{
		StringBuilder sb=new StringBuilder(ss+ss+ss);
		
		if (ss.length()==sub.length()&&sb.toString().contains(sub))//contains() ==isSubstring()
			return true;
		else
			return false;
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String txt1="zxy xz";
		String txt2="xyz zx";
		String txt3="  xyzz";*/
		
		//System.out.println(QString.isPermutation(txt1,txt3));
		
		//String c1="Mr John Smith    ";
		//System.out.println(QString.replaceSpace(c1.toCharArray(), 13));
		
		/*String ts="aaaahhhekkssaaa";
		String ts2="aassab";
		System.out.println(QString.compressString(ts));*/
		
		/*int[][]m={{3,2,1},
				  {6,5,4},
				  {9,8,7}};
		int[][]mm=QString.rotateMatrix(m, 3);
		int n=3;
		for (int i=0;i<n;i++)
			for (int j=0;j<n;j++)
			{
				System.out.printf("%d %s",mm[i][j],(j==n-1?"\n":" "));
				
			}*/
		
		/*int[][]mtx={{3,2,1,2},
				    {6,5,0,4},
				    {9,0,8,7}};
		int m=3, n=4;
		int[][]mm=QString.zeroMatrix(mtx, m, n);
		
		for (int i=0;i<m;i++)
			for (int j=0;j<n;j++)
			{
				System.out.printf("%d %s",mm[i][j],(j==n-1?"\n":" "));
				
			}*/
		
		String ss="waterbottle";
		String sub="erbottlewat";
		String sub1="bottlewat";
		
		System.out.println(QString.isRotation(sub1, ss));
		
		
		

	}

}
