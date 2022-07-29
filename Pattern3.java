package Pattern;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;//n-1/2=6
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j>=n+(n-1)/2 || i-j>=(n-1)/2+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
