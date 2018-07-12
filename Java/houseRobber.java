class Solution {
    public int rob(int[] nums) 
    {
        int len = nums.length;
        int v2 = 0;
        int v1 = 0;
        
        for (int i = 0; i < len; i++)
        {
			int v;
			if (v1 > nums[i]){
				v = v1;
			}
			else {
				v = nums[i] + v2;
			}
			v2 = v1;
			v1 = v;
        }
        
        return v1;
    }
}


class Solution {
    public int rob(int[] nums) {
        int yes = 0;
        int no = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                yes = Math.max(yes + nums[i], no);
            } else {
                no = Math.max(yes, no + nums[i]);
            }
        }
        return Math.max(yes, no);
    }
}