import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class isAnagram {
//. Count frequency of each char in s → store in a map
//2. For each char in t → decrease its count in the map
//3. If any count goes negative → not an anagram
//4. If all counts are zero → anagram ✅
public static boolean isAnagram(String s, String t) {

    HashMap<Character,Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for (char c : t.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) - 1);
    }
    for (int count : map.values()) {
        // what condition means it's NOT an anagram?
        if (count!=0){
            return false;
        }
    }
return true;



}


//        public static boolean isAnagram(String s, String t) {//  O(nlogn),O(n)
//            if(s.length()!=t.length()) {
//                return false;
//            }
//
//           char[] sArr = s.toCharArray();
//            char[] tArr = t.toCharArray();
//            Arrays.sort(sArr);
//            Arrays.sort(tArr);
//
//           return Arrays.equals(sArr,tArr);
//    }

    public static void main(String[] args) {
        String s= "arct";
        String t= "cart";
        System.out.println(isAnagram(s,t));
    }
}
