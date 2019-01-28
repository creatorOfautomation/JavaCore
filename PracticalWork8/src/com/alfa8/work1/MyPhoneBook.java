package com.alfa8.work1;

public class MyPhoneBook {

    static class PhoneRecord{
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
}
