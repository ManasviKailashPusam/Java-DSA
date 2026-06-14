import java.util.Scanner;
public class Main
{
    pubic void printConsequences(int index,int n,int []a,int sum,int currentSum)
    {
        if(index==n)
        {
            if(currentsum==sum)
            {
                return 1;
            }
            return 0;
            //pick
            
            currentSum=currentSum+a[index];
            int left=(printConsequences(index+1,ds,n,a,sum,currentSum));
            
            //backtrack
             currentSum=currentSum-a[index];
            
             //not pick
             int right=if(printConsequences(index+1,n,a,sum,currentSum));
            
        }
        return left+rigth;
    }
}
