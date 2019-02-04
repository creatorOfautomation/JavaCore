package com.alfa10.work2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyNumGenerator {

    private int numOfElm;
    private int maxNumb;

    public void setNumOfElm(int numOfElm) {
        this.numOfElm = numOfElm < 0 ? -numOfElm : numOfElm;
    }

    public void setMaxNumb(int maxNumb) {
        this.maxNumb = maxNumb;
    }

    public MyNumGenerator(int numOfElm, int maxNumb) {
        setNumOfElm(numOfElm);
        this.maxNumb = maxNumb;
    }

    public List<Integer> generateList() {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numOfElm; i++) {
            list.add(((int) (Math.random() * maxNumb)));
        }
        return list;
    }

    public Set<Integer> generatorSet() throws InvalidNumberOfElementsException {

        if (Math.abs(maxNumb) < numOfElm)
            throw new InvalidNumberOfElementsException("Max number cannot be smaller then range");
        Set<Integer> set = new HashSet();
        while (set.size() <= numOfElm) {
            set.add(((int) (Math.random() * maxNumb)));
        }
        return set;
    }

}
