package com.alfa6.work3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Runner {


    public void run() {


        User[] users = new User[]{
                new User("name1", "name2", 220),
                new User("name1", "name1", 220),
                new User("name5", "name5", 220),
                new User("name4", "name4", 220)
        };

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("./out.txt")))) {

            for (int i = 0; i < users.length; i++) {
                users[i].writeExternal(out);
            }

        } catch (IOException e) {
            System.out.println(e);
        }

        List<User> usrs = new ArrayList<>();

        try (ObjectInputStream in = new ObjectInputStream((new FileInputStream("./out.txt")))) {
            User user ;
            while ((user = (User) in.readObject()) != null) {
                usrs.add(user);
            }
        } catch (IOException | ClassNotFoundException e) {

            System.out.println(e);
        }
        for (User u :
                usrs) {
            System.out.println(u);
        }
    }
}
