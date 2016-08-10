public class Solution {
    public String reverseVowels(String s) {
        if(s == null || s.length() <= 1) {
            return s;
        }
        int left = 0, right = s.length() - 1;
        char[] chs = s.toCharArray();
        while(left < right) {
            if(!isVowel(chs[left])) {
                left++;
                continue;
            }
            if(!isVowel(chs[right])) {
                right--;
                continue;
            }
            //System.out.println(left + ", " + right);
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
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A'
            || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}