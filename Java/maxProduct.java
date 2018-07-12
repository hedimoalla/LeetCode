class Solution {
        public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int result = nums[0];
        int positive = 1;
        int negative = 1;
        
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (x >= 0) {
                positive = Math.max(positive * x, x);
                negative = negative * x;
            } else {
                int tmp = negative;
                negative = Math.min(positive * x, x);
                positive = tmp * x;
            }
            result = Math.max(result,positive);
            result = Math.max(result,negative);
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums;
        nums = new int[] {2,3,-2,4};
        System.out.println("Array " + Arrays.toString(nums) + " gives " + maxProduct(nums));
    }
}