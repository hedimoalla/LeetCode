
class Solution {
	public int rob(int[] nums) {
		int yes = 0;
		int no = 0;
		for (int i = 0; i < nums.length; i++){
			if(i % 2 == 0){
				yes = Math.max(yes + nums[i], no);
			} else {
				no = Math.max(yes, nums[i] + no);
			}
		}
		return Math.max(yes, no);
	}
}