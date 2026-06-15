import java.util.Scanner;
 public class Main
 {
     public static void permutation(int index,int[]nums,list<list<Integer>>)
     {
         if(ds.size()==0)
         {
             list<Integer>ds=new ArrayList<>();
             for(int num:nums)
             {
                 ds.add(num);
             }
             ans.add(ds);
             return 
         }
         for(int i=index;i<nums.length;i++)
         {
         swap(i,index,num,ans);
         permutation(index+1,nums,ans)
         swap(i,index,nums);
         }
     }
 }
