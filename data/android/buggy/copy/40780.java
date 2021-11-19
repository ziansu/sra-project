public int findMin(int[] nums) {
    int min = nums[0];
    for (int n : nums) {
        if (n < min) {
            min = java.lang.Math.min(n, min);
        }
    }
    return min;
}