import java.util.HashMap;

class Solution {
    public int minimumLength(String s) {
      
        HashMap<Character, Integer> mp = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        
        int ans = 0;
        
        for (int count : mp.values()) {
        
            while (count >= 3) {
                count -= 2; 
            }
            ans += count;
        }
        
        return ans;
    }
}
