package ru.job4j.algo.hash;

import java.util.*;

public class LongestUniqueSubstring {

    public static String longestUniqueSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        HashSet<Character> set = new HashSet<>();
        int start = 0;
        String longestSubstring;
        HashMap<Integer, String> strHashmap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            while (set.contains(currentChar)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(currentChar);

            if (start < end + 1) {
                longestSubstring = s.substring(start, end + 1);
                strHashmap.put(longestSubstring.length(), longestSubstring);
            }
        }
        Optional<String> strWithMaxLen = strHashmap.entrySet().stream()
                .max(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue);

        return strWithMaxLen.isPresent() ? strWithMaxLen.get() : "";
    }
}