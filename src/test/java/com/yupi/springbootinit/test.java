package com.yupi.springbootinit;

/**
 * @author cat
 */
public class test {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "def";
        String res = mergeAlternately(word1,word2);
        System.out.println(res);
    }
    public static String mergeAlternately(String word1, String word2) {
        int len = word1.length()+word2.length();
        char[] newWord = new char[len];
        int i=0,j=0,x=0;
        while(i<word1.length()||j<word2.length()){
            if(i<word1.length())
                newWord[x++] = word1.charAt(i++);
            if(j<word2.length())
                newWord[x++] = word2.charAt(j++);
        }
        return newWord.toString();
    }
}
