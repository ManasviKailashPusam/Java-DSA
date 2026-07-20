import java.util.Scanner;
public class Main
{
    public static int solve(int i,int j,list<list<Integer>triangle,int []dp)
    {
        if(i==n-1)
        {
            return triangle.get(i).get(j);
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int down=triangle.get(i).get(j)+solve(i+1,j,triangle,dp);
        int dg=triangle.get(i).get(j)+solve(i+1,j+1,triangle,dp);
        return dp[i][j]=Math.max(down,dg);
    }
}
