package com.zipcodewilmington;


import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        int counter = 0;
        for (int i=0; i < array.length; i++){
            Matcher m = Pattern.compile(value).matcher(array[i]);
            while (m.find()) {
                counter++;
            }

        }
        if (counter > 0)
            return true;
        else {return false;}



    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        Collections.reverse(Arrays.asList(array));


        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int length = array.length;
        for(int i = 0; i < array.length; i++){
            String start = array[i];
            String end = array[--length];

            if (!start.equals(end)){
                return false;
            }

        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] confirm = new boolean[26];
        int check = 0;

        String sentence = Arrays.toString(array);

        for (int i = 0; i < sentence.length(); i++){
            if ('A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z'){
                check = sentence.charAt(i) - 'A';

            }
            else if('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z'){
                check = sentence.charAt(i) - 'a';
            }
            confirm[check] = true;
        }

        for (int i = 0; i <= 25; i++){
            if (confirm[i] == false){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {

            Matcher m = Pattern.compile(value).matcher(array[i]);
            while (m.find()) {
                counter++;
            }

        }
        return counter;
    }








    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove){
        List<String> list = new ArrayList<String>(Arrays.asList(array));
        list.remove(valueToRemove);
        array = list.toArray(new String[0]);
        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> mylist = new ArrayList<String>(Arrays.asList(array));



        for(int i = 1; i < mylist.size(); i++) {

            if (mylist.get(i - 1).equals(mylist.get(i))) {
                mylist.remove(i);
                i--;
            }
            System.out.println(mylist);

        }

        array = mylist.toArray(new String[0]);
        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {


        List<String> mylist = new ArrayList<String>(Arrays.asList(array));
        List<String> updatedList = new ArrayList<String>();
        updatedList.add(array[0]);



        for(int i = 1; i < array.length; i++){

            if (array[i-1].equals(array[i])) {
                updatedList.set(updatedList.size() -1,updatedList.get(updatedList.size() - 1) + array[i]);
            }
            else {
                updatedList.add(mylist.get(i));
            }

        }

        System.out.println(updatedList);


        array = updatedList.toArray(new String[0]);
        return array;
    }


}
