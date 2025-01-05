class Solution {
    public boolean isAnagram(String s, String t) {
        // Check if the lengths are equal
        if (s.length() != t.length()) {
            return false;
        }

        // Create a HashMap to store character counts
        HashMap<Character, Integer> mp = new HashMap<>();
        int n = s.length();

        // Count characters in the first string
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        // Decrease counts based on the second string
        for (int i = 0; i < n; i++) {
            char ch = t.charAt(i);
            if (!mp.containsKey(ch) || mp.get(ch) == 0) {
                return false;
            }
            mp.put(ch, mp.get(ch) - 1);
        }

        // Check if all counts are zero
        for (int count : mp.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}