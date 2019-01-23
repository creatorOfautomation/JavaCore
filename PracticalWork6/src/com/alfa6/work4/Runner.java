package com.alfa6.work4;

public class Runner {

    public void run() {
//1
      /*  Integer integer1 = Integer.valueOf(1000);
        Integer integer2 = Integer.valueOf("1000");
        Integer integer3 = 1000;
        Integer integer4 = new Integer(1000);
        Integer integer5 = new Integer("1000");
        System.out.println("1==2 -->" + (integer1 == integer2));
        System.out.println("1==3 -->" + (integer1 == integer3));
        System.out.println("1==4 -->" + (integer1 == integer4));
        System.out.println("2==3 -->" + (integer2 == integer3));
        System.out.println("2==4 -->" + (integer2 == integer4));
        System.out.println("2==5 -->" + (integer2 == integer5));*/

      //2
        System.out.println(compute(new Integer(12),new Long(12)));
        System.out.println(compute(new Integer(12), Long.valueOf(123123)));
    }

    public Double compute(Integer number, Long number2) {

        //return Double.parseDouble(String.valueOf(number + number2));
        //return Double.sum(number, number2);
        return new Double(number + number2);
    }



}
