package com.alfa9.work2;

import java.util.Arrays;

public class Runner {


    public void run() {

        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12};

        MyMixer<Integer> mixer = new MyMixer<>(integers);

        mixer.shuffle();
        Integer[] array = mixer.getArray();

        System.out.println(Arrays.toString(array));

    }
}
