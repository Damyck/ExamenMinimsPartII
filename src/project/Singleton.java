package project;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

import javax.jws.soap.SOAPBinding;
import java.util.*;

/**
 * Created by Marc on 18/11/2016.
 */
public class Singleton implements UserCommands {

    private static Singleton instance=null;
    private HashMap<Integer, User> users;
    private List<Etakemon> etaklist;
    private int cont=1;
    private int sum=1;
    private Singleton(){

        users = new HashMap<Integer, User>();
        etaklist = new ArrayList<Etakemon>();

    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    @Override
    public void insertUser(String name, String password) {

        User user = new User(name, password);
        users.put(cont, user);
        cont++;
        System.out.println(users.get(cont-1).name);

    }

    @Override
    public void modUser(String name, String password) {
        for (Map.Entry<Integer, User> entry : users.entrySet()) {
             if (name == entry.getValue().name) {
                 User us = users.get(entry.getKey());
                 us.name = name;
                 us.password=password;
                 users.put(entry.getKey(), us);

             }

        }
    }

    @Override
    public User showUser(String name) {
        User us=null;
        for (Map.Entry<Integer, User> entry : users.entrySet()) {
            if (name == entry.getValue().name) {
                us = entry.getValue();
            }

        }
        return us;
    }

    @Override
    public  List<Etakemon> showuserEtakemon(String name) {

        for (Map.Entry<Integer, User> entry : users.entrySet()) {
            if (name == entry.getValue().name) {
                etaklist = entry.getValue().etak;
                sum++;
            }

        }
        return  etaklist;
        //etaklist.get(1);


    }

    @Override
    public void addEtakemon(String name, Etakemon etakemon) {

        for (Map.Entry<Integer, User> entry : users.entrySet()) {
            if (name == entry.getValue().name) {
                User us = users.get(entry.getKey());
                us.addEtak(etakemon);
                users.put(entry.getKey(), us);
            }

        }
    }
}

