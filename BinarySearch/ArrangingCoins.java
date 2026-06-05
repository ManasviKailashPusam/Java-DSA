class Solution {
    public int arrangeCoins(int n) {
      int low=1;
      int high=n;
      int ans=-1;
      while(low<=high)
      {
        int mid=(low+high)/2;
       int coins = mid * (mid + 1) / 2;
        if(coins<=n)
        {
            ans=mid;
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
      }
      return ans;
    }
}
