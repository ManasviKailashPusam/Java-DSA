//check if array is sorted
import java.util.Scanner;
public class Main
{
   public static Boolean SoretdArray(int[]a) 
  {
         for(int i=1;i<n;i++)
     {
       if(a[i]>a[i-1]
      {
        return false;
       }
       
      }   
    return true;
        
       
   }
  public static void main(String[] args)
 {
   Scanner scan=new Scanner(System.in);
   System.out.println("enter the size of array:");
  int n=scan.nextInt();
   System.out.println("enter the array elements:");
  for(int i=0;i<n;i++)
  {
   a[i]=scan.nextInt();
  }
   
    boolean ans = SortedArray(a);

        System.out.println("Array is sorted: " + ans);

}
}
