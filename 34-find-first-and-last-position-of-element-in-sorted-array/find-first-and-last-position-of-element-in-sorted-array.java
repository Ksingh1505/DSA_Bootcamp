
class Solution {
    public int[] searchRange(int[] nums, int target) {
        //binary search
        int n=nums.length;
        int fi=-1;
        int li=-1;
        int low=0;
        int high=n-1;
        //first while loop for first element
        while(low<=high){
            int mid=(low + high)/2;
            if(nums[mid]>target){
                //left
                high=mid - 1;
            }
            else if(nums[mid]<target){
                low = mid + 1;
            }
            else {
                
                fi=mid;
                high = mid - 1; //left
            }
        }
        low  = 0;
        high = n - 1;

        while(low<=high){
            int mid=(low + high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                //for last index go right
                li=mid;
                low = mid + 1;
            }
        }
        return new int[]{fi,li};
    }
}
       
        