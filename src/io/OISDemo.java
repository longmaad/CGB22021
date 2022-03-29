package io;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author longma
 * @create 2022-03-29-11:34
 **/

public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        person person= (person) ois.readObject();
        System.out.println(person);
        ois.close();
    }
}
