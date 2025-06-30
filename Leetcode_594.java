class Solution {
    public int findLHS(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : nums) {
            int min = num;
            int max = num+1;
            if(map.containsKey(max)) {
                result = Math.max(result,map.get(min) + map.get(max));
            }
        }
        return result;
     }
}
