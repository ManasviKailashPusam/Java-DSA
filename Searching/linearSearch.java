//linear Search
public static int LinearSearch(int[]a,int num)
{
     for(int i=0;i<a.length;i++)
    {
      if(a[i]==num)
     {
       return i;
      }
    }
  return -1;
}
