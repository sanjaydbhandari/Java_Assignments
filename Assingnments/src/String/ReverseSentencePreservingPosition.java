package String;
import java.util.Scanner;

public class ReverseSentencePreservingPosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();

		String s1="";
		String []str=s.split(" ");

		for(int i=0;i<str.length;i++)
		{
			for(int j=str[i].length()-1;j>=0;j--)
			{
				s1=s1+(char)(str[i].charAt(j));
			}
			s1+=" ";
		}
		System.out.println(s1); 

	}

}
