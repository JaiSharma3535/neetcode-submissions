class Solution {
    int arr[];
    public int rob(int[] nums) {
        arr=new int[nums.length];
        Arrays.fill(arr,-1);
        return rb(nums,0,arr);
    }
    private int rb (int nums[],int i,int arr[]){
        if(i>=nums.length){
            return 0;
        }
        if(arr[i]!=-1) return arr[i];
        int r=nums[i]+rb(nums,i+2,arr);
        int s=rb(nums,i+1,arr);
        arr[i]=Math.max(r,s);
        return arr[i];
    }
}
