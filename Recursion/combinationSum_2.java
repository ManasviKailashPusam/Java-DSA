import java.util.Scanner;
 public class Main
 {
     public static Void combinationSum(int index,int target,int []a,list<Integer>ds,list<list<Integer>>ans)
     {
         if(index==n)
         {
             if(target==0)
             {
                 ans.add(ArrayList<>(ds));
                 
             }
         }
         return ;
         if(i>index  &&  a[i]==a[i-1])
         {
             continue;
             
             if(a[i]>target)
             {
                 break;
             }
             ds.add(a[index]);
             combinationSum(index+1,target-a[i],ds,ans);
             ds.remove(a.size()-1);
         }
         
     }
 }
