package io;

/**
 * @author longma
 * @create 2022-03-28-17:18
 **/

import java.io.*;

/**
 * java将流分为两类：节点流与处理流
 * 节点流：又称为低级流，是实际连接我们的程序与另一端的"管道"，负责实际读写数据的流。
 *        记住：读写一定是建立在低级流的基础上进行的！
 * 处理流：又称为高级流，过滤流。不能独立存在，必须连接在其他流上，目的是当数据流经它
 *        时对数据进行某种加工处理，将我们的相应操作。
 * 实际开发中，我们总是串联一组高级流到低级流上，完成一个复杂的数据读写操作，这个过程
 * 也称为流的连接，这是IO的精髓
 *
 * 缓冲流
 * java。io。BufferedInputStream和BufferedOutputStream
 */
public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("");
        BufferedInputStream bis=new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("D:/");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] data = new byte[1024*10];//10kb
        int len;//每次实际读取到的字节数

        int d=0;
        long start = System.currentTimeMillis();
        while ((d= bis.read())!=-1){
            bos.write(d);

        }
        long end =System.currentTimeMillis();
        System.out.println("复制完毕！耗时时间"+(end-start)+"ms");
        fis.close();
        fos.close();

    }
}
