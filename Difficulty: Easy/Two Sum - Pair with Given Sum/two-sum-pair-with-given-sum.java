class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int s = arr[i]+arr[j];
            if(s==target){
                return true;
            }else if(s>target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}