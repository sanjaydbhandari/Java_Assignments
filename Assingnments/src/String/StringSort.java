package String;
import java.util.Scanner;

public class StringSort {

	static String SortTheString(String st)
	{
		char[] ch=st.toCharArray();

		for(int i=0;i<st.length();i++)//bubble sort
		{
			boolean flag=false;
			for(int j=1;j<st.length()-i;j++)
			{
				char ch1=ch[j-1]; 
				char ch2=ch[j]; 
				if(lowerCase(ch1)>lowerCase(ch2))
				{					
					swap(ch,j-1,j); 
					flag=true;
				}
			}
			if(!flag)
			{
				break;
			}
		}
		
		st="";
		for(char c:ch)
			st+=c;
		
		return st;
	}
	
	static void swap(char[] ch,int i,int j)
	{
		char temp=ch[i];
		ch[i]=ch[j]; 
		ch[j]=temp; 
	}
	
	static StringBuilder sortStringBuilder(StringBuilder sb,int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				char ch1=sb.charAt(j-1);
				char ch2=sb.charAt(j);
				if(lowerCase(ch1)>lowerCase(ch2))
				{
					String temp=sb.substring(j-1,j);
					sb.replace(j-1, j,sb.substring(j,j+1));
					sb.replace(j,j+1, temp);
				}	
			}
		}
		return sb;
	}
	
	static char lowerCase(char ch) {
		if(ch>=65 &&ch<=90)
			return (char)(ch+32);
		return ch;
	}
	
	public static void main(String[] args) {
//		using String Class
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		s=SortTheString(s);
		System.out.println("Using String:   "+s);
		
//		using String Builder
//		StringBuilder s1=new StringBuilder("");//   input in StrinBuilder
//		s1.append(sc.nextLine());
		StringBuilder s1=new StringBuilder(s);
		int n=s1.length(); 
		s1=sortStringBuilder(s1,n);
		System.out.print("Using StirngBuilder:  "+s1.toString());
		
	}
}
