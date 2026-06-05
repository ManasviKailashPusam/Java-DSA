import java.util.Scanner;
public class Main
  {
    public static long floorSqrt(long n)
    {
      long low=1;
      long high=n;
       long ans=0;
      while(low<=high)
        {
          long mid=(low+(high-low)/2;
          if(mid<=n/mid)
          {
            ans=mid;
            low=mid+1;
          }
          else
          {
            high=mid-1;
          }
        }
    }
    return ans;
}
