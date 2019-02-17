package com.alfa13.work1;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Runner {

    public void run() {
        //1
        Integer[] array = createIntArray();
        System.out.println("Non-sorted array " + Arrays.toString(array));
        Arrays.sort(array, (x, y) -> -x.compareTo(y));
        System.out.println("Sorted array " + Arrays.toString(array));
        System.out.println("------------------- Strings -------------------");
        List<String> strList = createStrArray();
        System.out.println("Non-sorted array " + Arrays.toString(strList.toArray()));
        String[] sortedArray = strList.toArray(new String[0]);
        Arrays.sort(sortedArray, (x, y) -> -x.compareToIgnoreCase(y));
        System.out.println("Sorted array " + Arrays.toString(sortedArray));
        //2
        int sumElem = sumElem(new int[]{1, 2, 3, 4, 5, -6, -7}, integer -> integer > 0);
        System.out.println("sumElem = " + sumElem);
        printString(strList, s -> s.startsWith("B"));


    }

    public Integer[] createIntArray() {

        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(101) - 50;
        }
        return arr;
    }

    public List<String> createStrArray() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("Boolean");
        list.add("Barbi");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("O");
        list.add("P");
        return list;
    }

    public int sumElem(int[] arr, Predicate<Integer> func) {

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (func.test(arr[i])) {
                res += arr[i];
            }
        }
        return res;
    }

    public void printString(List<String> s, Predicate<String> func) {

        for (String ss : s) {
            if (func.test(ss))
                System.out.println(ss);
        }
    }
}
