import java.util.*;
public class SubStrings{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();//read number of test cases
		while(n-->0)
		{
			sc.nextLine();
			String ss=sc.nextLine();
			System.out.println("sending "+ss);
			cal(ss,ss.length());
		}
	}
	private static void cal(String str,int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
	}
}