package io; /**
 * @author longma
 * @create 2022-03-28-11:55
 **/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 通过提高每次读写的数据量，减少实际读写次数，可以提高读写效率。
 *
 * 单字节的读写属于随机读写形式。
 * 一组字节的读写属于块读写形式。
 * 大多数的硬件快读写都比随机读写性能好，尤其机械硬盘上体现最为明显。
 *
 * InputStream和OutputStream上定义了块读写数据的相关方法。
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:/作业/CGB面试题/第一阶段面试题.docx");
        FileOutputStream fos = new FileOutputStream("D:/作业/CGB2202——SE/src/第一阶段面试题_cp.docx");
        /*
        InputStream中提供了块读操作
        int read(byte[] data)

         */
        /*
        8位2紧张 00000000
        1024b 1kb
        1024kb 1mb
        1024mb 1gb
        1024gb 1tb
         */
        byte[] data = new byte[1024*10];//10kb
         int len;//每次实际读取到的字节数

        long start = System.currentTimeMillis();
         while ((len = fis.read(data))!=-1){
             fos.write(data);
             fos.write(data,0,len);
         }
         long end =System.currentTimeMillis();
         System.out.println("复制完毕！耗时时间"+(end-start)+"ms");
         fis.close();
         fos.close();
    }
}
