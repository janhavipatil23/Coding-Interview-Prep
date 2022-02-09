class Solution{
    public int maxArea(int[] height) {
            if (null == height || height.length <= 1) {
                return 0;
            }

            int low = 0, high = height.length - 1;
            int area = 0;
            while (low < high) {
                int lowHeight = height[low];
                int highHeight = height[high];

                int curHeight = Math.min(lowHeight, highHeight);
                int curArea = (high - low) * curHeight;
                if (curArea > area) {
                    area = curArea;
                }

                if (lowHeight < highHeight) {
                    while (low < high && height[low] <= lowHeight) {
                        low++;
                    }
                } else if (lowHeight > highHeight) {
                    while (low < high && height[high] <= highHeight) {
                        high--;
                    }
                } else {
                    while (low < high && height[low] <= lowHeight) {
                        low++;
                    }
                    while (low < high && height[high] <= highHeight) {
                        high--;
                    }
                }

            }

            return area;

        }
}