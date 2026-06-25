class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            Set<Character> st=new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(st.contains(s.charAt(j))){
                    break;
                }
              st.add(s.charAt(j));
            }
            ans=Math.max(ans,st.size());
        }
        return ans;
    }
}
