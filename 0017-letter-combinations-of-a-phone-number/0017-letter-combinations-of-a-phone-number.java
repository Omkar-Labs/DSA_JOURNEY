class Solution {
    public List<String> letterCombinations(String digits) {
        Solution sl = new Solution();
        return sl.letter("",digits);
    }

     public  List<String> letter(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();
        int digit = Integer.parseInt(up.substring(0, 1));
        for (int i = 3 * (digit - 2); i <= 3 * (digit - 1); i++) {
            char ch;
            if((digit !=7 && digit !=9) && i == 3*(digit-1)){
                continue;
            }
            if(digit > 7) {
                 ch = (char) ('a' + i + 1);
            }
            else
                ch = (char)('a' + i);

            list.addAll(letter(p+ch,up.substring(1)));

        }
        return list;
    }
}