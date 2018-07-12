class Solution {
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i)
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement) && map.get(complement) != i) {
				return new int [] {i, map.get(complement)};
			}
		}
		throw new IllegalArgumentException("No Two Sum Solution");
	}
	public static void main(String[] args) {
		int[] array = new int[4];
		array = {2,7,11,15};
		int target = 9;
		int[] res = twoSum(array, target);
		System.out.println("Indices that sum up to target are: " + res);
	}
}





































/*class Solution {
	public int[] twoSum(int[] nums, int target) {
	 	for(int i = 0; i < nums.length; i++){
	 		int temp = 0;
	 		temp = nums[i];
	 		for(int j = i; j < nums.length; j++){
	 			if(temp+nums[j] == target){
	 				return new int[]{i,j};
	 			}
	 		}
	 	}
	 	return null;
	}
}

// [2, 7, 11, 15]
/*
map = <(2,0),(7,1),(11,2),(15,3)>

i = 0
complement = 9 - 2 = 7
map.containsKey(7) = true

new int[] {0, 1}
*/