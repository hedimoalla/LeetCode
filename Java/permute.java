class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        return permute(new ArrayList<>(), nums);
    }
    
    public static List<List<Integer>> permute(List<Integer> prefix, int[] nums){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (prefix.size() == nums.length){
            result.add(prefix);
            return result;
    }
        
        for (int i=0; i<nums.length; i++){
            if(prefix.contains(nums[i])) continue;
            List<Integer> newPrefix = new ArrayList<>(prefix);
            newPrefix.add(nums[i]);
            result.addAll(permute(newPrefix, nums));
        }
        return result;
    } 

    public static void main(String[] args){
        int[] nums;
        nums = new int[] {1,2,3};
        List<List<Integer>> list = permute(nums);
        System.out.println("Array " + Arrays.toString(nums) + " gives " + list);
          
    }  
}