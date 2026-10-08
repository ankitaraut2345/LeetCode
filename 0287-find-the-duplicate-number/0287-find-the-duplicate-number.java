class Solution {
    public int findDuplicate(int[] nums) {
       int n = nums.length;
       int slow = 0;
       int fast = 0; 
       slow = nums[slow];
       fast = nums[nums[fast]];

       while(fast != slow){
        slow = nums[slow];
        fast = nums[nums[fast]];
       }
       slow = 0;
       while(fast != slow){
        slow = nums[slow];
        fast = nums[fast];
       }
       return slow;
    }
}