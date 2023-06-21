package pattern.Printing.com;

public class VertiLine {
	public static void main(String[] args) {
	    int n=5;
	for(int j=1;j<=n;j++) 
	{
	for(int i=1;i<=n;i++) 
	{
	if(i==1 || j==1 || i==j )
	   System.out.print(" *");
	else
	System.out.print("  ");
}
	 System.out.println();	 
	}

}
}
