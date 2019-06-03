package com.zipcodewilmington.assessment1.part2;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String[] splitUp = sentence.split(" ");



        return splitUp;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String firstWord = getWords(sentence)[0];

        return firstWord;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String toBeReversed = getFirstWord(sentence);
        toBeReversed = BasicStringUtils.reverse(toBeReversed);

        return toBeReversed;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String toBeCamelAndReverse = reverseFirstWord(sentence);
        toBeCamelAndReverse = BasicStringUtils.camelCase(toBeCamelAndReverse);

        return toBeCamelAndReverse;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        //String[] splitUp = str.split("");
        String removeChar = str.substring(0, index) + str.substring(index+1);
        return removeChar;
    }

}
