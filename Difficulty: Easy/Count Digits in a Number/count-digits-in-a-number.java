class Solution {
    public static int countDigits(int n) {
        // Code here
        int count =0 ;
        int ree = countdigi(n,count);
        return ree;
    }
    public static int countdigi(int n,int count){
        if(n==0){
            return (count==0)?1:count;
        }
        return countdigi(n/10,count+1);
    }
}
