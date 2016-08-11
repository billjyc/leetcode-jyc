public class Solution {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        if(nums == null || nums.size() == 0) {
            return -1;
        }
        int majorityNum = 0;
        int majority = -1;
        for(int i = 0; i < nums.size(); i++) {
            if(majorityNum == 0) {
                majority = nums.get(i);
                majorityNum++;
            } else if(majority == nums.get(i)) {
                majorityNum++;
            } else {
                majorityNum--;
            }
        }
        return majority;
    }
}