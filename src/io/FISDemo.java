package io;




import java.io.FileInputStream;
import java.io.IOException;
/**
 * @author longma
 * @create 2022-03-28-10:21
 **/
public class FISDemo extends Throwable {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("./fos.dat");
        /*
        int read()
        读取一个字节，并以int型返回。返回的int值对应的2进制的低八位为读取到
        的字节数据。如果返回值为int的-1则表示读取到了流的末尾
        fos.dat
        00000001 00000010
        ^^^^^^^^
        int a = fis.read();
        d是2进制样子：
        00000000 00000000 0000000 00000001
        |-----------补24个0-------------| 读取的字节
         */


        int d = fis.read();
        System.out.println(d);
        /*
        fos.dat
        00000001 00000010 文件末尾了
                          ^^^^^^^^
                          int a = fis.read();
        d是2进制样子：
        00000000 00000000 0000000 00000001
        |-----------补24个0-------------| 读取的字节
         */
        d = fis.read();
        System.out.println(d);
         /*
        fos.dat
        00000001 00000010 文件末尾了
                          ^^^^^^^^
                          int a = fis.read();
        d是2进制样子：
        00000000 00000000 0000000 00000001
        |-----------补24个0-------------| 读取的字节
         */
        d = fis.read();
        System.out.println(d);
         /*
        fos.dat
        00000001 00000010 文件末尾了
                          ^^^^^^^^
                          int a = fis.read();
        d是2进制样子：
        00000000 00000000 0000000 00000001
        |-----------补24个0-------------| 读取的字节
         */
    }

}