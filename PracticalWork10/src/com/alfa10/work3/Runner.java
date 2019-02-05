package com.alfa10.work3;

public class Runner {

    public void run() {
        MyTranslator translator = new MyTranslator();

        translator.addWords("I","Я");
        translator.addWords("have","маю");
        translator.addWords("pen","ручка");
        translator.addWords("Pen4", "pen4");

        String i_have_pen = translator.translate("I have pen");

        System.out.println(i_have_pen);
    }
}
