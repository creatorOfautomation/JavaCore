package com.alfa10.work1;

import java.util.*;

public class Runner {

    public void run() {
        //1
        List<String> arrayList = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            arrayList.add("Number_" + i);
        }
        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println("=============Linked List=============");
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add("num_" + i);
        }
        for (String s : linkedList) {
            int index = (int) (Math.random() * 10);
            linkedList.set(index, s);
        }
        for (String s : linkedList) {
            System.out.println(s);
        }
        System.out.println("======================SORTED LIST======================");
        ListIterator<String> arrListIterator = arrayList.listIterator(10);
        ListIterator<String> linkedListIterator = linkedList.listIterator(0);
        while (arrListIterator.hasPrevious()) {
            if (arrListIterator.previousIndex() % 2 != 0) {
                linkedListIterator.next();
                linkedListIterator.set(arrListIterator.previous());
            }
            linkedListIterator.next();
            arrListIterator.previous();
        }
        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}
