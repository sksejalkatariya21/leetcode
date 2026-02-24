class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int [] pre = new int[arr.length];
        int [] ans = new int[queries.length];

        int curr = 0;
        for(int i=0;i<arr.length;i++){
            curr = curr ^ arr[i];
            pre[i] = curr;   
        }
        for(int j=0;j<queries.length;j++){
            int start = queries[j][0];
            int end = queries[j][1];
            if(start == 0){
                ans[j] = pre[end];
            }else{
            int currAns =  pre[end] ^ pre[start-1];
            ans[j] = currAns;
          }
        }
        return ans;
    }
}