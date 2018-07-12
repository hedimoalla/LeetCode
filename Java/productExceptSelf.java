class Solution {
    public static int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0, tmp = 1; i < nums.length; i++) {
            result[i] = tmp;
            tmp *= nums[i];
            System.out.println(result[i]);
        }
        for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
            result[i] *= tmp;
            tmp *= nums[i];
        }
        return result;
    }
    
    public static void main(String[] args){
        
        int[] nums;
        nums = new int[] {1,2,3,4};
        int[] array = productExceptSelf(nums);
        for(int i = 0; i < array.length; i++){
            System.out.println("Array element " + (i+1) + " is : " + array[i]);
        }
    }
}
/*
Input:  [1,2,3,4]
i = 0 -> nums[i] = 1
tmp = 1
result[0] = 1
tmp = tmp * 1 = 1 * 1 = 1

i = 1 -> nums[1] = 2
tmp = 1
result[1] = 1
tmp = tmp * nums[1] = 1 * 2 = 2

i = 2 -> nums[2] = 3
tmp = 2
result[2] = 2
tmp = tmp * nums[2] = 2 * 3 = 6

i = 3 -> nums[3] = 4
tmp = 6
result[3] = 6
tmp = tmp * nums[3] = 6 * 4 = 24

result = [0,0,0,0]
result = [1,0,0,0]
result = [1,1,0,0]
result = [1,1,2,0]
result = [1,1,2,6]

i = 3 : tmp = 1
result[3] = 6 * 1 = 6
tmp = tmp * nums[3] = 1 * 4 = 4

i = 2
result[2] = 2 * 4 = 8
tmp = tmp * nums[2] = 4 * 3 = 12

i = 1
result[1] = 1 * 12 = 12
tmp = tmp * nums[1] = 12 * 2 = 24

i = 0  
result[0] = 1 * 24 = 24
tmp = tmp * nums[0] = 24 * 1 = 24
Output: [24,12,8,6]

*/