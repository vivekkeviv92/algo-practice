import java.util.Scanner;


public class min_step_to_1 {
	public static int min(int a, int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	public static void main(String args[])
	{
	int n;
	Scanner input = new Scanner (System.in);
	n=input.nextInt();
	int dp[]=new int[n+1];
	dp[1]=0;
	for(int i=2;i<=n;i++)
	{
		dp[i]=1+dp[i-1];
		if(dp[i]%2==0)
			dp[i]=min(dp[i],1+dp[i]/2);
		if(dp[i]%3==0)
			dp[i]=min(dp[i],1+dp[i]/3);
	}
	System.out.println(dp[n]);
	}
}
