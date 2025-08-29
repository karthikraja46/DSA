class Solution:
    def maxSubArray(self, nums):
        n = len(nums)
        total = 0
        max_sum = nums[0]

        for i in range(n):
            total += nums[i]
            if total > max_sum:
                max_sum = total
            if total < 0:
                total = 0

        return max_sum
