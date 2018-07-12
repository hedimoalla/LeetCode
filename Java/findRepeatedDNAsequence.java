class Solution{
    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> repeats = new ArrayList<>();
        if(s.length() <= 10) {
            return repeats;
        }
        int low = 0;
        int high = 10;
        HashSet<String> seen = new HashSet<>();
        while (high <= s.length()) {
            String sub = s.substring(low, high);
            if (seen.contains(sub)) {
                if (!repeats.contains(sub)) {
                    repeats.add(sub);
                }
            } else {
                    seen.add(sub);
            }
            low++;
            high++;
        }
        return repeats;
    }
    public static void main(String[] args){
        String str = new String("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        List<String> results = new ArrayList<>();
        results = findRepeatedDnaSequences(str);
        System.out.println("Repeating 10-letter substrings from " + str + " are " + results);
    }
}