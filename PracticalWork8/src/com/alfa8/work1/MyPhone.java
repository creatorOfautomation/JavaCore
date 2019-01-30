package com.alfa8.work1;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhone {

    private MyPhoneBook myPhoneBook;
    public MyPhone() {
        myPhoneBook = new MyPhoneBook();
    }

    public class MyPhoneBook {

         class PhoneRecord{
            private String name;
            private String phone;

            public PhoneRecord(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            public String getName() {
                return name;
            }

            public String getPhone() {
                return phone;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            @Override
            public String toString() {
                return getClass().getSimpleName() +
                        " name='" + name + '\'' +
                        ", phone='" + phone + '\'';
            }
        }

        private int counter = 0;
        private PhoneRecord[] phoneRecords = new PhoneRecord[8];

        public PhoneRecord[] getPhoneRecords() {
            return phoneRecords;
        }

        public boolean addPhoneNumber(String name, String phoneNumber) {

            if (counter < phoneRecords.length) {
               PhoneRecord record = new PhoneRecord(name, phoneNumber);
                phoneRecords[counter] = record;
                counter++;
                return true;
            }
            return false;
        }

        public void printPhoneBook() {
            for (int i = 0; i < counter; i++) {
                System.out.println(phoneRecords[i].toString());
            }
        }

        public void printPhoneBook(PhoneRecord[] record) {

            for (int i = 0; i < counter; i++) {
                System.out.println(record[i].toString());
            }
        }

        public PhoneRecord[] sortByName() {
            PhoneRecord[] copyPhones = Arrays.copyOf(phoneRecords, counter);
            Arrays.sort(copyPhones, new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    String name1 = ((PhoneRecord) o1).getName();
                    String name2 = ((PhoneRecord) o2).getName();
                    return name1.compareTo(name2);
                }
            });
            return copyPhones;
        }
    }

    public void swichOn() {
        System.out.println("Loading phone records ...");

        myPhoneBook.addPhoneNumber("Name", "123");
        myPhoneBook.addPhoneNumber("name1", "456");
        myPhoneBook.addPhoneNumber("name1", "45");
        myPhoneBook.addPhoneNumber("ame1", "4569");
        myPhoneBook.addPhoneNumber("me1", "458");
        myPhoneBook.addPhoneNumber("ame2", "457");
        System.out.println("Loading is completed");
    }

    public void call(int number) {

        if (number < 0 || number > myPhoneBook.counter) {
            System.out.println("There are no contacts");
            return;
        }
        System.out.println("Calling to " + myPhoneBook.phoneRecords[number]);
    }

    class Camera {

    }
    class Blotooth{}

    class PowerOnButton{}

    static class PhoneBattery{}

    class PhoneDisplay{}

    class PhoneSpiker{ }

}
