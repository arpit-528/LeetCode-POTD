class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
          map.put (c, map.getOrDefault(c, 0) + 1);
        }
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        for(int count : map.values()){ 
          if(count % 2 == 0) {
            minEven = Math.min(minEven, count);
          } else {
            maxOdd = Math.max(maxOdd, count);
          }
        }
        return maxOdd - minEven;
    }
}
