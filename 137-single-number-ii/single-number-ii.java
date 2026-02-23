class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0;i<32;i++){
            int count0 = 0;
            int count1 = 0;
            for(int j=0;j<nums.length;j++){
                boolean bit = (nums[j]&(1<<i)) == 0;
                if(bit){
                    count0 ++;
                }
                else{
                    count1 ++;
                }
            }
            if(count1 % 3 != 0){
                 ans |= (1 << i);
            }
        }
        return ans;
    }
}