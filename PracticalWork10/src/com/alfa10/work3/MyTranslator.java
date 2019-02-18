package com.alfa10.work3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyTranslator {

    private Map<String, String> dictionary;

    public MyTranslator() {
        dictionary = new HashMap<>();
    }

    public void addWords(String word, String transl) {

        dictionary.put(word, transl);

    }

    public String translate(String phrase) {

        String transPhrases = "";
        String noTrans = "";
        String[] words = phrase.split(" ");
        for (String s : words) {
            if (dictionary.containsKey(s)) {
                transPhrases += dictionary.get(s) + " ";
            } else {
                transPhrases += s;
                noTrans += s + ", ";
            }
        }
        if (noTrans.length() > 0) {
            System.out.println(String.format("U hab to add translation for next words %s", noTrans));

        }
        return transPhrases;
    }
}
