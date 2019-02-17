package com.alfa6.work1;

import java.io.*;

public class Runner {

    public void run() {

        Employee employee = new Employee();
        employee.setAddress("address");
        employee.setName("Name");
        employee.setNumber(123);
        employee.setSSN(3);
        System.out.println("Employee1");
        System.out.println("\t" + employee);

        File file = new File("./in.txt");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(employee);
            System.out.println("Object successfully added to file");
        } catch (FileNotFoundException e) {
            System.out.println("File Not found");
        } catch (IOException e) {
            System.out.println(e);
        }
        Employee employee1 = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("./in.txt")))) {
            employee1 = (Employee) inputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File Not found");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("Copied employee ");
        System.out.println("\t" + employee1);

    }
}
