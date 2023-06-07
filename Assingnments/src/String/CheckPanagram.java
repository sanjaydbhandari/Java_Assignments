package String;
import java.util.Scanner;

public class CheckPanagram {
	static void checkPanagram(String s) {
		boolean letter=true;
		for(char ch='a';ch<='z';ch++)
		{
			if(!(s.contains(String.valueOf(ch))))
					{
						letter=false;
						break;
					}		
		}
		if(letter)
			System.out.print(s+" is Panagram");
		else
			System.out.print(s+" is Not Panagram");
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String temp=str;
		checkPanagram(temp.toLowerCase());
	}
}
