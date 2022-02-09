class Solution(object):
    def trap(self, height):
        
        # edge case
        n = len(height)
        if n < 3:
            return 0

        result = 0 
        left, right = 1, n-1
        left_max = height[0]
        right_max = height[n-1]

        while left <= right:
            if left_max <= right_max:
                left_max = max(left_max, height[left])
                result += left_max - height[left]
                left += 1
            else:
                right_max = max(right_max, height[right])
                result += right_max - height[right]
                right -= 1

        return result