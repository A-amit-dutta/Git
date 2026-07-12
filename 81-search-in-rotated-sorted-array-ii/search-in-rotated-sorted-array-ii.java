class Solution {
    public boolean search(int[] arr, int target) {
        for(int ele : arr){
            if(ele ==  target ) return true;
        }
        return false;
    }
}