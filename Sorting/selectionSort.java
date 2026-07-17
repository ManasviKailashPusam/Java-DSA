public class Main
{
  public static int selectionSort(int[]a)
  {
      for(int i=0;i<=n-1;i++)
      {
          int minIndex=i;
          for(int j=i+1;j<n;j++)
      {
          
          if(a[j]<a[minIndex])
          {
              minIndex=j;
              int temp=a[j];
              a[j]=a[miNindex];
              a[minIndex]=temp;
          }
      }
          
      }
      
  }
