class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr=new int[nums.length];
        int positiveindex=0;
        int negativeindex=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr[positiveindex]=nums[i];
                positiveindex+=2;
            }
            if(nums[i]<0){
                arr[negativeindex]=nums[i];
                negativeindex+=2;
            }
        }
        return arr;
    }
}