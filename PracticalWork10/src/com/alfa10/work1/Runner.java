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
        System.out.println("===========");
        ListIterator<String> arrListIterator = arrayList.listIterator(10);
        ListIterator<String> linkedlistIterator = linkedList.listIterator(1);

        while (arrListIterator.hasPrevious()) {
//            System.out.println("previous index " +arrListIterator.previousIndex());
//            System.out.println("previous  " +arrListIterator.previous());
            if (!(arrListIterator.previousIndex() % 2 == 0))
                linkedlistIterator.add(arrListIterator.previous());
            arrListIterator.previous();
        }
        for (String s : linkedList) {
            System.out.println(s);
        }
//        while (linkedlistIterator.hasNext()) {
//            System.out.println(linkedlistIterator.next());
//        }
    }
}
