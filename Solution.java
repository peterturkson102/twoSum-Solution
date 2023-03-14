class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int a=i+1;a<nums.length;a++){
                if(nums[i]+nums[a]==target){
                    result[0]=i;
                    result[1]=a;
                }
            }
        }
        return result;
    }
}
