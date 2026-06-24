class Solution {
    public int longestConsecutive(int[] nums) {
        int ans=0;
        HashSet<Integer> st=new HashSet<>();
        for(int num:nums){
            st.add(num);
        }
        for(int num:nums){
            int c=0,curr=num;
            while(st.contains(curr)){
                c++;
                curr++;
            }
            ans=Math.max(ans,c);
        }
        return ans;
    }
}
