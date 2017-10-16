
import java.util.*;
import java.lang.*;
import java.io.*;


public class longestSubString {
    public static int longestSubString(String str) {
        HashMap<Character, Integer> seen = new HashMap<>();
        int result = 0;
        int longest = 0;
        for (int i = 0; i < str.length(); i += 1) {
            char curr = str.charAt(i);
            if (longest < result) {
                longest = result;
            }
            if (seen.containsKey(curr)) {
                i = seen.get(curr);
                seen = new HashMap<>();
                result = 0;
            }
            else {
                result += 1;
                seen.put(curr, i);
            }
        }
        return longest;
    }
    
    public static void main(String args[]) {
        
        //Test1
        int result1 = longestSubString.longestSubString("abadfaktmbpl");
        System.out.println("The result of abadfaktmbpl is " + result1); 
        //Test2
        int result2 = longestSubString.longestSubString("aaa");
        System.out.println("The result of aaa is " + result2); 
        
        //Test3
        int result3 = longestSubString.longestSubString("abacd");
        System.out.println("The result of abacd is " + result3); 
        
        //Test4
        int result4 = longestSubString.longestSubString("abblmksopp");
        System.out.println("The result of abblmksopp is " + result4); 
    }
}