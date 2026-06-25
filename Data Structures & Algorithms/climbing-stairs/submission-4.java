public class Solution {
    int arr[];
    public int climbStairs(int n) {
        arr = new int[n];
       
           Arrays.fill(arr,-1);
        
        return dfs(n, 0);
    }

    public int dfs(int n, int i) {
     if(i==n) return 1;
     if(i>n) return 0;
        if (arr[i] != -1) return arr[i];
        return arr[i] = dfs(n, i + 1) + dfs(n, i + 2);
    }
}