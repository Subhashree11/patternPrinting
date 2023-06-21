package pattern.Printing.com;

public class SpaceStar {
	public static void main(String[] args) {
		int n=7;
		for(int j=1;j<=n;j++) 
		{
		for(int i=1;i<=n;i++) 
		{
		if(i==j || i+j!=n+1)
		   System.out.print("  ");
		else
		System.out.print(" * ");
	}
		 System.out.println();	 
		}
	  }
}
