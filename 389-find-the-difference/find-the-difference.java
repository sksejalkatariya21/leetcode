class Solution {
    public char findTheDifference(String s, String t) {
      HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        if(t.length() == s.length()+1) {
            for (int i = 0; i < t.length(); i++) {
                tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
            }

            for (int i = 0; i < s.length(); i++) {
                smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
            }

            for (Character key : tmap.keySet()) {
                if (!smap.containsKey(key)) {
                    return key;
                }
                if (tmap.get(key) - smap.get(key) == 1) {
                    return key;
                }

            }
        }
        return ' ';   
}
}