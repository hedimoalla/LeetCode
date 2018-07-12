class Solution {
    public static boolean isIsomorphic(String s, String t) {
        int len = s.length();
        if (len == 0){
            return true;
        }
        int [] recordS = new int [256];
        int [] recordT = new int [256];
        int label = 1;

        for(int i = 0; i < len; i++){
            int charS = s.charAt(i);
            int charT = t.charAt(i);
            if (recordS[charS] != recordT[charT])
                return false;
            if (recordS[charS] == 0){
                recordS[charS] = label;
                recordT[charT] = label;
                label++;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String one = new String("approach");
        String two = new String("deepadgo");
        if(isIsomorphic(one, two)) {
            System.out.println("Strings \"" + one + "\" and \"" + two + "\" are Isomorphic");
        } else
            System.out.println("Strings \"" + one + "\" and \"" + two + "\" are not Isomorphic");
    }
}
// egg add
