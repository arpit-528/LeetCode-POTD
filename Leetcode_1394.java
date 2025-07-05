class Solution {
    public int findLucky(int[] arr) {
     int lucky_int = -1;
    HashMap <Integer, Integer> map = new HashMap<>();
    for(int num : arr) {
        map.put(num, map.getOrDefault(num, 0)+1);
    }
    for(int lucky : map.keySet()) {
        if(lucky == map.get(lucky)){
            lucky_int = Math.max(lucky_int, lucky);
        }
    }
    return lucky_int;
    }
}
