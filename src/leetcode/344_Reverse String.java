public class Solution {
    public String reverseString(String s) {
        if(s == null || s.length() <= 1) {
            return s;
        }
        char[] chs = s.toCharArray();
        int left = 0, right = chs.length - 1;
        while(left < right) {
            swap(chs, left, right);
            left++;
            right--;
        }
        return String.valueOf(chs);
    }
    
    private void swap(char[] chs, int a, int b) {
        char temp = chs[a];
        chs[a] = chs[b];
        chs[b] = temp;
    }
}