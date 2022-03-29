package io;

/**
 * @author longma
 * @create 2022-03-29-16:54
 **/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 自行完成流连接创建PrintWriter
 *
 * 简易记事本工具
 * 程序启动后，将用户在控制台上输入的每一行字符串都按行谢尔到文件note.txt中
 * 单独输入exit时，程序退出。
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
//        FileOutputStream fos = new FileOutputStream("pw2.txt",true);
//        OutputStreamWriter osw =new OutputStreamWriter(fos, StandardCharsets.UTF_8);
//        BufferedWriter bw =new BufferedWriter(osw);
//        PrintWriter pw = new PrintWriter(bw);
//        pw.println("中华儿女");
//       System.out.println("写出完毕！");
//        pw.close();


        Scanner scan = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("mote.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw);

        String input;
        while (true){
            System.out.println("请输入内容：");
            input = scan.nextLine();
            if(!"exit".equals(input)) {
                pw.println(input);
            }else{
                pw.close();
                return;
            }
        }


    }
}
