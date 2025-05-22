class Solution {
    public void moveZeroes(int[] nums) {
        int insertpos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[insertpos]=nums[i];
                insertpos++;
            }
        }
        for(int j=insertpos;j<nums.length;j++){
            nums[j]=0;
        }
    }
}
