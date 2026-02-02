class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int c_0=0;
        int c_1=0;
        int c_2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                c_0++;
            }
            else if(nums[i]==1){
                c_1++;
            }
            else if(nums[i]==2){
                c_2++;
            }
        }
    for(int i=0;i<n;i++){
        if(i<c_0){
            nums[i]=0;
        }
        if(i>=c_0 && i<c_0+c_1){
            nums[i]=1;
        }
        if(i>=c_0+c_1){
            nums[i]=2;
        }
    }
    for(int i=0;i<n;i++){
        System.out.println(nums[i]);
    }
    
    }
}