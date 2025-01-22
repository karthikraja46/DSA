class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = nums.length-1;

        while(l<r){
            int mid = (l+r)/2;
            if(mid % 2 == 1 && nums[mid] == nums[mid-1] || (mid %2 == 0 && nums[mid] == nums[mid+1])){
                l = mid+1;

            } else{
                r = mid;

            }
        }


        return nums[l];
        
    }
}