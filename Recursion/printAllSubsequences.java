public class Main
 {
     public void PrintSubsequences(int n,int []a,int index,ArrayList<Integer>ds)
     {
         if(index==n)
         {
             if(ds.size()==0)
             {
                 System.out.println("{}");
             }
             else
             {
                 for(int num:ds)
                 {
                     System.out.println(num+" ");
                 }
             }
         }
         return ;
         
         //not pick
         printSubsequences(index+1,ds,a,n);
         
         //pick
         ds.add(a[index]);
           printSubsequences(index+1,ds,a,n);
           //backtrack
           ds.remove(ds.size()-1);
     }
 }
