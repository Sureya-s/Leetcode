class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        for(int i = 0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        int len = nums.length;
        for(int a = len;a <=len*2-1;a++){
            arr[a] = nums[a-len];


        }
        return arr;
        
    }
}
