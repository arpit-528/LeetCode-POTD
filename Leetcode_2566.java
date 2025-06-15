class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        char temp1 = ' ';
        char temp2 = ' ';
      // finding maximum 
      for(char c : s.toCharArray()) {  // or toCharArray
        if(c!='9') {
            temp1 = c;
            c = '9';
            break;
        }
      }
      String replaceMax = s.replace(temp1, '9');
      int max = Integer.parseInt(replaceMax);

      // fidning minimum 
      for(char c : s.toCharArray()) {
        if(c!='0'){
            temp2 = c;
            c = '0';
            break;
        }
      }
      String replaceMin = s.replace(temp2, '0');
      int min = Integer.parseInt(replaceMin);

      return max-min;
    }
}
