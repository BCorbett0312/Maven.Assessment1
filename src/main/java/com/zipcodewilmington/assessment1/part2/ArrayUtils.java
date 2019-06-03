package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int counter = 0;
        for(int i=0; i<= objectArray.length-1; i++){
            if (objectArray[i] == objectToCount){
                counter++;
            }
        }

        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {
        List<Integer> list = new ArrayList<>(Arrays.asList());

        for(int i = 0; i < objectArray.length; i++){
            if (objectArray[i] != objectToRemove){
                list.add(objectArray[i]);
            }
        }
        objectArray = list.toArray(new Integer[0]);
        return objectArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Integer getMostCommon(Integer[] objectArray) {
        int count = 1;
        int tempCount;
        int popular = objectArray[0];
        int temp = 0;
        for (int i = 0; i < objectArray.length-1; i++){
            temp = objectArray[i];
            tempCount = 0;
            for (int j = 1; j< objectArray.length; j++){
                if(temp==objectArray[j]){
                    tempCount++;

                }
                if (tempCount > count) {
                    popular = temp;
                    count = tempCount;
                }
            }

        }


        return popular;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Integer getLeastCommon(Integer[] objectArray) {
        int count = 1;
        int tempCount;
        int unpopular = objectArray[0];
        int temp = 0;
        for (int i = 0; i < objectArray.length-1; i++){
            temp = objectArray[i];
            tempCount = 0;
            for (int j = 1; j< objectArray.length; j++){
                if(temp==objectArray[j]){
                    tempCount++;

                }
                if (tempCount < count) {
                    unpopular = temp;
                    count = tempCount;
                }
            }

        }


        return unpopular;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(objectArray));

        for (int i = 0; i < objectArrayToAdd.length; i++){
            list.add(list.size()-1, objectArrayToAdd[i]);
        }






        objectArray = list.toArray(new Integer[0]);


        return objectArray;
    }
}
