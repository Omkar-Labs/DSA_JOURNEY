class Solution {
    public int majorityElement(int[] nums) {
        int occur = nums.length / 2;
        int []count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count[i] = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count[i]++;
                }
            }
            if (count[i] > occur) {
                occur= nums[i];
                break;
            }
        }
    return occur;
    }
}