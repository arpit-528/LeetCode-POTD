class Solution {
    public int maxDiff(int num) {
        String s = String.valueOf(num);
        char toreplaceMax = ' ';
        //finding max
       for(char c : s.toCharArray()) {
        if(c!='9') {
            toreplaceMax = c;
            break;
        }
       }
       String replaceMax = s.replace(toreplaceMax, '9');

       //finding min
       char toreplaceMin = ' ';
       char replacement = ' ';
       if(s.charAt(0) != '1') {
        toreplaceMin = s.charAt(0);
        replacement = '1';
       } else {
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) != '0' && s.charAt(i) != '1') {
                toreplaceMin = s.charAt(i);
                replacement = '0';
                break;
            }
        }
       }
       String replaceMin = s.replace(toreplaceMin, replacement);

       int a = Integer.parseInt(replaceMax);
       int b = Integer.parseInt(replaceMin);
       return a-b;
  } 
}
