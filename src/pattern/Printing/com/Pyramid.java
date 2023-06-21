package pattern.Printing.com;

public class Pyramid {
	 public static void main(String[] args) {
			int n=7;
			for(int j=1;j<=n;j++) 
			{
			for(int i=1;i<=n;i++) 
			{
			if(j+i==n+1 || i-j==n-1)
			   System.out.print(" * ");
		       System.out.print("  ");
		}
			 System.out.println();	 
			}
		}
}
