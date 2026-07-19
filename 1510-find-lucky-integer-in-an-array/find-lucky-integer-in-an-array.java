class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> mpp = new HashMap<>();

        for (int ele : arr) {
            mpp.put(ele, mpp.getOrDefault(ele, 0) + 1);
        }

        int ans = Integer.MIN_VALUE;
        for (int key : mpp.keySet()) {
            if (key == mpp.get(key)) {
                ans =  Math.max(ans,key);
            }
        }
        if(ans == Integer.MIN_VALUE) return -1;
        return ans;
    }
}