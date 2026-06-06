//find the maximum consecutive ones
 static int maxConsecutiveOnes(int[]a)
{

      int count=0;
    int maxcount=0;
    for(int i=0;i<a.length;i++)
  {
     if(a[i]==1)
    {
      count++;
    maxcount=Math.max(maxcount,count);
    }
    else
    {
      count=0;
     }
   }



  return maxcount;
}
