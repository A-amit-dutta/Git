class Solution {
    // public long gcdSum(int[] arr) {
    //     int n = arr.length ;
    //     long ans = 0L;
    //     int mx = arr[0];
    //     int[] prefixGcd = new int[n]; // i can use the given array also
    //     prefixGcd[0] = mx;
    //     for(int i=1;i<n;i++){
    //         mx = Math.max(mx,arr[i]);
    //         prefixGcd[i] = gcd(arr[i],mx);
    //     }
    //     Arrays.sort(prefixGcd);
    //         int i = 0,j = n-1;
    //         while(i<j){
    //             ans += (long) gcd(prefixGcd[i],prefixGcd[j]);
    //             i++;
    //             j--;
    //         }
    //     return ans;
    // }

    public long gcdSum(int[] arr) {
        int n = arr.length ;
        long ans = 0L;
        int mx = arr[0];
        for(int i=1;i<n;i++){
            mx = Math.max(mx,arr[i]);
            arr[i] = gcd(arr[i],mx);
        }
        Arrays.sort(arr);
            int i = 0,j = n-1;
            while(i<j){
                ans += (long) gcd(arr[i],arr[j]);
                i++;
                j--;
            }
        return ans;
    }

    public int gcd(int a , int b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }
}