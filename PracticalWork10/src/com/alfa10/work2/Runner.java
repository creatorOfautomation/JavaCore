package com.alfa10.work2;

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Runner {

    public void run() {

        MyNumGenerator generator = new MyNumGenerator(10, 8);

        List<Integer> list = generator.generateList();
        ListIterator iterator = list.listIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        generator.setNumOfElm(10);
        generator.setMaxNumb(11);

        Set<Integer> integers = generator.generatorSet();
        System.out.println(integers);
        }
}
