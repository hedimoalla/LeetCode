import java.util.*;
import java.util.Arrays;

class maxSubArray {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++){
            if(nums[i] + nums [i-1] > nums[i]){
                nums[i] += nums[i-1];
            }
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int [] arr = new int [] {-2,1,-3,4,-1,2,1,-5,4};
        int [] initialArray = new int [] {-2,1,-3,4,-1,2,1,-5,4};
        int max = maxSubArray(arr);
        System.out.println("The sum of max subarray of " + Arrays.toString(initialArray) + " is " + max);
        System.out.println("The new Array looks like:  " + Arrays.toString(arr));
    }
}

/*class Solution {
    public int maxSubArray(int[] nums) {
		int maxSubarray = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if(nums[i] + nums[i - 1] > nums[i]) {
				nums[i] += nums[i - 1];
			}
			if (nums[i] > maxSubarray) {
				maxSubarray = nums[i];
			}
			
		}
        return maxSubarray;
    }
}

/*
subSum = subSum+nums[i] > nums[i]? subSum+nums[i] : nums[i];
if (subSum+nums[i] > nums[i]){
	subSum += nums[i];
}else
	subsum = nums[i];*/