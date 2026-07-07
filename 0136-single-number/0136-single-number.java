class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        int i=0;
        int j=0;
        int [] arr = new int[nums.length];
        while(i<nums.length){
            if(nums[i]==nums[j]){
                arr[i]++;

            }
            j++;
            if(j==nums.length){
                j=0;
                i++;
            }
        }
        for(int k = 0; k <nums.length; k++){
            if(arr[k]==1){
                res+=nums[k];
            }
        }
        return res;
}
}