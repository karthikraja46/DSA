class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int firstOccurrence = firstOccurrence(nums, target);
        int lastOccurrence = lastOccurrence(nums, target);
        return new int[] { firstOccurrence, lastOccurrence };
    }

    private int firstOccurrence(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                ans = mid;
                r = mid - 1; // Move left to find earlier occurrences
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    private int lastOccurrence(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                ans = mid;
                l = mid + 1; 
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
