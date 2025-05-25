class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        int length = 0;
        boolean centerUsed = false;
        for(String word : words) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        for(String word : map.keySet()) {
            // creating a reverse for word
            String rev = new StringBuilder(word).reverse().toString();

            if(!word.equals(rev)) {  //if map don't contains reverse
                if(map.containsKey(rev)) {
                int pairs = Math.min(map.get(word), map.get(rev));
                length = length + pairs * 4;
                //update the frequency of the map 
                map.put(word, map.get(word) - pairs);
                map.put(rev, map.get(rev) - pairs);
                }
            }else {  
                int count = map.get(word);
                int pairs = count/2;
                length = length + pairs * 4;
                map.put(word, count%2);

                if(centerUsed == false && map.get(word) == 1){
                    length += 2;
                    centerUsed = true;
                }
            }
         
        }
        return length;
    }
}
