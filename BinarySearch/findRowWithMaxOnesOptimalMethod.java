import java.util.Scanner;
public class Main
{
public static int FirstOnes(int[][]a,int n,int m)
{
      int low=0;
      int high=m-1;
      int ans=m;
    while(low<=high)
   {
     int mid=(low+high)/2;
     if(a[mid]==1)
    {
       ans=mid;
       high=mid-1;
      
     }
   else
   {
    low=mid+1;
    }
   }
  return ans;

}
 public static findRowWithMaxOnes(int[][]a)
{  
   int ansRow=-1;
   int maxCount=0;
   
   for(int i=0;i<n;i++)
   {
     int index=firstOnes(a[i],m);
     int ones=m-index; 
      if(ones>maxCount)
     {
       maxCount=ones;
       ansRow=i;
     } 
     }
    return ansRow;

  
} 
} 
 
      
