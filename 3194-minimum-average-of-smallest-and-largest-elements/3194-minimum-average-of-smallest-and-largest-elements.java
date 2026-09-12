class Solution {
    public double minimumAverage(int[] nums) {
         Arrays.sort(nums);

        int st = 0;
        int end = nums.length - 1;

        List<Double> list = new ArrayList<>();

        while (st < end) {
        
        double avg =(nums[st] + nums[end]) / 2.0;
        list.add(avg);

        st++;
        end--;
    }
    double min = Integer.MAX_VALUE;
    for(double num : list){
        if(num < min){
            min = num;
        }
    }
    return min;
}
}