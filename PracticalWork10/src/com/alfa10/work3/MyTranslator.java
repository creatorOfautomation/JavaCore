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

     //   Iterator<Map.Entry<String, String>> iterator = dictionary.entrySet().iterator();

        String transPhrases = "";
        String[] words = phrase.split(" ");
        for (String s : words) {
            if (dictionary.containsKey(s)) {
                transPhrases += dictionary.get(s) + " ";
            }
        }
        return transPhrases;
    }

    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("dsf", "dsf");
        System.out.println(dictionary.get("1"));
    }
}
