package io;

/**
 * @author longma
 * @create 2022-03-29-10:31
 **/

import java.io.*;

/**
 * 对象流
 * java.io.ObjectOutputStream和ObjectInputStream
 * 它们是一对高级流，在流连接中的作用是进行对象的序列化与反序列化
 * 对象序列化：将对象按照其结构转化为一组字节
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        /*
        将一个person对象写入文件
        1：先将person对象转换为一组字节
        2：将字节写入文件

        流连接：
                  序列化      持久化
                   v           v
        对象----》对象流----》文件流------》文件
         */

        String name= "苍老师";
        int age = 18;
        String gender ="女";
        String[] otherInfo ={"是一个演员","来着霓虹","台词较少","广大男同学的启蒙老师"};
        person p = new person(name,age,gender,otherInfo);
        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        /*
        对象输出流提供了序列化方法
        void writeObject(Object obj)
        将给定的对象转换为一组字节并写出，但是需要注意：写出的对象所属的类必须实现接口：
        java.io.Serializable
        否则该方法会抛出异常：java.io.NotSerializableException
         */

        oos.writeObject(p);
        System.out.println("写出完毕！");
        oos.close();

    }
}
