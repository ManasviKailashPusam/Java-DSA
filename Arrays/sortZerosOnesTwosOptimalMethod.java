import java.util.Scanner;
 public class Main
 {
     public static void main(String[] args)
     {
         Scanner scan=new Scanner(System.in);
         
         System.out.println("enter the size of array:");
          int n=scan.nextInt();
          int []a=new int[n];
          System.out.println("enter  the array elements:");
          for(int i=0;i<n;i++)
          {
              a[i]=scan.nextInt();
          }
          int low=0;
          int high=n-1;
          while(low<=high)
          {
              if(a[mid]==0)
              {
                  int temp=a[low];
                  a[low]=a[mid];
                  a[mid]=temp;
                  low++;
                  mid++;
              }
              else if(a[mid]==1)
              {
                  mid++;
              }
              else if(a[mid]==2)
              {
                  int temp=a[mid];
                  a[mid]=a[high];
                  a[high]=temp;
                  high--;
              }
          }
     }
 }
