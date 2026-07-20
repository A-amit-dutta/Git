class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int ele : arr){
            mpp.put(ele,mpp.getOrDefault(ele,0)+1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            Integer value = entry.getValue();
            if(value>n/4) {
                ans = entry.getKey();
            }
        }
        return ans;
    }
}