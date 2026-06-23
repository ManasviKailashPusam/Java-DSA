 import java.util.Scanner;
 public class Main
 {
     public static int []maximumSlidingWindow(int[]nums,int k)
     {
         int n=nums.length;
         int []ans=new int[n-k+1];
          deque<Integer>dq=new ArrayDeque<>();
          int index=0;
          for(int i=0;i<n;i++)
          {
              while(!ds.isEmpty()   &&  dq.peekFirst()<=i-k)
              {
                  dq.pollFirst;
              }
              while(!ds.isEmpty()   &&  nums[dq.peekLast()]<=nums[i])
              {
                  dq.pollLast;
              }
              dq.offerLast(i);
              
              
          }
          //window formed
          if(i>=k-1)
          {
              ans[index++]=nums[dq.peekFirst()];
          }
          return ans;
     }
 }
