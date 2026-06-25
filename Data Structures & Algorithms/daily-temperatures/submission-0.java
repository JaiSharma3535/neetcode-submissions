class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int c=1;
            int j=i+1;
            while(j<n){
                if(temperatures[j]>temperatures[i]){
                    break;
                }
                j++;c++;
            }
            c=(j==n)?0:c;
            ans[i]=c;
        }
    return ans;
    }
}
