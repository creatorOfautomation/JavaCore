package com.alfa13.work1;

@FunctionalInterface
public interface MyConverter {

    String convertString(String t);

    static boolean isNull(String s) {
        return s == null;
    }

}
