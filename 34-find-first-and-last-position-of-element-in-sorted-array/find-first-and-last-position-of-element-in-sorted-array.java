class Solution {
    public int[] searchRange(int[] nums, int target) {

        int firstOcc = firstOccurance(nums,target);
        int lastOcc = lastOccurance(nums,target);
        int [] ans = new int[2];
        ans[0] = firstOcc;
        ans[1] = lastOcc;
        return ans;
            
    }
    private int firstOccurance(int[] numsArray, int targetValue){
        int l=0;
        int h=numsArray.length-1;
        int first = -1;
         while(l<=h){
            int m = l+(h-l)/2;
            if(numsArray[m] == targetValue){
                first = m;
                h=m-1;
            }else if(targetValue>numsArray[m]){
                l = m+1;
            }else{
                h = m-1;
            }
        }
        return first;
    }
     private int lastOccurance(int[] numsArray, int targetValue){
        int l=0;
        int h=numsArray.length-1;
        int last = -1;
         while(l<=h){
            int m = l+(h-l)/2;
            if(numsArray[m] == targetValue){
                last = m;
                l=m+1;
            }else if(targetValue>numsArray[m]){
               l=m+1;
            }else{
              h=m-1;
            }
        }
        return last;
    }
}