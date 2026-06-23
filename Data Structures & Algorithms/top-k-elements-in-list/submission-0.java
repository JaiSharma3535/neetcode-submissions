class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[]=new int[k];
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
         PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> mp.get(b) - mp.get(a));
        pq.addAll(mp.keySet());

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }
}
