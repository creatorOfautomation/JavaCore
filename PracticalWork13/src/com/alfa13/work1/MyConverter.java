package com.alfa13.work1;

@FunctionalInterface
public interface MyConverter<T extends String> {

    T convertString(T t);

    static boolean isNull(String s) {
        return s == null;
    }

}
