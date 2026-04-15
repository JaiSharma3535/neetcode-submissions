class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        sub(nums,0,li,ans);
        return ans;
    }
    private void sub(int nums[],int i,List<Integer> li,List<List<Integer>> ans ){
        if(i>=nums.length){
            ans.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[i]);
        sub(nums,i+1,li,ans);
        li.remove(li.size()-1);
        sub(nums,i+1,li,ans);
    }
}
