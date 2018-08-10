class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet=new HashSet<>(wordList);
        Set<String> reached=new HashSet<>();
        reached.add(beginWord);
        wordSet.remove(beginWord);
        int level=1;
        while(!reached.isEmpty()) {
            Set<String> reachedNext=new HashSet<>();
            for(String s:reached) {
                for(int i=0;i<s.length();i++) {
                    char[] c=s.toCharArray();
                    //System.out.println(Arrays.toString(c) + " " + i);
                    for(char j='a'; j <= 'z'; j++) {
                        c[i] = j;
                        String newS = new String(c);
                        if(wordSet.remove(newS)) {
                            reachedNext.add(newS);
                            if(endWord.equals(newS)) 
                                return level + 1;
                        }
                    }
                }
            }
            reached=reachedNext;
            level++;
        }
        return 0;
    }
}