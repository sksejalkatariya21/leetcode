class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> freqOne = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(freqOne.containsKey(nums[i])){
                freqOne.put(nums[i],freqOne.get(nums[i])+1);
            }else{
            freqOne.put(nums[i],1);
        }
        }
        for(Map.Entry<Integer, Integer> entry : freqOne.entrySet() ){
            if(entry.getValue().equals(1)){
                return entry.getKey();
            }
        }
        return 0;
    }
}