class Solution {
    public int missingNumber(int[] nums) {
        int missingNum = 0;
        int xor = 0;

        for(int i=0;i<=nums.length;i++){
            xor^=i;
        }
        for(int i=0;i<nums.length;i++){
            missingNum = missingNum ^ nums[i];
        }
        return xor ^ missingNum;
    }
}