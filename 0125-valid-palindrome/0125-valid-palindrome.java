class Solution {
    public boolean isPalindrome(String s) {
        s =  s.toLowerCase().trim().replaceAll("[^a-zA-Z0-9]","");
        int start = 0;
        int end = s.length() - 1;
        boolean flag = true;
        while(start <= end) {
            if(s.charAt(start) != s.charAt(end)) {
                flag = false;
                break;
            }
            start++;
            end--;
        }
        return flag;
    }
}