package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author longma
 * @create 2022-03-28-11:12
 **/
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("music");
        FileOutputStream fos = new FileOutputStream("music_vp");

        int d;
        while ((d = fis.read())!=1){
            fos.write(d);
        }
        System.out.println("复制完毕！");
        fis.close();
        fos.close();

    }
}
