package Pattern;

public class Telusko {
  public static void main(String[] args) {
    int n=6;

    for(int i=0;i<n;i++)//T
    {
      for(int j=0;j<n;j++)
      {
        if(i==0 || j==(n-1)/2)
          System.out.print("*");
        else 
          System.out.print(" ");
      }
      System.out.print(" ");


      for(int j=0;j<n;j++)//E
      {
        if(i==0 || i==(n-1)/2 || i==n-1 || j==0)
          System.out.print("*");
        else 
          System.out.print(" ");
      }
      System.out.print(" ");

      
      for(int j=0;j<n;j++)//L
      {
        if(j==0 || i==(n-1))
          System.out.print("*");
        else 
          System.out.print(" ");
      }
      System.out.print(" ");
      
      
      for(int j=0;j<n;j++)//U
      {
        if(j==0 && i!=n-1 || i==n-1 && j!=0 && j!=n-1|| j==n-1 && i!=n-1)
          System.out.print("*");
        else 
          System.out.print(" ");
      }
      System.out.print(" ");
      


      // for(int j=0;j<n;j++)//R
      // {
      //   if(j==0 || i==0 && j!=n-1 || i==(n-1)/2 && j!=n-1 || j==n-1 && i!=0 && i!=(n-1)/2 && i<(n-1)/2 || i>(n-1)/2 && i==j)
      //     System.out.print("*");
      //   else 
      //     System.out.print(" ");
      // }
      // System.out.print(" ");

      for(int j=0;j<n;j++)//S
      {
        if(i==0|| i==(n-1)/2 || i==n-1|| j==0 && i<=(n-1)/2 || j==n-1 && i>=(n-1)/2)
          System.out.print("*");
        else 
          System.out.print(" ");
      }
      System.out.print(" ");
      

      for(int j=0;j<n;j++)//K
      {
        if(j==0 || i+j==n/2+1 || i-j==n/2-1) 
          System.out.print("*");
        else 
          System.out.print(" ");
      }
      System.out.print(" ");
      

      for(int j=0;j<n;j++)//O
      {
        if(i==0 && j!=0 && j!=n-1||i==n-1 && j!=0 && j!=n-1 || j==0 && i!=0 && i!=n-1 || j==n-1 && i!=0 && i!=n-1 )
          System.out.print("*");
        else 
          System.out.print(" ");
      }
      System.out.println();



     

    }
  }
}
