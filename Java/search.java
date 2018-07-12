class Solution {
    public static int search(int[] nums, int target) {
        return search(nums, 0, nums.length-1, target);
    }
    public static int search(int[] nums, int l, int r, int target){
        if(nums.length == 0) 
            return -1;
        if(l >= r){
            if (target == nums[l]){
                return l;
            } else {
                return -1;
            }
        }
        int mid = (l + r) / 2;
        
        if(target > nums[mid]){
            if(target <= nums[r] || nums[r] < nums[mid]){
                return search(nums, mid+1, r, target);
            }
            return search(nums, l, mid-1, target);
        }
        else if(target < nums[mid]){
            if(target >= nums[l] || nums[l] > nums[mid]) { 
                return search(nums, l, mid-1, target);
            }
            return search(nums, mid+1, r, target);
        }
        else 
            return mid;
    }

    public static void main(String[] args){
        int[] nums;
        nums = new int[] {4,5,6,7,0,1,2};
        int target = 7; 
        System.out.println("Array " + Arrays.toString(nums) + " gives " + search(nums, target));
    }
}