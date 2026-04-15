class Solution {
        List<List<Integer>> ans = new ArrayList<>();
    ArrayList<Integer> li=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] c, int target) {
        cum(c, target, 0);
        return ans;
    }
    public void cum(int[] c, int target, int start) {
        if (target == 0) {
            ans.add(new ArrayList<>(li)); 
            return;
        }
        if(target<0||start>=c.length) return;
        li.add(c[start]);
        cum(c,target-c[start],start);
        li.remove(li.size()-1);
        cum(c,target,start+1);
    }
}