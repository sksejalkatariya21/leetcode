class Solution {
    public int xorOperation(int n, int start) {
        int xorNum = 0;
        for (int i=0;i<n;i++){
            xorNum  = xorNum ^ (start + 2*i);
        }
        return xorNum;
    }
}