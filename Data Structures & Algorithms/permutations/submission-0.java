class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length==0) return Arrays.asList(new ArrayList<>());
        List<List<Integer>> li=permute(Arrays.copyOfRange(nums,1,nums.length));
        List<List<Integer>> ans=new ArrayList<>();
        for(List<Integer> p:li){
            for(int i=0;i<=p.size();i++){
                List<Integer> copy=new ArrayList<>(p);
                copy.add(i,nums[0]);
                ans.add(copy);
            }
        }
        return ans;
    }
}
