import java.util.Scanner;
 public class Main
 {
     public static int unionSorted(int[] a,int [] b)
     {
         int n1=a.length;
         int n2=b.length;
         TreeSet<Integer>st=new TreeSet<>();
         for(int i=0;i<n1;i++)
         {
             st.add(a[i]);
         }
         for(int j=0;i<n2;j++)
         {
             st.add(b[j]);
         }
         ArrayList<Integer>temp=new ArrayList<>();
         for(int it:st)
         {
             temp.add(it);
         }
         
         return temp;
     }
     
 }
