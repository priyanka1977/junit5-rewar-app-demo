package org.example;

import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Ctrl+1 with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        /*String str = null;
        Integer val =  Integer.valueOf(str);
        System.out.println(val); */

        List<Integer> numberList = Arrays.asList(1, 2, 3, 4);
        // stream API
        /*int sum = 0;
        for(Integer num: numberList){
            System.out.println(num * num);
            sum+= num;
        }*/
        // java 8 - stream api
      int result =  numberList.stream().mapToInt((num) -> Integer.valueOf(num)).sum();
        System.out.println("Sum = " + result);
     // test if sum > 5
        //assertEquals(5, result);



    }
}