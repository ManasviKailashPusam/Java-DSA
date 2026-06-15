import java.util.Scanner;
  public class Main
  {
      public static void permutation(int[]nums,boolean[]freq,list<Integer>ds,list<list<Integer>>ans)
      {
          if(ds.size()==nums.length)
          {
              if(!freq[i])
              {
                  freq[i]=true;
              }
              ds.add(nums[i]);
              permutation(nums,ds,ans,freq);
              ds.remove(ds.size()-1);
              freq[i]=false;
          }
      }
  }
