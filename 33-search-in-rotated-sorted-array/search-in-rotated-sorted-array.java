class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // If target is found, return the index
            if (nums[mid] == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1; // Target lies in the left half
                } else {
                    low = mid + 1; // Target lies in the right half
                }
            } 
            // Else, the right half is sorted
            else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1; // Target lies in the right half
                } else {
                    high = mid - 1; // Target lies in the left half
                }
            }
        }

        // If target is not found, return -1
        return -1;
    }
}
