class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        left = 0
        right = 0

        n = len(nums)

        while right < n:
            if nums[right] != 0:
                nums[right], nums[left] = nums[left], nums[right]
                left += 1
            right += 1
        