import java.util.Scanner;
public class Main
{
    pubic void printConsequences(int index,ArrayList<Integer>ds,int n,int []a,int sum,int currentSum)
    {
        if(index==n)
        {
            if(currentsum==sum)
            {
                return;
            }
            //pick
            ds.add(a[index]);
            currentSum=currentSum+a[index];
            printConsequences(index+1,ds,n,a,sum,currentSum);
            
            //backtrack
             currentSum=currentSum-a[index];
             ds.remove(a[index]);
             //not pick
             printConsequences(index+1,ds,n,a,sum,currentSum);
        }
    }
}
