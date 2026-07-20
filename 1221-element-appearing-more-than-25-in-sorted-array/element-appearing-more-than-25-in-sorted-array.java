class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int cnt = 1;
        int presentEle = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i] == presentEle){
                cnt++;
                if(4*cnt>n)
                    return presentEle;
            }
            else{
                presentEle = arr[i];
                cnt = 1;
            }
        }
        return presentEle;
    }
}