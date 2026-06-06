static int moveZeros(int[]a)
{
    //   optimal solution moveZeros
      int j=-1;
     for(int i=0;i<a.length;i++)
    {
     if(a[i]==0)
    {
      j=i;
      break;
     }
    }
    if(j==-1)
   {
    return 0;
   }
   for(int i=j+1;i<a.length;i++)
  {
    if(a[i]!=0)
  {
     //swap
   int temp=a[i];
   a[i]=a[j];
   a[j]=temp;
   j++;
  }

  }
}
