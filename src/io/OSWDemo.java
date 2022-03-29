package io;

/**
 * @author longma
 * @create 2022-03-29-14:44
 **/

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 字符流
 * java将流按照读写的数据单位划分为字节流与字符流
 * java.io.InoutStream和OutputStream是所有字节流输入和输出流的超类
 * java.io.Reader和Writer再而三所有字符输入和输出流的超类
 * 注:这两对超类直接是平级的，互相没有继承关系。
 *
 * Reader里定义了读取字符的相关方法，
 *Writer里定义了写出字符的相关方法。
 * 特点都是以char为单位。
 *
 * 转换流：
 * java.io.InoutStreamReader和OutputStreamWriter
 * 它们是常见的字符流实现类，同时是一对高级流。实际开发中我们不会直接使用它们，
 * 但是在流连接中它们是中要的一环。
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        //向文件osw.txt中写入文本数据
        FileOutputStream fos = new FileOutputStream("osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,StandardCharsets.UTF_8);
        String line ="摩擦摩擦，在光滑的马路牙子上打出溜滑~";
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        //字符流的write方法可以直接写出字符串，无需在手动转换为字节
        osw.write(line);
        System.out.println("写出完毕！");
        fos.close();
    }
}
