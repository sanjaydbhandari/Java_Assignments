package String;
import java.util.Scanner;

public class repOccurCharacter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		
//		System.out.println("Repeated Occuring Character: ");
//		for(int i=0;i<s.length();i++)
//		{
//			for(int j=i+1;j<s.length();j++)
//			{
//				if(ch[i]==ch[j])
//				{
//					System.out.print(ch[i]);
//				}
//			}
//		}
		
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[j]=='0')
					continue;
				if(ch[j]==ch[i])
				{
					count++;
					ch[j]='0';
				}		
			}	
			if(count>1)
			{
				System.out.print(ch[i]+" ");
			}
			
		}
		
				
	}
}
