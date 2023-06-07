package String;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	static boolean checkAnagram(String s1,String s2)
	{
		char[] arr1=s1.toCharArray(); 
		char[] arr2=s2.toCharArray(); 

		boolean flag=false;

		if(arr1.length==arr2.length)
		{
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			return Arrays.equals(arr1,arr2);
		}
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		boolean flag=checkAnagram(s1,s2);
		
		if(flag==true)
		{
			System.out.print("Anagram"); 
		}
		else
		{
			System.out.print("Not Anagram"); 
		}
	
	}

}
