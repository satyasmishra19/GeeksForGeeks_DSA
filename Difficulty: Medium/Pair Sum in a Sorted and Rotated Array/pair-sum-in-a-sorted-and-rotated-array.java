
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        int n =arr.length;
        int bi = -1;
        for(int i=0 ;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                bi=i;
                break;
            }
        }
        if (n < 2) return false;
        
        if (bi == -1) {
            int left = 0, right = n - 1;
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == target) return true;
                else if (sum < target) left++;
                else right--;
            }
            return false;
        }
        int lp = (bi+1)%n;
        int rp = bi;
        while(lp!=rp){
            int k =arr[rp]+arr[lp];
            if(k == target){
                return true;
            }else if(k > target){
                rp = (rp+n-1)%n;
            }else{
                lp = (lp+1)%n;
            }
        }
        return false;
    }
}
