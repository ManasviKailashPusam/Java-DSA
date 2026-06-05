//how to reverse an array//
public Class Main
{
public static void reverseArray(int[]a,int i,int j)
{
      int i=0;
      int j=a.length-1;
   while(i<j)
   {
   int temp=a[i];
   a[i]=a[j];
   a[j]=temp; 
   
   i++;
   j--;
   }
}
publi static void main(String[] args)
 {
    Scanner scan=new Scanner(System.in);
     
   System.out.println("enter the size of array:");
   int n=scan.nextInt();
   int []a=new int[n];
    for(int i=0;i<n;i++)
   {
     a[i]=scan.nextInt();
    }
     reverseArray(a, 0, n - 1);

        System.out.println("Reversed array is:");
        for (int num : a) {
            System.out.print(num + " ");
        }

}
}
