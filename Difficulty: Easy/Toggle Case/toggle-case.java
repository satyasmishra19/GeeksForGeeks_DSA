class Solution {
    public String toggleCase(String s) {
        // code here
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
            int asv = (int) ch;
            if(asv>=97){
                asv-=32;
            }else{
                asv+=32;
            }
            char ch1 = (char) asv;
            sb.append(ch1);
        }
        return sb.toString();
    }
}
