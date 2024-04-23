package ArraysHashing;

public class isAnagram {
    public static void main(String[] args) {

    }

    /**
     * Link: https://leetcode.com/problems/valid-anagram/
     *
     *
     * @param s the anagram
     * @param t the other word
     * @return if it is an anagram
     */
    public boolean isAnAnagram(String s, String t){
        //check if they're equal length
        if (s.length() != t.length()){
            return false;
        }

        int[] checkingArray = new int[26];
        //loop and literate at index positions for the characters
        for (int i = 0; i < s.length() ; i++) {
            int anagramIndex = s.charAt(i) - 'a';
            int testIndex = t.charAt(i) - 'a';
            checkingArray[anagramIndex]++;
            checkingArray[testIndex]--;
        }

        //check to see if everything is 0
        for (int i = 0; i < checkingArray.length; i++){
            if (checkingArray[i] != 0){
                return false;
            }
        }
        return true;
    }

    //subtracting a character by 'char'-'a' results in their index positions of 0-25
}
