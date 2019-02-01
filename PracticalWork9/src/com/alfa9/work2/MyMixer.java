package com.alfa9.work2;

public class MyMixer<T> {

    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void shuffle() {
        int position;

        for (int i = 0; i < array.length; i++) {
            position = ((int) (Math.random() * array.length));
            T temp = array[i];

            array[position] = temp;

        }
    }
}
