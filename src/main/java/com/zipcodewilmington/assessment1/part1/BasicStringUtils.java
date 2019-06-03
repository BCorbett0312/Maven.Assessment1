package com.zipcodewilmington.assessment1.part1;


import java.lang.*;


/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String upperCase = str.substring(0,1).toUpperCase() + str.substring(1);
        return upperCase;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        reversed.append(str);
        reversed = reversed.reverse();
        return reversed.toString();
    }







    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        String reversed = reverse(str);
        String revAndCap = camelCase(reversed);
        return revAndCap;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String removeCharacters = "";
        for (int i = 1; i < str.length()-1; i++){
            removeCharacters += str.charAt(i);
        }
        return removeCharacters;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] invertCasing = str.toCharArray();
        for (int i = 0; i<str.length(); i++){
            char change = invertCasing[i];
            if(Character.isUpperCase(change)) {
                invertCasing[i] = Character.toLowerCase(change);
            }
            else if(Character.isLowerCase(change)){
                invertCasing[i] = Character.toUpperCase(change);
            }
        }




        return new String(invertCasing);
    }
}
