package String;
import java.util.Scanner;
public class VowelConsonent {

	static void checkVowelsAndConsonants(String s) {
		int vowels=0;
		int consonants=0;
		for(int i=0;i<s.length();i++)
		{
			char ch= s.charAt(i);
			if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vowels++;
			}
			else if(ch>='a' && ch<='z')
			{
				consonants++;
			}
		}
		System.out.println("vowels count: "+vowels);
		System.out.println("consonants count: "+consonants);

	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		s=s.toLowerCase();
		checkVowelsAndConsonants(s);
	}

}
