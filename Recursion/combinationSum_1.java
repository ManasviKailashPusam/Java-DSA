 import java.util.Scanner;
 public class Main
 {
     public static void combinationSum(int index,int []a,int target,list<Integer>ds,list<list<Integer>>ans,)
     {
         if(index==n)
         {
             if(target==0)
             {
                 ans.add(ArrayList<>(ds));
             }
         }
         return ;
         if(a[i]>target)
         {
         a.add(a[index]);
         combinationSum(index,target-a[],ds,ans);
         
         a.remove(a.size()-1);
         combinationSum(index+1,target,a[],ds,ans);
         }
         
         
         
     }
 }
