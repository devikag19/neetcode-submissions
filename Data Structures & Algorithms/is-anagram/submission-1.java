class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars1=s.toCharArray();
        char[] chars2=t.toCharArray();

       if (chars1.length!=chars2.length){
        return false;
       }
       Arrays.sort(chars1);
       Arrays.sort(chars2);

       if (Arrays.equals(chars1,chars2)){
        return true;
       }
       return false;
    }
}
