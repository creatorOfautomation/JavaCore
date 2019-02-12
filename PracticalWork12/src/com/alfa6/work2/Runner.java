package com.alfa6.work2;

import java.io.*;

public class Runner {

    public void run() {
        File file = new File("./in.txt");

        User user = createUser("name", "last", 12);
        User user1 = createUser("name1", "last1", 12);
        User user2 = createUser("name2", "last2", 12);
        try {
            writeObjectToFile(user, file);
            writeObjectToFile(user1, file);
            writeObjectToFile(user2, file);
            printFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private User createUser(String name, String lastName, int age) {
        return new User(name, lastName, age);
    }

    private void writeObjectToFile(User user, File file) throws IOException {
        try (RandomAccessFile outputStream = new RandomAccessFile(file, "rw")) {
            outputStream.seek(outputStream.length());
            outputStream.writeUTF(System.lineSeparator());
            outputStream.writeBytes(user.toString());
        }
    }

    private void printFile(File file) throws IOException {
        try (RandomAccessFile outputStream = new RandomAccessFile(file, "rw")) {
            String string = null;
            while ((string = outputStream.readLine()) != null) {
                System.out.println(string);
            }
        }
    }
}
