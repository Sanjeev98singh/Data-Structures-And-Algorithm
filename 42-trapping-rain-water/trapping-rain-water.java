class Solution {
    public int trap(int[] height) {
         int totalWater = 0;

        for (int i = 0; i < height.length; i++) {
            int leftMax = 0, rightMax = 0;
            for (int j = i; j >= 0; j--) {
                leftMax = Math.max(leftMax, height[j]);
            }
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            
            totalWater += Math.min(leftMax, rightMax) - height[i];
        }

        return totalWater;
    }
}