package io;

/**
 * @author longma
 * @create 2022-03-28-15:55
 **/
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
/**
 * 完成一个简易记事本工具
 * 要求：程序启动后，将用户在控制台上输入的每一行字符串都写入文件note.txt中。
 * 当用户单独输入exit时程序退出。
 */
public class NoteDemo {
    public static void main(String[] args) throws IOException {
        String abb ;
        Scanner scan = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("note.txt", true);
        while(true){
            System.out.println("请输入内容：");
            abb = scan.nextLine();
            byte[] data= abb.getBytes(StandardCharsets.UTF_8);
            if("exit".equals(abb))
                return;
            fos.write(data);
            fos.close();
        }

    }


}
