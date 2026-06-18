class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int weight:weights)
        {
            low=Math.max(weight,low);
            high=weight+high;
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int requiredDays=findDays(weights,mid);
            if(requiredDays<=days)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
    static int findDays(int[]weights,int capacity)
    {
        int days=1;
        int load=0;
        for(int weight:weights)
        {
            if(load+weight>capacity)
            {
                days++;
                load=weight;
            }
            else
            {
                load=load+weight;
            }
        }
        return days;
    }
}
